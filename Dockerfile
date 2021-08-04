FROM openjdk:16-alpine

RUN apk update

RUN apk add maven

RUN apk add git

RUN mkdir /app

#COPY target/spring-boot-demo-1.jar /app/spring-boot-demo-1.jar

WORKDIR /app

RUN mkdir code

WORKDIR code

RUN git clone http://github.com/duketeaches/springbootdemo.git

WORKDIR springbootdemo

RUN mvn clean install

WORKDIR target

CMD java -jar spring-boot-demo-1.jar