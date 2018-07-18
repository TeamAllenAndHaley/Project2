pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building Angular project...'
        sh '''cd angular
npm i --unsafe-perm
npm run build
cd ..'''
        echo 'Replacing Angular dist into Java webapp...'
        sh '''mv src/main/webapp/WEB-INF/ src/main/
rm -r src/main/webapp/
mv angular/dist/webapp/ src/main/
mv src/main/WEB-INF/ src/main/webapp/
'''
        echo 'Building Java project with Maven...'
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