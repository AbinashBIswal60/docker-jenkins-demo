FROM openjdk:17
EXPOSE 8080
ADD target/docker-jenkins-demo1.jar docker-jenkins-demo1.jar
ENTRYPOINT ["java","-jar","docker-jenkins-demo1.jar"]