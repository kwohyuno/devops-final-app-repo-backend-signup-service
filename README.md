# Backend Signup Service

A Spring Boot microservice for user registration and management with secure password handling and RESTful API endpoints.

## 🚀 Features

- **User Registration**: Secure member signup with password encryption
- **User Management**: CRUD operations for member data
- **Security**: BCrypt password hashing and Spring Security integration
- **Database**: MySQL integration with JPA/Hibernate
- **Docker Support**: Containerized deployment with Docker Compose
- **CI/CD**: Automated deployment with GitHub Actions to AWS ECR
- **Health Checks**: Application health monitoring endpoints

## 🛠️ Technology Stack

- **Backend**: Spring Boot 3.3.3
- **Language**: Java 17
- **Database**: MySQL 8.0
- **ORM**: Spring Data JPA with Hibernate
- **Security**: Spring Security with BCrypt
- **Build Tool**: Maven
- **Container**: Docker & Docker Compose
- **Cloud**: AWS ECR for container registry
- **CI/CD**: GitHub Actions

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+
- Docker & Docker Compose (for containerized deployment)

## 🏗️ Project Structure

```
src/main/java/com/example/SpringDemo/
├── Controller/
│   ├── HealthController.java
│   └── MemberController.java
├── Model/
│   └── Member.java
├── Repository/
│   └── MemberRepository.java
├── Services/
│   └── MemberService.java
├── config/
│   └── SecurityConfig.java
└── SpringDemoApplication.java
```

## 🚀 Quick Start

### Local Development

1. **Clone the repository**
   ```bash
   git clone https://github.com/kwohyuno/devops-final-app-repo-backend-signup-service.git
   cd devops-final-app-repo-backend-signup-service
   ```

2. **Configure Database**
   - Update `application.properties` with your MySQL connection details
   - Ensure MySQL server is running

3. **Run the application**
   ```bash
   # Using Maven wrapper
   ./mvnw spring-boot:run
   
   # Or using Maven directly
   mvn spring-boot:run
   ```

4. **Access the application**
   - Application will be available at `http://localhost:8081`

### Docker Deployment

1. **Build and run with Docker Compose**
   ```bash
   docker-compose up --build
   ```

2. **Access the application**
   - Backend: `http://localhost:8080`
   - Frontend: `http://localhost:80`

## 📡 API Endpoints

### Member Management

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/members/create` | Create a new member |
| `GET` | `/members/` | Get all members |
| `POST` | `/members/update` | Update member information |

### Health Check

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/api2/health` | Application health status |

## 📊 Data Model

### Member Entity

```java
{
  "id": Integer,
  "userId": String (unique),
  "password": String (encrypted),
  "email": String,
  "createdAt": Timestamp
}
```

## 🔐 Security Features

- **Password Encryption**: BCrypt hashing for secure password storage
- **CORS Configuration**: Cross-origin resource sharing enabled
- **CSRF Protection**: Disabled for API endpoints
- **Spring Security**: Integrated security framework

## 🐳 Docker Configuration

The project includes Docker support with:

- **Backend Dockerfile**: Located at `src/main/java/Dockerfile`
- **Docker Compose**: Multi-service orchestration
- **Environment Variables**: Configurable database connections

## 🔄 CI/CD Pipeline

### GitHub Actions Workflow

The project uses GitHub Actions for automated deployment:

- **Trigger**: Push to `main` branch
- **Build**: Docker image build
- **Deploy**: Push to AWS ECR
- **Environment**: AWS credentials configured via secrets

### Release Management

- **Semantic Versioning**: Automated version management
- **Changelog**: Automatic changelog generation
- **Release Notes**: Detailed release documentation

## ⚙️ Configuration


### Environment Variables

For Docker deployment, configure these environment variables:

- `RDS_ENDPOINT`: MySQL database endpoint
- `DB_USERNAME`: Database username
- `DB_PASSWORD`: Database password
- `API_URL`: Frontend API URL

## 🧪 Testing

Run tests using Maven:

```bash
mvn test
```

## 📝 Development

### Adding New Features

1. Create model classes in `Model/` package
2. Add repository interfaces in `Repository/` package
3. Implement business logic in `Services/` package
4. Create REST controllers in `Controller/` package
5. Update security configuration if needed

### Code Style

- Follow Java naming conventions
- Use Lombok for boilerplate code reduction
- Implement proper exception handling
- Add comprehensive documentation

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests for new functionality
5. Submit a pull request

## 📄 License

This project is licensed under the MIT License.

## 📞 Support

For questions or issues, please create an issue in the GitHub repository.

---

**Version**: 1.0.3  
**Last Updated**: March 2025  
**Maintainer**: kwohyuno 
