FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar file 
COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

# Expose application port
EXPOSE 8080

# Start application
ENTRYPOINT ["java", "-jar", "app.jar"]