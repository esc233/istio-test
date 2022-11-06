FROM openjdk:17-oracle
EXPOSE 1234
MAINTAINER 114514
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
WORKDIR /app

ARG JAR_FILE=target/app.jar
COPY ${JAR_FILE} .

ENTRYPOINT ["java", "-Xmx512m", "-jar", "app.jar"]
CMD ["--spring.profiles.active=docker"]