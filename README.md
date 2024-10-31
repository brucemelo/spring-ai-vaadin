# Spring AI + Vaadin

## Requirements

- Java 21
- Docker (running)

## Tech stack

- Java 21
- Spring Boot 3
- Spring AI

## Running

To get your application up and running, follow these steps:

1. **Start Docker Compose:**
    - Run the `docker-compose.yaml` file. This will download and start the required services, including the Ollama and Llama 3.2 model.

2. **Run the Spring Boot Application:**
    - You can run the Spring Boot application using IntelliJ IDEA or via the command line by executing the following Gradle command:
      ```sh
      ./gradlew bootRun
      ```

Make sure to wait until the Docker services are completely initialized before starting the Spring Boot application.