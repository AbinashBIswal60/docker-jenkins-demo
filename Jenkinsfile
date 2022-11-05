pipeline{
    agent any
    tools{
        maven 'maven3.8.6'
    }
    stages{
        stage('Biuld Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/AbinashBIswal60/docker-jenkins-demo.git']]])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t abinashsid/docker-jenkins-demo.jar .'
                }
            }

        }
        stage('Push Docker Image to DockerHub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpass', variable: 'dockerhubpass')]) {
                        bat 'docker login -u abinashsid -p %dockerhubpass%'
                    }
                    bat 'docker push abinashsid/docker-jenkins-demo.jar'
                }
            }

        }

    }
}