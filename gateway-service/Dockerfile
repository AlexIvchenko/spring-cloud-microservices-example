FROM java:8-jre
MAINTAINER Aleksey Kobzev <a.kobzev@aol.com>

ADD ./target/gateway-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080