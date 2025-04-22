# 🧪 QA Automation & Manual Testing Project

This project is part of my portfolio as an aspiring **Junior QA Engineer**. It includes both **automated** and **manual testing** for web and API layers using Selenium, TestNG, Postman, and Excel test cases.

---

## 🚀 Technologies Used

- **Java 17**
- **Selenium WebDriver**
- **TestNG**
- **Postman** (API Testing)
- **Maven** (Project Management)
- **Excel** (Manual Test Cases)

---

## 📂 Project Structure

```
qa-demo-automation-testing/
├── src/
│   └── test/java/
│       └── LoginTest.java         # Automated UI Tests
├── postman/
│   └── jsonplaceholder-tests.json # API test collection
├── manual-test-cases/
│   └── Manual_Test_Cases_QA_Project.xlsx
├── pom.xml                        # Maven dependencies
└── README.md
```

---

## ✅ Features

### Web UI Tests (Selenium + TestNG)

- Valid login
- Invalid login
- Logout functionality
- Access to protected page after login

### API Tests (Postman)

- GET /posts → status 200 + 100 items
- GET /posts/1 → valid response
- POST /posts → post creation
- PUT /posts/1 → post update
- DELETE /posts/1 → deletion

### Manual Test Cases (Excel)

- 5+ clear test cases with steps, expected results, and status
- Covers login, logout, API calls

---

## ▶️ How to Run Automated Tests

1. Clone the repository:
```bash
git clone https://github.com/YOUR_USERNAME/qa-demo-automation-testing.git
cd qa-demo-automation-testing
```

2. Run tests:
```bash
mvn test
```

> Make sure you have Java, Maven, and ChromeDriver installed and configured in PATH.

---

## 🧾 Manual Testing

Open the Excel file:
```
/manual-test-cases/Manual_Test_Cases_QA_Project.xlsx
```

---

## 🔗 Postman API Collection

1. Open Postman
2. Import file:
```
/postman/jsonplaceholder-tests.json
```
3. Run the collection or use Collection Runner

---

---

## 🧪 API Automated Tests (RestAssured)

These tests are written in Java using the RestAssured library and TestNG.

### ✅ Test 1 – GET /posts/1
- Verifies status code is **200**
- Checks if body contains `userId`, `title`, and `body`

### ✅ Test 2 – POST /posts
- Sends a new post with `title`, `body`, and `userId`
- Verifies status code **201**
- Confirms the response contains sent values

## 👤 Author

**Ionut-Laurentiu Cojocaru**  
💼 Aspiring Junior QA Engineer  
📧 cojocaruionutlaurentiu@gmail.com  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/ionut-laurențiu-cojocaru-526763297)

---

⭐️ *Feel free to fork this project, use it as reference, or contact me for collaboration or QA positions!*
