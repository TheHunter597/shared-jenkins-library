def call(String tag){
    echo "building"
    sh "docker build -t thehunter597/mongobun:${tag} ."
}