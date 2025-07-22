# Employee Management API (Spring Boot + PostgreSQL)

This project is a **RESTful API** for managing employees. It allows you to **Create, Read, Update, and Delete (CRUD)** employee records with **PostgreSQL** as the database.

## **Features**
- CRUD operations for Employee entity.
- Integrated **PostgreSQL** with Spring Data JPA.
- **Input Validation** using Jakarta Bean Validation.
- **Custom Exception Handling** with meaningful error responses.
- Auto table creation with `spring.jpa.hibernate.ddl-auto=update`.

---

## **Tech Stack**
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **PostgreSQL**
- **Jakarta Validation (Bean Validation)**

---

## **Entity: Employee**
| Field      | Type        | Constraints                            |
|------------|-------------|-----------------------------------------|
| `id`       | int         | Auto-generated (Primary Key)           |
| `name`     | String      | Not blank, max 100 chars               |
| `email`    | String      | Valid email, unique, max 150 chars     |
| `jobtitle` | String      | Not blank, max 100 chars               |
| `department`| String     | Not blank, max 100 chars               |
| `salary`   | BigDecimal  | Positive, max 8 digits + 2 decimals    |

---
# Steps to Run Employee Management API (Spring Boot + PostgreSQL)

1. First, extract the project ZIP file (or clone/download the repository from GitHub).

2. Open Eclipse IDE:
   - Go to File → Import → Existing Maven Project.
   - Browse to the extracted project folder and import it.

3. Configure Database:
   - Open src/main/resources/application.properties
   - Update the PostgreSQL database URL, username, and password:
        spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
        spring.datasource.username=your_username
        spring.datasource.password=your_password

4. Run the Application:
   - Right-click on the project → Run As → Spring Boot App.
   - Ensure that the application runs on port 8360 (or as defined in application.properties).

5. Test API Using Postman:
   - Open Postman and perform the following operations:

     **1. POST (Insert Employee)**
     URL: http://localhost:8360/insertemp
     Body (raw JSON):
     {
       "name": "Minal",
       "email": "minal@gmail.com",
       "jobtitle": "C# Dev",
       "department": "IT",
       "salary": 55000.00
     }

     **2. GET (Find All Employees)**
     URL: http://localhost:8360/findallemp

     **3. GET (Find Employee by ID)**
     URL: http://localhost:8360/findempbyid/1

     **4. PUT (Update Employee)**
     URL: http://localhost:8360/updateemp
     Body (raw JSON):
     {
       "id": 1,
       "name": "Vivek",
       "email": "lohakarevivek002gmail.com",
       "jobtitle": "accosiate",
       "department": "it",
       "salary": 50000
     }

     **5. DELETE (Delete Employee by ID)**
     URL: http://localhost:8360/deletebyid/{id}
     Example: http://localhost:8360/deletebyid/1
