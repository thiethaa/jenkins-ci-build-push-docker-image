FROM openjdk:8
ADD target/jenkins-ci-build-push-docker-image.jar jenkins-ci-build-push-docker-image.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","jenkins-ci-build-push-docker-image.jar"]