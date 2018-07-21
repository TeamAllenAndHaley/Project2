pipeline {
  agent any
  stages {
    stage('yarn:maven:build') {
      steps {
        echo 'Building angular app...'
        sh 'sudo service tomcat stop'
        sh 'cd src/angular && yarn && yarn run build:prod && cd ../..'
        echo 'Building java app...'
        sh 'pwd && ls -la && ls -la src/main/webapp'
        sh 'mvn -X clean package -DskipTests'
      }
    }
    stage('maven:deploy') {
      steps {
        echo 'Deploying to tomcat...'
        sh 'sudo service tomcat start'
        sh 'pwd && ls -la && ls -la src/main/webapp'
        sh 'mvn -X tomcat7:deploy -DskipTests'
      }
    }
  }
}