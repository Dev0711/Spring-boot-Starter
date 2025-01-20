#Start with Base image containing Juva runtime
FROM openjdk:17-jdk-slim

#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="devoza.com"

#Add the application's jar to the image
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

#excecute the application
ENTRYPOINT ["java", "-jar", "account-0.0.1-SNAPSHOT.jar"]