# ECommerce-api
This is a Java project that models the relationship between User,Product,Address and their Orders.
The project uses Spring Boot and JPA to provide a RESTful API for CRUD operations on the User,Product,Orders and Address models.

## Technologies Used
This project uses the following technologies:
- Java
- Spring Framework
- Hibernate
- MySQL

## API Endpoints
The following endpoints are available in the API:

### User Endpoints
- **GET /user/{id}-** Get a User by ID
- **POST /users-** Create new Users

### Product Endpoints
- **GET /products-** Get all products
- **POST /products-** Create new products
- **DELETE /products-** Delete a product by id

### Address Endpoints
- **POST /addresses-** Create new address

### Order Endpoints
- **GET /order/{id}-** Get a order by ID
- **POST /order-** Create a new order


## Controllers
The project has four controllers:
### UserController
- Handles requests related to the User model

### ProductController
- Handles requests related to the Product model

### OrderController
- Handles requests related to the Order model

### AddressController
- Handles requests related to the Address model

## Services
The project has four services:
### UserService
- Handles CRUD operations on the User model

### ProductService
- Handles CRUD operations on the Product model

### OrderService
- Handles CRUD operations on the Order model

### AddressService
- Handles CRUD operations on the Address model

## Repositories
The project has four repositories:
### IUserRepo
- Provides access to the User data source

### IProductRepo
- Provides access to the Product data source

### IOrderRepo
- Provides access to the Order data source

### IAddressRepo
- Provides access to the Address data source

## Summary
In summary, this Java-based Order management system provides an efficient way to place an order on the basis of products and addresses. 
It uses Java, Spring Framework, Hibernate, and MySQL to allow users to perform CRUD operations on both models and store data in a MySQL database. To contribute to this project, simply fork the repository and submit a pull request with your changes.
