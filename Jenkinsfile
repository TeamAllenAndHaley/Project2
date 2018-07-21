pipeline {
  agent any
  stages {
    stage('yarn:build') {
      agent any
      steps {
        echo 'Building angular app...'
        sh 'sudo service tomcat stop'
        sh 'cd src/angular && yarn && yarn run build:prod && cd ../..'
        sh 'pwd && ls -la && ls -la src/main/webapp'
      }
    }
    stage('maven:build') {
      steps {
        echo 'Building java app...'
        sh 'mvn -X clean package -DskipTests'
      }
    }
    stage('maven:deploy') {
      steps {
        echo 'Deploying to tomcat...'
        sh 'sudo service tomcat start'
        sh 'mvn -X tomcat7:deploy -DskipTests'
      }
    }
  }
}