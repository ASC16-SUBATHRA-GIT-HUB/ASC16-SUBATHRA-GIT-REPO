package JDBC;

public class JavaDel {

        public static void main(String[] args) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                System.out.println("Driver Loaded!");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=sqlserver;trustServerCertificate=true;";

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

