FROM openjdk:11
ARG JAR_FILE=/build/libs/project-purple-cow-1.0.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]