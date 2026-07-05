# Spring Boot Notes API

This project is part of my backend development learning journey.  
I built it to practice real-world Spring Boot fundamentals including layered architecture, DTOs, validation, exception handling, and database integration.

## What I Learned
- How to structure a Spring Boot project properly
- How to build REST endpoints with controllers, services, and repositories
- How to handle errors with a global exception handler
- How to connect Spring Boot to PostgreSQL
- How to document APIs using Swagger UI

## Tech Stack
- **Java 21**
- **Spring Boot 3.2**
- **Spring Web**
- **Spring Data JPA**
- **PostgreSQL**
- **Docker**
- **Lombok**
- **Swagger (springdoc-openapi)**

## 🐳 Running PostgreSQL with Docker

This project includes a `docker-compose.yml` file so you can start PostgreSQL without installing it manually.

Start the database: "docker compose up -d"

Which creates a PostgreSQL container named postgres-notes-api which has the following properties:

- **Database:** boost  
- **Username:** boost  
- **Password:** password  
- **Port:** 5332 → 5432  

The spring boot application connects using:
spring.datasource.url=jdbc:postgresql://localhost:5332/boost
spring.datasource.username=boost
spring.datasource.password=password

## ▶️ Running the Spring Boot Application
- Clone the repository
- Start PostgreSQL using Docker:  docker compose up -d
- Run the Spring Boot application: mvn spring-boot:run or just use intellij
- Open Swagger UI

Swagger UI is available at:
http://localhost:8080/swagger-ui.html 
Swagger UI provides interactive API documentation

You can test all endpoints directly from the browser.

---

## 📁 Project Structure
src/main/java/com.boostcode
├── controller        # REST controllers
├── dto               # Request/response models
├── exception         # Custom exceptions + global handler
├── model             # JPA entities
├── repository        # Spring Data JPA repositories
└── service           # Business logic layer


To stop the database you can use the "docker compose down" command.


