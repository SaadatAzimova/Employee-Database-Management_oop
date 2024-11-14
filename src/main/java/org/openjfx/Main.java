package org.openjfx;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    private static Connection conn; // Make conn static to use it in the static main method

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employee_db"; // Ensure the database name is correct
        String username = "postgres";
        String password = "123456";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database is successfully connected...");
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return;  // Exit if the connection fails
        }

        // Pass the connection to EmployeeData constructor
        EmployeeData taskData = new EmployeeData(conn);

        // Make sure to check the list size before accessing an index
        ArrayList<Employee> employees = taskData.getAllEmployees();
        if (!employees.isEmpty()) {
            for (Employee emp : employees) {
                System.out.println(emp);  // Assuming Employee class has a toString() method
            }
        } else {
            System.out.println("No employees found.");
        }
    }
}
