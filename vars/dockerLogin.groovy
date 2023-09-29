def call(String tag){
    echo "logging in"
    withCredentials([
            usernamePassword(
            credentialsId: "$credentialId",
            usernameVariable: 'USERNAME',
            passwordVariable: 'PASSWORD'

            )
        ]){
        sh "echo ${PASSWORD} | docker login -u ${USERNAME} --password-stdin"
    }
}
