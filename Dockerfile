#EXPOSE 8080
#ADD ./build/libs/*.jar app.jar


FROM openjdk:17-jdk
WORKDIR /usr/src/app
EXPOSE 8080
COPY ./build/libs/linglink-0.0.1-SNAPSHOT.jar /build/libs/linglink-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/build/libs/linglink-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /build/libs/linglink-0.0.1-SNAPSHOT.jar"]