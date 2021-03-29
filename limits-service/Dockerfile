FROM openjdk:8-jdk-alpine
MAINTAINER alex nguyen
EXPOSE 8083/tcp
COPY target/limits-service-v1.0.war limits-service-v1.0.war
CMD ["java","-jar","/limits-service-v1.0.war"]