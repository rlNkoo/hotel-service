# Hotel Service Project

This is a Java-based backend application for managing hotel operations. The application provides essential functionalities for user authentication, room management, and booking services. Below is a detailed description of the implemented features and instructions for setting up and running the application.

## Features

### User Authentication and Authorization
- **Registration**: Allows users to create an account with the necessary details.
- **Login**: Authenticates users using their credentials.
- **JWT Authorization**: Secures API endpoints with JSON Web Tokens (JWT) for authentication.
- **Role Management**: Assigns roles to users (e.g., USER, ADMIN), determining their access levels within the application. 

### User Management
- **Get All Users**: Admins can retrieve a list of all registered users.
- **Get User by ID**: Retrieves details of a specific user using their ID.
- **Delete User**: Allows admins to delete a user by their ID.
- **Get Logged-in User Profile Info**: Retrieves profile information for the currently logged-in user.
- **Get User Booking History**: Allows retrieval of booking history for a specific user by their ID.

### Room Management
- **Add New Room**: Admins can add a new room, specifying room details like type, price, and an optional photo.
- **Get All Rooms**: Retrieves a list of all rooms available in the hotel.
- **Get Room Types**: Provides a list of all available room types.
- **Get Room by ID**: Retrieves details of a specific room using its ID.
- **Get All Available Rooms**: Returns a list of all rooms that are currently available.
- **Get Available Rooms by Date and Type**: Allows users to find available rooms based on check-in/check-out dates and room type.
- **Update Room**: Admins can update details of an existing room, including type, price, and an optional photo.
- **Delete Room**: Admins can remove a room from the system.

### Booking Management
- **Create Booking**: Allows users to book a room by specifying the room ID and user ID.
- **Get All Bookings**: Admins can view a list of all bookings in the system.
- **Find Booking by Confirmation Code**: Enables users to retrieve booking details using a unique confirmation code.
- **Cancel Booking**: Allows users to cancel a booking by specifying the booking ID.

### AWS S3 Integration
- **File Upload and Download**: Supports uploading and downloading files (e.g., room images) to and from an AWS S3 bucket.

### Exception Handling
- **Comprehensive Exception Handling**: The application includes custom exceptions to handle various errors, ensuring user-friendly error messages.

## Technologies Used

- **Spring Boot**: Core framework for building the application.
- **Spring Security**: For handling authentication and authorization.
- **JWT**: For securing API endpoints.
- **JPA/Hibernate**: For database interactions.
- **MySQL**: Default database for storing hotel data.
- **AWS S3**: For file storage and management.
- **Maven**: For project management and dependency handling.
- **DTO**: Used for data transfer between layers.
