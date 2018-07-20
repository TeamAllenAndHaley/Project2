pipeline {
  agent any
  stages {
    stage('yarn:build') {
      agent any
      steps {
        echo 'Building angular app...'
        sh 'sudo service tomcat stop'
        sh 'cd src/angular && yarn && yarn run build:prod && cd ../..'
      }
    }
    stage('maven:build') {
      steps {
        echo 'Building java app...'
        sh 'mvn clean package -DskipTests -x -e'
      }
    }
    stage('maven:deploy') {
      steps {
        echo 'Deploying to tomcat...'
        sh 'sudo service tomcat start'
        sh 'mvn tomcat7:deploy -DskipTests -x -e'
      }
    }
  }
}