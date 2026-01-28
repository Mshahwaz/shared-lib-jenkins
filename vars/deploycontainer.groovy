def call() {
    sh ' docker rm $REPO:$TAG || true '
    sh ' docker run --restart unless-stopped -d -p $PORT:$PORT $REPO:$TAG '
}