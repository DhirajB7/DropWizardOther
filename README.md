# Learning

How to start the Learning application
---

1. Install Java [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) & Maven [here](https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip) instructions are [here](https://maven.apache.org/install.html) .
1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/dropwizard-core-2.1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`
1. Endpoints `http://localhost:8080/hello-world`, `http://localhost:8080/hello-world?name=Dhiraj`

Health Check
---

1. To see your applications health enter url `http://localhost:8081/healthcheck`
1. Click on any link to see health.
