pipeline {
    agent any
   
    stages {

        stage('Build with MVN') {
            steps {
            sh "mvn clean package"
            }
        }
        
        stage('LS all Files') {
            steps {
            sh "ls -ltr"
            }
        }

        
        
        stage('Docker Images') {
            steps {
                sh "docker images"
            }
        }
    }
        
}
