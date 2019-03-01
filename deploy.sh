app="sbd-1.0"
echo "Stop and remove container if existing."
if docker ps | awk -v app="$app" 'NR > 1 && $NF == app{ret=1; exit} END{exit !ret}'; then
    docker stop "$app" && docker rm -f "$app"
fi
echo "start container"
docker run -p 8888:8080 -d --name sbd-1.0 ovbee/spring--boot-demo:1.0