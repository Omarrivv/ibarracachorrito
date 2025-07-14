# Dockerfile para config-server v2
FROM eclipse-temurin:17-jre-alpine
#nuevos cambios
WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=native"] 