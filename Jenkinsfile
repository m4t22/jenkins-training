@Library('Jenkins-training@main') _

 pipeline {
    agent any 
    stages {
        stage('Bump version') { 
            steps {
                semVer()
            }
        }
    }
 }