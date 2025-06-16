pipeline {
    agent any

    tools {
        maven 'Maven 3.8.3'
        jdk 'JDK 11'
    }

    stages {
        stage('Clonar') {
            steps {
                git clone 'https://github.com/lucascrvz/saludoapp.git'
            }

            stage('Compilar') {
                steps {
                    sh 'mvn clean compile'
                }
            }

            stage('Testear') {
                steps {
                    sh 'mvn test'
                }
            }

            stage('Empaquetar') {
                steps {
                    sh 'mvn package'
                }
            }
        }

        post {
            success {
                echo 'Pipeline completed successfully!'
            }
            failure {
                echo 'Pipeline failed!'
            }
        }
    }
}
