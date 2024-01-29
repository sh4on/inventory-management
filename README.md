# Inventory Management System

A streamlined Inventory Management System powered by Spring Boot and Redis.

## Description
This project is an Inventory Management System developed using Spring Boot and Redis. It provides RESTful APIs for managing products in an inventory.

## Prerequisites
Ensure you have the following installed:
- Java 17
- Redis server running locally on default port (can be configured in `application.properties`)

## Configuration
### `application.properties`
```properties
spring.data.redis.host=localhost
spring.data.redis.port=8081
```

## Project Structure
The project follows a standard Maven project structure. Key packages include:
- `com.example.inventory.inventorymanagementsystem`: Main application package
- `com.example.inventory.inventorymanagementsystem.controller`: RESTful API controllers
- `com.example.inventory.inventorymanagementsystem.model`: Data model classes
- `com.example.inventory.inventorymanagementsystem.repository`: Data access interfaces and implementations
- `com.example.inventory.inventorymanagementsystem.config`: Application configuration classes

## Usage
1. Clone the repository.
2. Configure Redis server in `application.properties`.
3. Run the application using your preferred IDE or Maven command.

## Endpoints
- `POST /api/products`: Save a new product.
- `GET /api/products/{id}`: Retrieve details of a specific product.
- `GET /api/products`: Retrieve details of all products.
- `PUT /api/products`: Update an existing product.
- `DELETE /api/products/{id}`: Delete a product.

## Sample Data
The application loads sample data during startup. Three sample products are added to the inventory.
