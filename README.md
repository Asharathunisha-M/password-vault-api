# 🔐 Password Vault REST API

A simple Spring Boot-based REST API to store and manage website passwords. Built with clean CRUD operations and follows RESTful principles.

---

## 🚀 Features

- Add, view, update, and delete saved password entries
- REST API built with Spring Boot
- Clean separation of controller, service, and repository layers
- Maven project structure

---

## 📁 Folder Structure
passwordvault/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/passwordvault/
│ │ │ ├── controller/
│ │ │ ├── service/
│ │ │ ├── model/
│ │ │ └── repository/
│ │ └── resources/
│ │ └── application.properties
├── pom.xml


---

## 🧪 API Endpoints

| Method | Endpoint                | Description                    |
|--------|-------------------------|--------------------------------|
| GET    | `/api/passwords`        | Get all saved passwords        |
| GET    | `/api/passwords/{id}`   | Get password by ID             |
| POST   | `/api/passwords`        | Save a new password entry      |
| PUT    | `/api/passwords/{id}`   | Update an existing password    |
| DELETE | `/api/passwords/{id}`   | Delete a password entry        |

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Maven
- RESTful API
- Postman (for testing)

---

## 📦 How to Run

1. **Clone the repository**
2. Open in **Eclipse** or **IntelliJ**
3. Run the main class:  
   `com.example.passwordvault.PasswordvaultApplication`
4. Open Postman and test at:  
   `http://localhost:8086/api/passwords`

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

## 👤 Author

**Asharathunisha M**  
GitHub: [Asharathunisha-M](https://github.com/Asharathunisha-M)

---
