FROM java:openjdk-8-jdk-alpine
MAINTAINER Marcelo Pereira <marcelovcpereira@gmail.com>

RUN mkdir /scripts

COPY mvcp-adobe-service-a-1.0-SNAPSHOT.jar /scripts/marcelo-adobe-service-a.jar


COPY docker-entrypoint.sh /scripts/docker-entrypoint.sh
RUN ["chmod", "+x", "/scripts/docker-entrypoint.sh"]

EXPOSE 9090

ENTRYPOINT ["/scripts/docker-entrypoint.sh"]