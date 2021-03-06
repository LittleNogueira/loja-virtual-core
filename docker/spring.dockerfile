FROM openjdk:8-jdk-alpine

COPY app/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080