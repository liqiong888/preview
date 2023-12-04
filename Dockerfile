FROM openjdk:8

COPY target/blog-1.0.0.jar .

CMD ["--server.port=8080"]

EXPOSE 8080

ENTRYPOINT ["java","-jar","blog-1.0.0.jar"]