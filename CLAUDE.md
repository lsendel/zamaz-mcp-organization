# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Important Reference Documents

Be aware of these user-specific documentation files that may contain additional context:
- `~/.claude/CLAUDE-REFERENCE.md`: Contains user-defined development processes and workflows coding standards and conventions specific to the user's preferences

These documents should be consulted when available to ensure alignment with the user's established practices.

## Project Overview

This is the zamaz-mcp-organization repository - an Organization management service for Zamaz MCP microservices. It's a Spring Boot 3.2.2 application using Java 21.

## Development Setup

### Prerequisites
- Java 21
- Maven 3.6+
- PostgreSQL (for runtime)
- Redis (for caching)

### Build Commands
```bash
# Clean and compile the project
mvn clean compile

# Run tests
mvn test

# Package the application
mvn clean package

# Run the application
mvn spring-boot:run

# Run specific test class
mvn test -Dtest=ClassName

# Skip tests during build
mvn clean package -DskipTests
```

### Dependencies Note
This project depends on a common module (`com.zamaz.mcp.common`) that contains shared domain models and value objects. Ensure this dependency is available in your local Maven repository or accessible via your organization's Maven repository.

## Architecture

### Package Structure
- `com.zamaz.mcp.organization.domain` - Domain models and business logic
- `com.zamaz.mcp.organization.dto` - Data Transfer Objects
- `com.zamaz.mcp.organization.repository` - JPA repositories
- `com.zamaz.mcp.organization.service` - Business services
- `com.zamaz.mcp.organization.controller` - REST controllers
- `com.zamaz.mcp.organization.config` - Configuration classes

### Key Technologies
- Spring Boot 3.2.2 with Spring Web, Data JPA, Security, and AOP
- PostgreSQL database with Flyway migrations
- Redis for caching
- Spring Cloud Config for configuration management
- MapStruct for DTO mapping
- Lombok for boilerplate reduction
- Micrometer with Prometheus for monitoring
- SpringDoc OpenAPI for API documentation
- Testcontainers for integration testing

### Database Migrations
Flyway migrations are located in `src/main/resources/db/migration/`

## Important Notes

- The project is configured as a Java module in IntelliJ IDEA
- The repository includes .zencoder configuration with docs/ and rules/ directories reserved for future use
- GitHub Actions workflows are configured for Claude code review