pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -DskipTests'
      }
    }
    stage('Deploy') {
      steps {
        sh 'mvn tomcat:7 deploy'
      }
    }
  }
}