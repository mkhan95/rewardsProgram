# rewardsProgram

Rewards Program API
This API is designed to manage a rewards program for a retailer's customers. It allows customers to earn and manage reward points based on their purchases. This API is built using Spring Boot and provides various endpoints for different reward-related actions.


**Getting Started**
Prerequisites
Before running this API, ensure you have the following prerequisites installed:

Java 8+
Maven
Spring Boot
Installation
Clone the repository:

git clone https://github.com/https://github.com/mkhan95/rewardsProgram
Navigate to the project directory:

Build and run the application using Maven:


mvn spring-boot:run
The API should now be running locally on http://localhost:8080.

API Endpoints
Record a Purchase
Endpoint: /purchases
Method: POST
Description: Records a purchase and calculates reward points for the customer.
Request Example:

{
  "purchaseAmount": 120.0,
  "customer": {
    "id": 1
  }
}
Response Example: "Purchase recorded has been stored."
HTTP Status Codes:
200 OK: Purchase recorded successfully.
400 Bad Request: Invalid request.

*Swagger Documentation
Interactive API documentation is available via Swagger. You can access the Swagger UI by navigating to http://localhost:8080/swagger-ui/index.html when the application is running locally.

