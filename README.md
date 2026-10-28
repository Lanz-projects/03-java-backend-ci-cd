# Java Backend CI/CD Practice

A small Spring Boot REST API built with Java and Maven. This project is a practice space for adding automated tests, GitHub Actions checks, releases, and deployments.

## API

`GET /api/greeting?name=Ada` returns:

```json
{"message":"Hello, Ada!"}
```

If `name` is missing or blank, the API returns `Hello, world!`.

## Run locally

Requirements: JDK 17 or newer and Maven.

Start the application:

```powershell
mvn spring-boot:run
```

Then visit `http://localhost:8080/api/greeting?name=Ada`.

## Run tests

```powershell
mvn test
```

## Build the JAR

```powershell
mvn package
```

The built JAR is placed in `target/`.

## CI/CD practice goals

- Run tests and build checks for pull requests.
- Package and release the application JAR.
- Practice deploying the application to staging and production.
