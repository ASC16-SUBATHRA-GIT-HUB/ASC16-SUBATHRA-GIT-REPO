package JDBC;
import  java.sql.*;
public class JdbcInsert {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!");

            String url = "jdbc:sqlserver://localhost:3306;databaseName=testdb;user=root;password=mysql";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established");

            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            String insertQuery = "INSERT INTO friend(id,email,name) VALUES (107,'suba@gmail.com','suba')";
            int rowsInserted = statement.executeUpdate(insertQuery);
            System.out.println(rowsInserted + " row(s) inserted.");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}