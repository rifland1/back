FROM alpine:3

ADD . /app/

WORKDIR /app

EXPOSE 80

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]