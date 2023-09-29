def call(String tag){
    echo "pushing thehunter597/mongobun:${tag}"
    sh "docker push thehunter597/mongobun:${tag}"
}