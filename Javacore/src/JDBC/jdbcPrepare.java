package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;

public class jdbcPrepare {
        public static void main(String[] args) {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            Scanner scanner = new Scanner(System.in);

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Driver Loaded!");

                String url = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=sqlserver;trustServerCertificate=true;";
                connection = DriverManager.getConnection(url);
                System.out.println("Connection established!");


                String insertQuery = "INSERT INTO friend (id, email, name) VALUES (?, ?, ?)";
                preparedStatement = connection.prepareStatement(insertQuery);


                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                String name = scanner.nextLine();

                // Insert the user-provided row
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, name);
                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println(rowsInserted + " row(s) inserted.");

                for (int i = 1000; i <= 1100; i++) {
                    int newId = id + i;
                    String generatedEmail = "user" + newId + "@example.com";
                    String generatedName = name + i;

                    preparedStatement.setInt(1, newId);
                    preparedStatement.setString(2, generatedEmail);
                    preparedStatement.setString(3, generatedName);

                    preparedStatement.executeUpdate();
                }

                System.out.println("100 additional rows inserted with auto-generated IDs.");

            } catch (Exception exception) {
                exception.printStackTrace();
                System.err.println("Error: " + exception.getMessage());
            } finally {
                try {
                    if (preparedStatement != null && !preparedStatement.isClosed()) {
                        preparedStatement.close();
                    }
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                        System.out.println("Connection closed.");
                    }
                    scanner.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

