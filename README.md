##TASK MANGER APPLICATION

Tech Stack
Java
Spring Boot
Spring Data JPA
MySQL
HTML
Tailwind CSS
Features
Full CRUD operations for task management
Task status tracking (PENDING / COMPLETED)
RESTful API integration
Lightweight frontend connected to backend
Persistent storage using MySQL
API Endpoints

Task

POST /tasks – Create a new task
GET /tasks – Retrieve all tasks
GET /tasks/{id} – Retrieve a task by ID
PUT /tasks/{id} – Update a task
DELETE /tasks/{id} – Delete a task
Key Concepts Implemented
RESTful API design principles
Layered architecture (Controller → Service → Repository)
Database integration using JPA (ORM)
Frontend–backend communication using Fetch API
Basic CORS configuration
How to Run
Clone the repository
Create a MySQL database named taskdb
Update application.properties with your database credentials
Run the Spring Boot application
Open frontend/index.html in a browser
