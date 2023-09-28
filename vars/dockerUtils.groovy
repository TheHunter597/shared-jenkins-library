#! groovy

class DockerUtils {
    String baseUrl = "thehunter597/mongobun:"
    static buildImage(String tag,baseUrl=null){
        if (baseUrl == null){
            baseUrl = DockerUtils.baseUrl
        }
        sh "docker build -t ${baseUrl}${tag} ."
    }
    static pushImage(String tag,baseUrl=null){
        if (baseUrl == null){
            baseUrl = DockerUtils.baseUrl
        }
        sh "docker push ${baseUrl}${tag}"
    }
    static loginToDockerHub(String credentialId){
        withCredentials([
            usernamePassword(
            credentialsId: "$credentialId",
            usernameVariable: 'USERNAME',
            passwordVariable: 'PASSWORD'

            )
        ]){
            sh "echo ${PASSWORD} | docker login -u ${USERNAME} --password-stdin ${baseUrl ? baseUrl : ""}"
        }
    }
}