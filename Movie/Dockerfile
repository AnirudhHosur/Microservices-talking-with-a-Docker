FROM openjdk:18-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} movie.jar
ENTRYPOINT ["java","-jar","/movie.jar"]