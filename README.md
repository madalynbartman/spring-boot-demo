# spring-boot-demo

# Java Spring Boot API Demo

This project demonstrates how to build a CRUD API using Java Spring Boot, with validation and API documentation using Springdoc OpenAPI.


## Setup Instructions

1. **Generate a Spring Boot project**:
    - Go to [Spring Initializr](https://start.spring.io/)
    - Select the following dependencies:
      - Spring Web
      - Spring Data JPA (optional, if you want to use a database)
      - Spring Boot DevTools
      - Lombok (optional, for reducing boilerplate code)
      - Spring Boot Starter Validation
      - Springdoc OpenAPI (for Swagger documentation)
    - Generate the project and download the zip file
    - Extract the zip file into your project directory

2. **Project Dependencies**: Ensure your `pom.xml` includes the necessary dependencies:
    ```xml
    <dependencies>
        <!-- Spring Boot Starter Web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Spring Boot Starter Validation -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- Springdoc OpenAPI UI -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-ui</artifactId>
            <version>1.5.9</


# Running the Application
Run the application using your IDE or by executing mvn spring-boot:run from the command line.

# Access the Swagger UI at http://localhost:8080/swagger-ui.html.

# TODO: Add inatructional comments to code
