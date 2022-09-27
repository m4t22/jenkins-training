def call() {
    git credentialsId: 'm4t22-creds', url: 'git@github.com:m4t22/jenkins-training.git'
    sh './gradlew releaseVersion'
    git push --follow-tags
}