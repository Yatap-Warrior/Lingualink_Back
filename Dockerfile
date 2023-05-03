FROM openjdk:17-jdk

COPY ./build/libs/linglink-0.0.1-SNAPSHOT.jar /build/libs/linglink-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/build/libs/linglink-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080