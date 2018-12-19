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
    stage('Test Firefox') {
      parallel {
        stage('Test Firefox') {
          steps {
            bat(script: 'mvn clean test -Dbrowser=firefox', returnStatus: true, returnStdout: true)
          }
        }
        stage('Test Chrome') {
          steps {
            bat(script: 'mvn clean test -Dbrowser=chrome', returnStatus: true, returnStdout: true)
          }
        }
      }
    }
    stage('Archive Results') {
      steps {
        junit '**/target/surefire-reports/TEST-*.xml'
      }
    }
  }
}