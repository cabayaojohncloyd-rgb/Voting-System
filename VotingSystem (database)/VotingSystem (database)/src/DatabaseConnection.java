import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL      = "jdbc:mysql://localhost:3306/voting_system";
    private static final String USER     = "root";
    private static final String PASSWORD = "";   // XAMPP default: no password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found. Add mysql-connector-j to your project libraries.", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
