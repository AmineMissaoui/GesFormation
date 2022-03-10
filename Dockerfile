# syntax=docker/dockerfile:1

FROM openjdk:8-jdk-alpine

EXPOSE 8083

ADD target/Ges-F1.0.jar Ges-F1.0

ENTRYPOINT ["java","-jar","/Ges-F1.0.war"]

