FROM maven:3.3.2-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build/target/starter-0.0.1-SNAPSHOT.jar starter.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","starter.jar"]