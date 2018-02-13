FROM java:8-jre
MAINTAINER Aleksey Kobzev <a.kobzev@aol.com>

ADD ./target/eureka-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761