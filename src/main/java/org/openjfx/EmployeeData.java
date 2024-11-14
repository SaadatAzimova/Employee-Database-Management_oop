package org.openjfx;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeData {
    private Connection conn;

    // Constructor that accepts the connection
    public EmployeeData(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            String sql = "SELECT * FROM employee";
            PreparedStatement preparedStatement = this.conn.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                Date date = resultSet.getDate("hireDate");

                Employee employee = new Employee(id, name, position, salary, date);
                employees.add(employee);
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        return employees;
    }
}
