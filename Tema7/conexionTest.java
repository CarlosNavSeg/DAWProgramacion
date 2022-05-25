import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class conexionTest {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.204.156:3306", "phpmyadmin", "carlos"); 
        java.sql.Statement mysStatement = conexion.createStatement();
    }   
}