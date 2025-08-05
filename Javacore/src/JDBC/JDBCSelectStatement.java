package JDBC;
import java.sql.*;

public class JDBCSelectStatement {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded!");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=sqlserver;trustServerCertificate=true;";

            connection= DriverManager.getConnection(url);
            System.out.println("Connection Established");
            Statement statement = connection.createStatement();
            System.out.println("statement created");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM friend ");
            System.out.println("Result set Returned");


            while(resultSet.next()) {


                int id = resultSet.getInt("id");
                System.out.println("ID: " + id);
                String email = resultSet.getString("email");
                System.out.println("Email: " + email);
                String name = resultSet.getString("name");
                System.out.println("Name: " + name);

            }

            resultSet = statement.executeQuery("SELECT * FROM friend");
            System.out.println("Result set returned");
            System.out.println(resultSet);

        }
//// INSERT
//        String sqlInsert = "INSERT INTO users (name, email) VALUES (?,?)";
//        PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
//        psInsert.setString(1, "suba");
//        psInsert.setString(2, "suba@gmail.com");
//        psInsert.executeUpdate();

//// UPDATE
//        String sqlUpdate = "UPDATE users SET email = ? WHERE name = ?";
//        PreparedStatement psUpdate = conn.prepareStatement(sqlUpdate);
//        psUpdate.setString(1, "newalice@example.com");
//        psUpdate.setString(2, "Alice");
//        psUpdate.executeUpdate();
//
//// DELETE
//        String sqlDelete = "DELETE FROM users WHERE name = ?";
//        PreparedStatement psDelete = conn.prepareStatement(sqlDelete);
//        psDelete.setString(1, "Alice");
//        psDelete.executeUpdate();

        catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}