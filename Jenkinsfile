pipeline {
  agent any
  stages {
    stage('yarn:maven:build') {
      steps {
        echo 'Building angular app...'
        sh 'sudo service tomcat stop'
        sh 'cd src/angular && yarn && yarn run build:prod && cd ../..'
        echo 'Building java app...'
        sh 'mvn clean package -DskipTests'
      }
    }
    stage('maven:deploy') {
      steps {
        echo 'Deploying to tomcat...'
        sh 'sudo service tomcat start'
        sh 'mvn tomcat7:deploy -DskipTests'
      }
    }
  }
}