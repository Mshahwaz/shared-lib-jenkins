def call() {
    sh ' docker rm $REPO || true '
    sh ' docker run --restart unless-stopped -d -p $PORT:$PORT $REPO:$TAG '
}