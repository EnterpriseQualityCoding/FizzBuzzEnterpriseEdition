//Declarative pipeline(선언적 파이프라인) 을 사용하겠다고 정의
//선언적 파이프라인의 문법은 기존 groovy기반의 pipeline 작성에 비해 문법적 제한이 많음
pipeline {
    //빌드를 구동할 agent를 명시 가능한 아무 agent 사용
    //docker등을 사용할 수 있음
    agent any

    //auto-install 하여 사용할 툴 명시
    tools {
        //"Maven 3.6.1"은 현재 Jenkins Global Tool Configuration에서 Maven 3.6.1으로 설정된 정보로 실행한다는 의미
        maven "Maven 3.6.1"
    }

    //파이프라인에서 사용할 변수,상수들을 정의
    environment {
        //mvn에서 테스트를 실패하더라도 진행하도록 설정
        mvnConfig = '-Dmaven.test.failure.ignore'

        //sonarQube에서 분석할 바이너리 경로와 code coverage로 활용할 jacoco분석 결과 경로 설정. 사전에 jacoco:prepare-agent install이 필요하다.
        //before using jacoco for code coverage you should setup first with mvn org.jacoco:jacoco-maven-plugin:0.8.1:prepare-agent install
        sonarCodeCoverageConfig = "-Dsonar.binaries=target/classes -Dsonar.jacoco.reportPaths=target/jacoco.exec"

        //sonarQube-scanner에서 git으로 결과를 보고할 수 있게 설정
        //git config oauth={githubtoken} currently token of juho.kang
        sonarGitPreviewConfig = "-Dsonar.analysis.mode=preview -Dsonar.github.pullRequest=$CHANGE_ID -Dsonar.github.repository=JuhoKang/FizzBuzzEnterpriseEdition -Dsonar.github.oauth=6d60a8c28bedcdf1009fbe3dcc003e9befb32725 -Dsonar.host.url=http://localhost:8998"

    }
    stages {
        stage('Build project') {
            steps {
                //차후 debugging 용도로 env를 모두 출력
                sh 'printenv'

                echo "Build the project"

                sh "mvn clean install -DskipTests=True -Dmaven.javadoc.skip=true -B compile -V ${mvnConfig}"
            }
        }
        stage('Run unit tests') {
            steps {
                echo "Run unit tests"

                sh "mvn -Dtest=**.* test ${mvnConfig}"
            }
        }
        //PR에 첨부할 preview 분석 수행
        stage('Sonarqube static analysis preview') {
            steps {
                echo "Setup jacoco to add code coverage on sonarqube report"
                sh "mvn org.jacoco:jacoco-maven-plugin:0.8.1:prepare-agent install ${mvnConfig}"

                //시스템 설정으로 설정해둔 sonarQube서버 환경을 사용하도록 함
                withSonarQubeEnv('sonarqube-server') {
                    echo "SonarQube pull request preview analysis"

                    sh "mvn ${sonarCodeCoverageConfig} ${sonarGitPreviewConfig} sonar:sonar ${mvnConfig}"
                }
            }
        }
        //full 분석 수행. 차후 조건적으로 수행해도 될 부분으로 보임
        stage('Sonarqube static analysis full') {
            steps {
                echo "Setup jacoco to add code coverage on sonarqube report"
                sh "mvn org.jacoco:jacoco-maven-plugin:0.8.1:prepare-agent install ${mvnConfig}"

                withSonarQubeEnv('sonarqube-server') {
                    echo "SonarQube full analysis"

                    sh "mvn ${sonarCodeCoverageConfig} sonar:sonar ${mvnConfig}"
                }
            }
        }

        //quality gate only available for full runs
        stage("SonarQube quality gate full") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    waitForQualityGate abortPipeline: false
                }
            }
        }
    }

    //stage들이 모두 진행된 후 후 처리
    post {
        always {
            //JUnit plugin 통해 junit 테스트 결과 보고
            junit 'target/surefire-reports/*.xml'
        }
        //문제 없이 Job이 수행 되었을 때
        success {
            echo 'I succeeded! :D'
        }
        //단위 테스트 실패등의 unstable한 결과로 Job이 수행 되었을 때
        unstable {
            echo 'I am unstable :/'
        }
        //Job 수행이 도중 실패 되었을 때
        failure {
            echo 'I failed :('
        }
    }
}


