# Define build arguments
ARG BASE_IMAGE_BUILD=mcr.microsoft.com/windows/servercore:ltsc2022
ARG BASE_IMAGE_RUNTIME=mcr.microsoft.com/windows/servercore:ltsc2022
ARG CHOCOLATEY_URL=https://chocolatey.org/install.ps1
ARG JAVA_PACKAGE=openjdk11
ARG JAVA_HOME_DIR="C:\\Program Files\\Eclipse Adoptium\\jdk-11.0.11.9-hotspot"

# Stage 1: Build Stage
FROM ${BASE_IMAGE_BUILD} AS builder

# Install Chocolatey and Java
RUN powershell -Command "Set-ExecutionPolicy Bypass -Scope Process -Force; \
    [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; \
    iex ((New-Object System.Net.WebClient).DownloadString('${CHOCOLATEY_URL}'))"

RUN choco install -y ${JAVA_PACKAGE}

# Stage 2: Runtime Stage
FROM ${BASE_IMAGE_RUNTIME}

# Copy Java installation from builder stage to reduce final image size
COPY --from=builder /ProgramData/chocolatey/lib/${JAVA_PACKAGE} /ProgramData/chocolatey/lib/${JAVA_PACKAGE}

# Set JAVA_HOME environment variable
ENV JAVA_HOME=${JAVA_HOME_DIR}
ENV PATH=${JAVA_HOME}\\bin;$PATH

# Define application-related environment variables
ENV APP_NAME="Gradle"
ENV APP_BASE_NAME="gradlew.bat"
ENV DEFAULT_JVM_OPTS=""
ENV MAX_FD="maximum"

# Set the working directory
WORKDIR /app

# Copy project files to the container
COPY . .

# Add custom script for environment setup and logging configuration
COPY setup-env.ps1 /app/setup-env.ps1

# Run the setup script to configure environment variables and logging
RUN powershell -ExecutionPolicy Bypass -File setup-env.ps1

# Set the entrypoint to run gradlew.bat with CMD to specify default arguments
ENTRYPOINT ["cmd", "/c"]
CMD ["gradlew.bat"]

# Health check to ensure the container is running properly
HEALTHCHECK --interval=30s --timeout=10s --start-period=5s CMD powershell -command "(Test-Path 'C:\\app\\healthy.txt') -or exit 1"
