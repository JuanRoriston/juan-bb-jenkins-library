def call() {
    // Get some code from a GitHub repository
    git branch: 'main',

    // With SSH access
    // credentialsId: '70a1ffd0-ecd5-41fa-801a-5e52b996da75',
    // url: 'git@github.com:JuanRoriston/juan-bb-hello-world.git'

    // Without HTTPS access
    url: 'https://github.com/JuanRoriston/juan-bb-jenkins-library.git'

    // Test Maven on a Unix agent.
    sh "mvn test -f ./my-app/"

    //Build Project
    sh "mvn clean install -f ./my-app/"
}