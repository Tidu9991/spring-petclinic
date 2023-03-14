#!groovy

pipeline {
	agent any
         tools{
        maven "maven 3.9.0"
    }
  stages {
  	stage('Build') {
      steps {
          withMaven(maven: 'maven-3.9.0'){
          bat 'mvn clean install'
      }
    }
  }
    }
    stage('Docker Build') {
    	agent any
      steps {
      	bat 'docker build -t shanem/spring-petclinic:latest .'
      }
    }
  }

}
