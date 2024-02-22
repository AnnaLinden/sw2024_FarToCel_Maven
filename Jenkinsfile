pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/AnnaLinden/sw2024_FarToCel_Maven'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
    post {
        success {
            // Publish JUnit test results
            junit '**/target/surefire-reports/TEST-*.xml'
            // Generate JaCoCo code coverage report
            jacoco(execPattern: '**/target/jacoco.exec')
        }
    }
}
