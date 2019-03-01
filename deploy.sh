echo "Stop and remove container if existing."
CONTAINER_NAME="sbd-1.0"
OLD="$(docker ps --all --quiet --filter=name="$CONTAINER_NAME")"
if [ -n "$OLD" ]; then
  docker stop $OLD && docker rm $OLD
fi
echo "start container"
docker run -p 8888:8080 -d --name $CONTAINER_NAME ovbee/spring--boot-demo:1.0