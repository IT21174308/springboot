# Springboot CRUD Application

This project is a simple **CRUD (Create, Read, Update, Delete)** application for managing student information. It is built and tested using **Postman** for backend operations and designed to demonstrate basic CRUD functionality in a student management system.

---

## Features

- Add new students with relevant details
- View a list of all students
- View student details by id
- Edit existing student information
- Delete student records

---

## Technologies Used

- **Springboot**
- **Java 17**
- **MySql** (Database)
- **Postman** (API Testing)

---

## Installation and Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/IT21174308/springboot.git
   ```

2. **Install Dependencies:**
   ```bash
   mvn clean install
   ```

3. **Set Up Environment Variables:**
   Change the `application.properties` file in the resources directory and configure the following:
   ```env
    spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
    spring.datasource.username=your_username
    spring.datasource.password=your_password
   ```

4. **Run the Application:**
   ```bash
   mvn spring-boot:run
   ```

5. **Test the APIs:**
   Use **Postman** to test the endpoints. Import the provided Postman collection (if available) or manually test the following endpoints:

    - **GET /students**: Retrieve all students
    - **GET /student/{id}**: Retrieve a single student by ID
    - **POST /student/add**: Add a new student    
    - **PUT /student/update/{id}**: Update student information
    - **DELETE /student/delete/{id}**: Delete a student

