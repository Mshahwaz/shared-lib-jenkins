def call() {
    sh ' docker rm $REPO:$TAG || true '
    sh ' docker run -d -p $PORT:$PORT $REPO:$TAG '
}