Employee Database Management System
Project Description
The Employee Database Management System is a Java-based application that provides CRUD (Create, Read, Update, Delete) operations for managing employee data in a PostgreSQL database. It demonstrates the use of:

1.Java Database Connectivity (JDBC)
2.Object-Oriented Programming (OOP)
3.SQL queries for database operations

Features
1.Add New Employees: Insert new employee records into the database.
2.View All Employees: Retrieve and display all employee records.
3.Update Employee Details: Modify employee information (e.g., name, position, salary, hire date).
4.Delete Employees: Remove specific employee records from the database.
5.View a Specific Employee: Retrieve details of an employee by their ID.

Database Setup:
I created a database named employee_db.
Executed the following SQL script to create the employee table:

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    position VARCHAR(50),
    salary DOUBLE PRECISION,
    hireDate DATE
);

How to Use
Modify the Main.java file:

1. Add a New Employee
   
Employee newEmployee = new Employee("Aidana", "office-manager", 7900, Date.valueOf("2024-11-11"));
int employeeId = employeeData.createEmployee(newEmployee);
System.out.println("New employee created with ID: " + employeeId);

2.View All Employees
Call the getAllEmployees method:

ArrayList<Employee> employees = employeeData.getAllEmployees();
for (Employee emp : employees) {
    System.out.println(emp);
}

3.Update an Employee
Update specific details by ID:

int employeeId = 3;
String newName = "Aiturgan";
String newPosition = "Team Lead";
double newSalary = 85000.0;
Date newHireDate = Date.valueOf("2024-11-01");

employeeData.updateEmployee(employeeId, newName, newPosition, newSalary, newHireDate);

4.Delete an Employee
Delete an employee by ID:


int employeeIdToDelete = 4;
employeeData.deleteEmployee(employeeIdToDelete);
View a Specific Employee
Retrieve an employee by ID:

5.
int employeeId = 2;
Employee employee = employeeData.getEmployee(employeeId);
System.out.println(employee);

1.initial database

![db1](https://github.com/user-attachments/assets/2f27cdf1-a567-4a2a-8a74-dcc67d51792b)

2.creating new object
![db2](https://github.com/user-attachments/assets/138ed014-a8b0-4236-b9e4-ec605a3b8770)
3.retrieving employee by id
![db3](https://github.com/user-attachments/assets/8ec7319b-0198-4031-95cd-7794aa3e676e)
4.deleting emloyee by id 
![db5](https://github.com/user-attachments/assets/0881c46a-fba6-4878-992b-8787cee04425)

5. updating employee
![db6](https://github.com/user-attachments/assets/4637319d-26dc-4a55-9eee-3a6e1bae1fb7)


