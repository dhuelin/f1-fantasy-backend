# Step 1: Use a base image with Java 23
FROM eclipse-temurin

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the application JAR file into the container
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the application port
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
