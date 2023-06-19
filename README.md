# petCare-backend

Backend of the PetCare application.

## How to run this project locally

### Dependencies

To run this project locally, you need to install the dependencies:

- [Oracle OpenJDK 19](https://jdk.java.net/19/) 
  > IntelliJ downloads this version if it is set as the JDK version for the project.
- [PostgreSQL 15](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
  > During the installation of PostgreSQL, you will be asked to enter a password for the superuser (postgres) user. Keep this password as it will be used in other steps.

### Initial Database Configuration

It can be done via pgAdmin 4 or via SQL Shell (psql).

1. Log in to psql using the postgres login:
    ``` 
    # Press enter without typing anything for empty fields
    Server [localhost]:
    Database [postgres]: 
    Port [5432]:
    Username [postgres]:
    Password for user postgres: <enter previously registered password>
    ```

2. Create a database named petcare:
    ```
    CREATE DATABASE petcare;
    ```

3. Exit psql using the 'exit' command.

4. Fill in the password for the postgres user in the dev profile within the application.yml file located in src/main/resources.

5. Start the application using your IDE.
