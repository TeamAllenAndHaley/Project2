pipeline {
  agent any
  stages {
    stage('yarn:build') {
      agent any
      steps {
        sh 'sudo service tomcat stop'
        echo 'Building angular app...'
        sh 'cd src/angular && yarn && yarn run build:prod'
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