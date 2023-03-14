FROM anapsix/alpine-java

FROM openjdk:11-jre-slim

LABEL maintainer="shanem@liatrio.com"

COPY /target/spring-petclinic-1.5.1.jar /home/spring-petclinic-1.5.1.jar

CMD ["java","-jar","/home/spring-petclinic-1.5.1.jar"]
