import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexionTest {
        public static void main(String args[]) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://10.0.2.4/clientes","carlos", "carlos");
                String query = "SELECT * FROM `Cliente` ";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.close();
                conn.close();
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:");
                e.printStackTrace();
            }
        }
    }
