# FROM openjdk:8-jdk-alpine
# VOLUME /tmp
# COPY ./target/*.jar app.jar
# ENTRYPOINT ["java","-jar","/app.jar"]



FROM maven:3.6.3-jdk-8 AS build

WORKDIR /app

#Usando cache do Docker para evitar download de todas as dependências em todos os builds.
COPY pom.xml ./pom.xml
RUN mvn dependency:go-offline -B

COPY src ./src
# RUN mvn -Dmaven.test.skip=true package 
RUN mvn clean package 

FROM openjdk:8-jre-alpine

COPY --from=build /app/target/backend-*.jar /app/backend.jar
EXPOSE 80

# ENTRYPOINT ["java","-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","/usr/app/web-nbz.jar"]
ENTRYPOINT ["java","-jar","/app/backend.jar"]