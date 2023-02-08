FROM openjdk:11
ADD /target/project-service-0.0.1-SNAPSHOT.jar project.jar
ENTRYPOINT ["java","-jar","/ project.jar"]