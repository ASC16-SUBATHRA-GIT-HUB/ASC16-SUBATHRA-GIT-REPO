package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {

    public static void main(String[] args) {


        Connection connection = null;

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=sqlserver;trustServerCertificate=true";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established");

            System.out.println("Enter user id to update: ");
            int id = sc.nextInt();
            sc.nextLine();


            System.out.println("Enter the name: ");
            String name = sc.nextLine();

        //    String sql = "UPDATE friend SET name ='Riya' WHERE id= 3";
            String sql = "UPDATE friend SET name = ? WHERE id= ?";   //to take user input
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, id);


            int rowsUpdated = stmt.executeUpdate();
                System.out.println("Updated:" + rowsUpdated + "rows(s) updated.");


        } catch (ClassNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }

    }

}

