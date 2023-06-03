FROM openjdk:18-jdk-alpine
ENV APP_HOME=/usr/app/
WORKDIR /usr/app
RUN apk update && apk upgrade && apk add maven
COPY src/main/resources/users.csv $APP_HOME/users.csv
COPY target/*.jar $APP_HOME/app.jar
CMD ["java", "-jar", "/usr/app/app.jar"]