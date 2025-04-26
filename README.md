# 💼 Invest API Backend

Spring Boot backend for managing small investments. This API powers the Invest Mobile App built with React Native.

---

## ⚙️ Tech Stack
- Java 17
- Spring Boot 3.4.2
- PostgreSQL (Docker)
- Gradle
- Swagger UI

---

## 🚀 Getting Started

### 1. Clone the Repo
```bash
git clone https://github.com/your-username/invest-app.git
cd invest-app/backend
```

### 2. Run with Docker
```bash
./gradlew build
docker compose up
```

This will start both the API and PostgreSQL container.

### 3. Run Locally (Without Docker)
Make sure PostgreSQL is running and update `application.yml` with your DB credentials.
Then run:
```bash
./gradlew bootRun
```

---

## 📂 Folder Structure
```
backend/
├── src/main/java/
│   └── com/example/invest/   # Controllers, services, models
├── src/main/resources/
│   └── application.yml       # DB config, Swagger, etc
├── Dockerfile
├── docker-compose.yml
└── build.gradle
```

---

## 🧪 Running Tests
```bash
./gradlew test
```

GitHub Actions is also configured to auto-run tests on push.

---

## 🔌 API Endpoints
- `GET /api/investments` – List all investments
- `POST /api/investments` – Add new investment

Swagger UI available at:
```
http://localhost:8080/swagger-ui.html
```

---

## 🧠 Features
- RESTful API with CRUD operations
- DTOs and Service Layer structure
- Swagger for API docs
- Dockerized for quick deployment

---

## 🔧 To Do
- Add investment editing and deletion
- Add pagination and filtering
- Add authentication layer (optional)

---

## 📜 License
MIT License

