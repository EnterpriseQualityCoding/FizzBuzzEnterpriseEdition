FROM openjdk:8-jre

ENV APP_HOME=/fizzbuzz \
    JAR_FILE=FizzBuzzEnterpriseEdition-all.jar
RUN mkdir -p ${APP_HOME}

COPY build/libs/${JAR_FILE} ${APP_HOME}

WORKDIR ${APP_HOME}

CMD exec java -jar ${JAR_FILE}
