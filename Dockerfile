FROM openjdk:21-slim

WORKDIR /app

COPY build/web.jar /app/web.jar
COPY build/application.properties /app/application.properties
COPY build/CloudServices.config /app/CloudServices.config
COPY build/GeneXus.services /app/GeneXus.services
COPY build/web.jar /app/web.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Dfile.encoding=UTF-8","-jar", "web.jar"]