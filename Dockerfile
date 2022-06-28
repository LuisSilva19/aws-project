FROM openjdk:11
ADD target/*.jar app.jar
EXPOSE 8080
WORKDIR /app
COPY target/*.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
