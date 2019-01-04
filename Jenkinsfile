pipeline {
  agent {
    node {
      label 'Tom_Local'
    }

  }
  stages {
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
                  reportDir: 'reports/cucumber-html-report',
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
    stage('Octane Results') {
      steps {
        script {
          script {
            publishGherkinResults()
          }
        }

      }
    }
  }
}