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
Java 21 • Spring Boot 3.2 • PostgreSQL • Swagger • JPA • Lombok

## API Docs


Swagger UI is available at:
http://localhost:8080/swagger-ui.html 

## 🗄 Database

This project uses PostgreSQL.  

Update your connection settings in: src/main/resources/application.properties

An example would be:
spring.datasource.url=jdbc:postgresql://localhost:5432/notesdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

To run
- Clone the repository
- Run the application by the command: mvn spring-boot:run
- Or run it directly from Intellij project structure
