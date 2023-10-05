# rewardsProgram

**Rewards Program API**<br>
This API is designed to manage a rewards program for a retailer's customers. It allows customers to earn and manage reward points based on their purchases. This API is built using Spring Boot and provides various endpoints for different reward-related actions.


**Getting Started**<br>
Prerequisites<br>
Before running this API, ensure you have the following prerequisites installed:<br>

Java 8+<br>
Maven<br>
Spring Boot<br>
Installation<br>
Clone the repository:<br>

git clone https://github.com/https://github.com/mkhan95/rewardsProgram
Navigate to the project directory:

Build and run the application using Maven:


mvn spring-boot:run

The API should now be running locally on http://localhost:8080.

API Endpoints
<br>
Record a Purchase

Endpoint: /purchases

Method: POST

Description: Records a purchase and calculates reward points for the customer.

Request Example:
<br>
{<br>
  "purchaseAmount": 120.0,<br>
  "customer": {<br>
    "id": 1<br>
  }<br>
}<br>
Response Example: "Purchase recorded has been stored."<br>
HTTP Status Codes:<br>
200 OK: Purchase recorded successfully.<br>
400 Bad Request: Invalid request.<br>

*Swagger Documentation
Interactive API documentation is available via Swagger. You can access the Swagger UI by navigating to http://localhost:8080/swagger-ui/index.html when the application is running locally.

