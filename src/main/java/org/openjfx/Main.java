package org.openjfx;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TaskData taskData = new TaskData();

        Task tt = taskData.getTask(6);

        int id = taskData.insertTask("Assignment", "Java and Database assignment with database", tt.getDeadline(), "MEDIUM");
        System.out.println(id);

        /*
        System.out.println(tt);

        taskData.updateTask(6, "new task", tt.getDescription(), tt.getDeadline(), tt.getPriority());

        taskData.deleteTask(1);


        ArrayList<Task> tasks = taskData.getAllTasks();

        for(Task e:tasks){
            System.out.println(e);
        }*/

    }
}