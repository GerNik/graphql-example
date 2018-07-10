FROM java:8-jre

ADD ./build/libs/graphql-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/graphql-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080