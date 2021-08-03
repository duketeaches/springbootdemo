FROM openjdk:16-alpine

RUN mkdir /app

COPY target/spring-boot-demo-1.jar /app/spring-boot-demo-1.jar

WORKDIR /app

CMD java -jar spring-boot-demo-1.jar