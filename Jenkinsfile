pipeline {
  agent {
    dockerfile true
  }
  stages {
    stage('Build') {
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
      mail to:'bmcconnell@cloudbees.com', subject:'FAILURE:'
    }
  }
}