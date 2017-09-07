pipeline {
  agent none
  stages {
    stage('Build') {
      agent {
        dockerfile {
          label "dockerTest"
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
  }
  post {
    always {
      deleteDir()
    }
    failure {
      mail to:'bmcconnell@cloudbees.com', subject:'FAILURE:', body:'Help'
    }
  }
}
