FROM openjdk:17

COPY target/DemoWebApp.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "DemoWebApp.jar"]