# Smart Expense Tracker API

A simple REST API built using Java Spring Boot to manage personal expenses.

## Features

- Add Expense
- View All Expenses
- Filter Expenses by Category
- Calculate Total Expenses
- Calculate Total Expenses by Category
- Delete Expense

## Technologies Used

- Java 21
- Spring Boot
- Maven

## How to Run

Clone the repository

```bash
git clone <repository-url>
```

Navigate to the project

```bash
cd expense-tracker
```

Run the application

```bash
mvn spring-boot:run
```

The application starts on

```
http://localhost:8080
```

## API Endpoints

POST /expenses

GET /expenses

GET /expenses/category/{category}

GET /expenses/total

GET /expenses/total/{category}

DELETE /expenses/{id}