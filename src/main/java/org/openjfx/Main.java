package org.openjfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        }
    }
}
