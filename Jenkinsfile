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
      parallel {
        stage('Firefox') {
          steps {
            bat(script: 'mvn clean test -Dbrowser=firefox', returnStatus: true, returnStdout: true)
          }
        }
        stage('Chrome') {
          steps {
            bat(script: 'mvn clean test -Dbrowser=chrome', returnStatus: true, returnStdout: true)
          }
        }
      }
    }
    stage('Archive Results') {
      parallel {
        stage('Archive Results') {
          steps {
            junit '**/target/surefire-reports/TEST-*.xml'
          }
        }
        stage('HTML Results') {
          steps {
            script {
              script {
                publishHTML(target: [
                  allowMissing: false,
                  alwaysLinkToLastBuild: false,
                  keepAll: true,
                  reportDir: 'reports/html-report',
                  reportFiles: 'index.html',
                  reportTitles: "BDD Report",
                  reportName: "BDD Report"
                ])
              }
            }

          }
        }
      }
    }
  }
}