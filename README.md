# 🛠️ Microservices-Based System using Spring Boot & Docker

## Objective
Design and implement a microservices system using:
- Java 17
- Spring Boot
- MongoDB, MySQL, H2
- Docker & Docker Compose

---

## Services Overview

| Service          | Port  | Database | Description                         |
|------------------|-------|----------|-------------------------------------|
| `user-service`   | 8080  | H2       | Manages users (CRUD)                |
| `order-service`  | 8081  | MySQL    | Handles orders placed by users      |
| `product-service`| 8082  | MongoDB  | Manages product listings (CRUD)     |

---

## Tech Stack

- Java 17
- Spring Boot 3.5.x
- Spring Data JPA, MongoDB, Web, Validation
- Swagger/OpenAPI (Springdoc)
- Docker & Docker Compose
- Maven (Multi-module project)

---

##  Folder Structure

microservices-system/

├── user-service/
│ └── Dockerfile

├── order-service/
│ └── Dockerfile

├── product-service/
│ └── Dockerfile

├── docker-compose.yml
└── README.md


## API Endpoints

***user-service***
- swagger - http://localhost:8080/swagger-ui/index.html 
- heath - http://localhost:8080/actuator/health


***order-service***

- swagger - http://localhost:8081/swagger-ui/index.html 
- heath - http://localhost:8081/actuator/health

***product-service***

- swagger - http://localhost:8082/swagger-ui/index.html 
- heath - http://localhost:8082/actuator/health


 ## Author ## 
- Anil Kumar
- anildhuvan@gmail.com
- Java Full Stack Developer

