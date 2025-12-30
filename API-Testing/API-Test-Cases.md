API_TC_01
API Name: Products List API
Method: GET
Endpoint: /api/productsList

Validations:
- Status code should be 200
- Response body should not be empty
- Response time should be less than 2 seconds
- Content-Type should be application/json

-------------------------------------

API_TC_02
API Name: User Login API
Method: POST
Endpoint: /api/verifyLogin

Request Body:
{
  "email": "test@test.com",
  "password": "test123"
}

Validations:
- Correct success message for valid login
- Error message for invalid credentials
- Status code validation
