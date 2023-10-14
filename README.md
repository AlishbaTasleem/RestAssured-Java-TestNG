# Rest Assured Java TestNG (Create Booking API)

This repository contains automation tests for the Booking API using Rest Assured, TestNG, and Maven.

## Table of Contents

- [Setup & Installation](#setup--installation)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contribution Guidelines](#contribution-guidelines)

## Setup & Installation

1. **Prerequisites**:
   - Java 8 or higher
   - Maven

2. **Clone the Repository**:
```bash
git clone https://github.com/AlishbaTasleem/RestAssured-Java-TestNG
```
3. **Install Dependencies**:
```bash
mvn clean install
```
   


## Running Tests

1. Navigate to the project directory.
2. Run tests using the following command:
```bash
mvn test
```


## Project Structure

- **src/main/java**: Contains utility and configuration classes.
- **org.example**: Application-related classes.
- **src/test/java**: Contains the test classes, base test setup, and utility functions.
- **base**: Base classes for setting up Rest Assured.
- **tests**: Test cases for the Booking API.
- **utils**: Utility classes for tests.
- **resources**: Configuration files such as `config.properties`.
- **pom.xml**: Maven build and configuration file.

## Contribution Guidelines

1. Fork the repository and create your branch from `master`.
2. Ensure that tests pass.
3. Issue that pull request!
