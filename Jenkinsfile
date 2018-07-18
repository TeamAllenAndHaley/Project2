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
        sh 'mvn tomcat7:deploy'
      }
    }
  }
}