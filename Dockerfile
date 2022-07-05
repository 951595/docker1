FROM openjdk:11
ADD target/*.jar km.jar
ENTRYPOINT ["java","-jar","km.jar"]