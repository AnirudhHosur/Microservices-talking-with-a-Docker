FROM openjdk:18-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} actor.jar
ENTRYPOINT ["java","-jar","/actor.jar"]