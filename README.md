# 🔐 Auth Service – Spring Boot JWT Authentication

A simple, production-ready authentication microservice built with  **Spring Boot 3, and MySQL**. This service provides secure user registration, login, with proper error handling.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.5-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📌 Tech Stack

| Layer      | Technology                  |
| ---------- | --------------------------- |
| Language   | Java 17                     |
| Framework  | Spring Boot 3.1.5           |
| ORM        | Spring Data JPA (Hibernate) |
| Database   | MySQL                       |
| Build Tool | Maven                       |
| Validation | Jakarta Validation          |

## ✨ Features

- ✅ **User Registration** with validation
- ✅ **JWT-based Authentication** (24-hour tokens)
- ✅ **Role-based Authorization** (USER, ADMIN)
- ✅ **RESTful API** with proper HTTP status codes
- ✅ **Comprehensive Error Handling** with JSON responses
- ✅ **MySQL Database** integration with Hibernate

## 🚀 Quick Start

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+ (or Docker)
- Postman (for API testing)

###

1. **Clone the repository:**
```bash
git clone https://github.com/saurabhsawant1691/auth-service-3.git
cd auth-service-3
```

2. **Import the project in your IDE** (e.g., IntelliJ, Eclipse).

3. **Configure MySQL database:**
   - Create a database named `auth_service_3_db`.
   - Update `src/main/resources/application.properties` with your DB credentials.

4. **Build and run the application:**
```bash
./mvnw clean spring-boot:run
```

5. **Access the service:**
   - URL: `http://localhost:8080/api/auth`
   - Swagger UI: `http://localhost:8080/swagger-ui.html`

## 📂 Project Structure

The project follows a standard Spring Boot structure:

```
📦 auth-service
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java/org/dnyanyog
│   │   │   ├── AuthServiceMain.java  # Main entry point
│   │   │   ├── 📁 controller
│   │   │   │   └── AuthController.java  # Handles authentication APIs
│   │   │   ├── 📁 dto
│   │   │   │   ├── ApiResponse.java  # Generic API response
│   │   │   │   ├── LoginRequest.java  # Login payload
│   │   │   │   └── SignupRequest.java  # Signup payload
│   │   │   ├── 📁 entity
│   │   │   │   └── User.java  # User entity
│   │   │   ├── 📁 repository
│   │   │   │   └── UserRepository.java  # Database operations
│   │   │   ├── 📁 service
│   │   │   │   └── AuthService.java  # Authentication logic
│   │   └── 📁 resources
│   │       └── application.properties  # Configuration file
│   └── 📁 test
│       ├── 📁 java  # Test classes
│       └── 📁 resources  # Test resources
├── 📄 pom.xml  # Maven configuration
└── 📄 README.md  # Project documentation
```

## 🧭 Application Flow (High Level)

1. User registers via `/api/auth/signup`
2. User logs in via `/api/auth/login`

## 🧩 Module Documentation Index

### 🚀 Main Application
* [AuthServiceMain](docs/AuthServiceMain.md) - Main application class

### 🧩 Controllers

* [AuthController](docs/controller/AuthController.md) - Handles authentication endpoints

### 🧠 Services

* [AuthService](docs/service/AuthService.md) - Core authentication logic

### 📦 Data Transfer Objects (DTOs)

* [ApiResponse](docs/dto/ApiResponse.md) - Standard API response format
* [LoginRequest](docs/dto/LoginRequest.md) - Login request payload
* [SignupRequest](docs/dto/SignupRequest.md) - Signup request payload

### 🏛️ Entities

* [User](docs/entity/User.md) - User entity mapping to database

### 🗄️ Repositories 

* [UserRepository](docs/repository/UserRepository.md) - JPA repository for User entity

### ⚙️ Configuration Files

* [application.properties](docs/application.properties.md) - Application configuration
* [pom.xml](docs/pom.md) - Maven build file

Each file above is **fully documented** with:

* File location
* Purpose
* Core logic
* Flow explanation
* Best practices


## 🌐 API Endpoints

| Method | Endpoint                         | Description         |
| ------ | -------------------------------- | ------------------- |
| POST   | `/api/auth/signup`               | Register new user   |
| POST   | `/api/auth/login`                | Authenticate user   |


## ⚙️ Configuration Summary

* Server Port: `8080`
* Database: MySQL

## 🧠 Design Philosophy

This project follows:

* Clean architecture
* Separation of concerns
* Stateless security model
* Scalable microservice principles

## 👨‍💻 Author

**Saurabh Sawant**
Frontend + Backend Engineer | Fintech Domain

Happy building 🚀