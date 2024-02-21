pipeline {
     agent any
        tools {
            maven 'Maven-3.9.6'
        }
         stages {
             stage('Checkout') {
                 steps {
                    git branch: 'main', url: 'git@github.com:AnnaLinden/sw2024_FarToCel_Maven'
                 }
             }
             stage('Build') {
                 steps {
                    sh 'mvn clean install'
                 }
             }
             stage('Test') {
                 steps{
                    sh 'mvn test'
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
         }
}