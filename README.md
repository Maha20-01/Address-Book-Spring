# Address Book App

This is a simple Spring Boot REST API project for managing Address Book contacts.  
It demonstrates CRUD operations using REST APIs and follows layered architecture (Controller, Service, DTO).

---

## 🚀 Features
- Get all contacts
- Get contact by ID
- Add new contact
- Update contact by ID
- Delete contact by ID

---

## 🛠 Tech Stack
- Java
- Spring Boot
- Maven
- REST API

---

## 📂 Project Structure
- Controller → Handles HTTP requests
- Service → Contains business logic
- DTO → Transfers data between client and server

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /addressbook | Get all contacts |
| GET | /addressbook/{id} | Get contact by ID |
| POST | /addressbook/create | Add new contact |
| PUT | /addressbook/update/{id} | Update contact |
| DELETE | /addressbook/delete/{id} | Delete contact |

---

## ▶️ Run the Project
1. Open the project in IntelliJ IDEA
2. Load Maven dependencies
3. Run AddressbookappApplication.java
4. Open browser or Postman:
   http://localhost:8080/addressbook/

---

## 🧪 Testing
- APIs can be tested using Postman or cURL
- Data is currently stored in memory (List)

---
