#Image that we are using
FROM openjdk:11
ADD target/pet-manager-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

