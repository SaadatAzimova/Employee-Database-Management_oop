package org.openjfx;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<Task>();

        Connection conn;
        String url = "jdbc:postgresql:testdb"; // testdb is a name of localhost database
        String username = "postgres";
        String password = "postgres";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database is connected...");

            String sql = "SELECT * FROM TASKS WHERE PRIORITY = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "HIGH");
            ResultSet resultSet = preparedStatement.executeQuery();

            while( resultSet.next() ){
                int id = resultSet.getInt("taskId") ;
                String name= resultSet.getString("taskname");
                String desc =  resultSet.getString("description");
                Date deadline =  resultSet.getDate("deadline");
                String p =  resultSet.getString("priority");


                Task task = new Task(id, name, desc, deadline, p);
                tasks.add(task);
                //System.out.println(task);
            }
            resultSet.close();

            conn.close();

            for(Task e:tasks){
                System.out.println(e);
            }




        }
        catch(SQLException e){
            System.out.println(e.toString());
        }


    }
}