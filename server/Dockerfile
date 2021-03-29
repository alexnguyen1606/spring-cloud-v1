FROM openjdk:8-jdk-alpine
MAINTAINER alex nguyen
EXPOSE 8761/tcp
COPY target/naming-server-v1.0.war naming-server-v1.0.war
CMD ["java","-jar","/naming-server-v1.0.war"]