pipeline {
  agent any
  stages {
    stage('Maven Build') {
      steps {
        sh 'mvn clean package -dskiptests'
      }
    }
    stage('Deploy') {
      steps {
        sh 'mvn tomcat:7 deploy'
      }
    }
  }
}