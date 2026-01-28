def call(){
    sh 'docker build -t --label maintainer=mshahwaz "$REPO:$TAG" .'
}