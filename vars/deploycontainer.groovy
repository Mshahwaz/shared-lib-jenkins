def call() {
    sh ' docker rm $REPO || true '
    sh ' docker run --restart unless-stopped --name $REPO -d -p $PORT:$PORT $REPO:$TAG '
}