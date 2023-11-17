build-image:
	@ docker build -f devops/Dockerfile -t reservacionesbackend:1 .
volume:
	@ docker volume create pg_tendencia_reservaciones_data
deploy:
	@ docker stack deploy --with-registry-auth -c devops/stack.yml reservaciones
rm:
	@ docker stack rm reservaciones
	