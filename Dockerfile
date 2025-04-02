FROM openjdk:21-slim
# Use a lightweight base image with OpenJDK 21
RUN apt-get update && apt-get install -y iputils-ping && rm -rf /var/lib/apt/lists/*
# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/Web.jar /app/Web.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "Web.jar"]