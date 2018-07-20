pipeline {
  agent any
  stages {
    stage('yarn:build') {
      agent any
      steps {
        sh 'sudo service tomcat stop'
        echo 'Building angular app...'
        sh 'cd angular && yarn && yarn run build:prod && cd ..'
        sh 'ls -la && ls -la angular && ls -la src/main/ && ls -la src/main/webapp/'
        sh 'mv src/main/webapp/WEB-INF/ angular/dist/webapp/ && rmdir src/main/webapp/ && mv angular/dist/webapp/ src/main/'
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
        sh 'service tomcat start'
        sh 'mvn tomcat7:deploy -DskipTests'
      }
    }
  }
}