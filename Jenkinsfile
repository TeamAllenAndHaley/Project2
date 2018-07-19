pipeline {
  agent any
  stages {
    stage('npm:build') {
      agent {
        node {
          label 'node'
        }

      }
      steps {
        echo 'Building angular app...'
        sh 'cd angular && npm install && npm run build && cd ..'
        sh '''mv src/main/webapp/WEB-INF/ src/main/
rm -r src/main/webapp/
mv angular/dist/webapp/ src/main/
mv src/main/WEB-INF/ src/main/webapp/
'''
      }
    }
    stage('maven:build') {
      steps {
        echo 'Building java app...'
        sh 'mvn clean package -DskipTests'
      }
    }
    stage('maven:deploy') {
      steps {
        echo 'Deploying to tomcat...'
        sh 'mvn tomcat7:deploy'
      }
    }
  }
}