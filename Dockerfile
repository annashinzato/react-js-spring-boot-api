FROM openjdk:11

WORKDIR /usr/bin
COPY bin/*.jar /usr/bin/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
