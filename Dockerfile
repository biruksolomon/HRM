# Use a valid Java 18 JDK image
FROM eclipse-temurin:18-jdk

# Set working directory inside the container
WORKDIR /usr/app

# Copy the JAR file from the target directory
COPY target/HRM-0.0.1-SNAPSHOT.jar /usr/app/


# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "HRM-0.0.1-SNAPSHOT.jar"]
