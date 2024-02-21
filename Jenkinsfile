pipeline {
     agent any
        tools {
            maven 'MAVEN_HOME'
        }
         stages {
             stage('Checkout') {
                 steps {
                    git branch: 'main', url: 'git@github.com:AnnaLinden/sw2024_FarToCel_Maven'
                 }
             }
             stage('Build') {
                 steps {
                   echo "Build App"
                 }
             }
             stage('Test') {
                 steps{
                    echo "Test App"
                 }

             }
             stage ('Deploy') {
                steps {
                echo 'Deploy App'
                }
             }
         }
}