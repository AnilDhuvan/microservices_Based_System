FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy the jar file to the container
COPY target/order-service-0.0.1-SNAPSHOT.jar app.jar

# application port
EXPOSE 8081

# Start application
ENTRYPOINT ["java", "-jar", "app.jar"]