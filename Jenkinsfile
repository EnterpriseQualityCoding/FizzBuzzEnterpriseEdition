pipeline {
  agent {
    dockerfile true,
  }
  stages {
    stage('Build') {
      agent {
        label "foxtrot"
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
