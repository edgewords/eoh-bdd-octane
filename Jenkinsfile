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
    stage('Test') {
      steps {
        bat(script: 'mvn clean test -Dbrowser=firefox', returnStatus: true, returnStdout: true)
      }
    }
  }
}