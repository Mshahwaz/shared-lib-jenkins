def call(){
    sh 'docker build --label maintainer=mshahwaz -t "$REPO:$TAG" .'
}