pipeline {
  agent {
    node {
      label 'localhost'
    }

  }
  stages {
    stage('Initialization') {
      steps {
        echo 'Initialization'
      }
    }
    stage('Build') {
      steps {
        sh '''mvn clean test -Dbrowser=firefox
'''
      }
    }
  }
}