

FROM openjdk:11-jre-slim
ADD target/spring-boot-images.jar spring-boot-images.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-images.jar"]
