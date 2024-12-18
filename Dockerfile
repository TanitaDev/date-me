FROM openjdk:21
WORKDIR /app
COPY build/libs/date-me-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "app.jar"]