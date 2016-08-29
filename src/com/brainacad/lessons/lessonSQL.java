package com.brainacad.lessons;

import java.io.IOException;
import java.sql.*;

/**
 * Created by mv on 22.08.2016.
 */
public class lessonSQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try (Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/javatest", "root", "")) {

            System.out.println("connected");

            Statement statement1 = dbConnection.createStatement();
            statement1.execute("Insert into users values (null, 'Kolia', 'Pechkin', 50)");

            Statement statement = dbConnection.createStatement();
            statement.execute("Select * From users");

            ResultSet res = statement.getResultSet();
            //while (res.next()) {
                int id = res.getInt("id");
                String firstName = res.getString("firstName");
                String lastName = res.getString("lastName");
                int age = res.getInt("age");

                System.out.println(id + " - " + firstName + " - " + lastName + " - " + age);
            //}


            String query = "SELECT * FROM Item WHERE ID=110";
            Statement stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next ()) {
                System.out.println("ID: " + rs.getInt("Id"));
                System.out.println("Description: " + rs.getString("Descrip"));
                System.out.println("Price: " + rs.getDouble("Price"));
                System.out.println("Quantity: " + rs.getInt("Quantity"));
            }

        }
        catch (SQLException e) {
            System.out.println("ddddd");
            e.printStackTrace();
        }






    }
}
