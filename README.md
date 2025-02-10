"# ProductManagement"

# Product API

This is a Spring Boot application that provides a RESTful API for managing products.

## Requirements
- Java 17
- MySQL
- Maven

## Setup
1. Clone the repository.
2. Create a MySQL database named 'productdb'.
3. Update the 'application.properties' file with your database credentials.
4. Run the application using.

## API Documentation
- Swagger UI: http://localhost:9091/swagger-ui

## Endpoints
- GET /products/getAll' - Get all products
- GET '/products/{id}' - Get a product by ID
- POST '/products/creat' - Create a new product
- PUT '/products/update/{id}' - Update a product
- DELETE /products/delete/{id}' - Delete a product

## Authentication
- Username: 'user'
- Password: 'password'
