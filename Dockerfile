FROM openjdk:12-jdk-alpine

ENV APP_HOME=/usr/app/

WORKDIR $APP_HOME

COPY build/libs/*.jar app.jar

EXPOSE 8083

CMD [“java”, “-jar”, “app.jar”]



