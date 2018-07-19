pipeline {
  agent any
  stages {
    stage('yarn:build') {
      agent any
      steps {
        sh 'sudo service tomcat stop'
        echo 'Building angular app...'
        sh 'cd angular && yarn && yarn run build:prod && cd ..'
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
        sh 'sudo service tomcat start'
        sh 'mvn tomcat7:deploy'
      }
    }
  }
}