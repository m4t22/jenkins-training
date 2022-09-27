def call() {
    git credentialsId: 'm4t22-creds', branch: 'main', url: 'git@github.com:m4t22/jenkins-training.git'
    sh './gradlew releaseVersion'
    sh 'git push --follow-tags'
}