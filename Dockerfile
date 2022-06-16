FROM openjdk11
ADD target/.jar app.jar
WORKDIR /app
COPY target/.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
