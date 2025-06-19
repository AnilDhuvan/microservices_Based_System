
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/product-service-0.0.1-SNAPSHOT.jar app.jar

#application port
EXPOSE 8082

# Start application
ENTRYPOINT ["java", "-jar", "app.jar"]