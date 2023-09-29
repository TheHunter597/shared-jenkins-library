def call(String tag){
    echo "building"
    if (baseUrl == null){
            baseUrl = DockerUtils.baseUrl
        }
    sh "docker build -t thehunter597/mongobun:${tag} ."
}