package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    static Connection conn = null;

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/consumo?" +
                            "user=root&password=");

            // Do something with the Connection
            System.out.println("Conected");

         return  conn;
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
        }
}
