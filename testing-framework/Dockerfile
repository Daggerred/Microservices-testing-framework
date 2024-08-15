FROM maven:3.6.3-jdk-11 AS build
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean install

FROM openjdk:11-jre-slim
COPY --from=build /usr/src/app/target/testing-framework-1.0-SNAPSHOT.jar /usr/app/
CMD ["java", "-jar", "/usr/app/testing-framework-1.0-SNAPSHOT.jar"]
