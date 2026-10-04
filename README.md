# Job Application API

A job management application built using Java and Spring Boot. It provides REST APIs to add, view, search, update, and delete job records stored in a MySQL database.

I built this project while learning Spring Boot and working with REST APIs, Spring Data JPA, and MySQL. I also created a simple frontend using HTML, CSS, and JavaScript to interact with the APIs from a browser.

## Features

- View all available jobs
- Find a job by its ID
- Search jobs by name or keyword
- Filter jobs by salary range
- Add a single job or multiple jobs
- Update existing job details
- Delete a job by ID
- Store and retrieve job data using MySQL
- Test API endpoints using Postman

## Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **Data Access:** Spring Data JPA
- **Frontend:** HTML, CSS, JavaScript
- **API Testing:** Postman

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Check if the backend is running |
| GET | `/getjobs` | Get all jobs |
| GET | `/getjobs/id/{jobId}` | Find a job by ID |
| GET | `/getjobs/name/{jobName}` | Search by job name |
| GET | `/getjobs/keyword/{keyword}` | Search by keyword |
| GET | `/getjobs-by-jobpay/{min}/{max}` | Filter jobs by salary |
| POST | `/addjob` | Add a job |
| POST | `/addjobs` | Add multiple jobs |
| PUT | `/update-job` | Update a job |
| DELETE | `/delete-job/{jobId}` | Delete a job |

## Running the Project

### 1. Requirements

- Java JDK
- MySQL Server
- Maven, if your project uses Maven
- An IDE such as IntelliJ IDEA
- Postman (optional, for testing the APIs)

### 2. Set up the database

Create a MySQL database and configure the database URL, username, and password in your Spring Boot application's `application.properties` file.

Keep your database credentials out of GitHub. Use local configuration or environment variables for secrets.

### 3. Run the backend

Open the Spring Boot project in your IDE and run the main application class.

The API runs at:

`http://localhost:8080`

### 4. Open the frontend

Open the HTML frontend file in your browser. Make sure the backend is running and CORS is configured to allow requests from the frontend.

## What I Learned

- Building REST APIs with Spring Boot
- Using GET, POST, PUT, and DELETE requests
- Connecting a Spring Boot application to MySQL
- Using Spring Data JPA repositories
- Working with request bodies and path variables
- Testing API endpoints using Postman
- Connecting a browser-based frontend to a backend API

## Future Improvements

- Add request validation and global exception handling
- Introduce DTOs for API requests and responses
- Add authentication and authorization using Spring Security
- Improve API response status codes and error messages

---

This is my first complete job management project, and I'll continue improving it as I learn more about backend development.
