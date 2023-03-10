pipeline {
    agent any
   
    stages {

        stage('SCM Checkout') {
            steps {
                // Get some code from a GitHub repository
                
            }    
        }

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
