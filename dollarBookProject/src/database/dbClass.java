package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbClass {
	public static final String URL = "jdbc:mysql://localhost:3306/dollarbookshop";
	public static final String USERNAME  = "root";
	private static final String PASSWORD = "";
	
    // Method to establish and return a database connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load the MySQL JDBC driver (optional for modern Java versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Database connection successful!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
        return connection;
    }
	
}
