FROM debian:11

RUN apt update && apt install -y openjdk-17-jre

COPY reservaciones.core-0.0.1-SNAPSHOT.jar ./myapp.jar

CMD ["java", "-jar", "myapp.jar"]