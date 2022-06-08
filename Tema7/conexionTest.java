import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.Statement;

public class conexionTest {
        public static int countDb() {
            int count = 0;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://10.0.2.4/clientes","carlos","carlos");
                String query = "select count(*) FROM `Cliente` ";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                rs.next();
                count = rs.getInt(1);
                rs.close();
                conn.close();
                
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:");
                e.printStackTrace();
            }
            return count;
        }
        public static void insertDb() {           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://10.0.2.4/clientes","carlos","carlos");
                String query = "insert into Cliente(Nombre, Apellidos, NIF, Email, ID) values('Luis', 'Arrazabal', '3812938X', 'qwodjnqwoi@dnwqi.com', '3')";
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                conn.close();
                
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:");
                e.printStackTrace();
            }
        }
        public static void updateDb() {           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://10.0.2.4/clientes","carlos","carlos");
                String query = "update Cliente set Nombre = 'William' where Nombre = 'Luis'";
                Statement st = conn.createStatement();
                st.executeUpdate(query);
                conn.close();
                
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:");
                e.printStackTrace();
            }
        }
        public static void listDb() {           
            Cliente cliente;
            String [] arrayCliente = new String[5];
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://10.0.2.4/clientes","carlos","carlos");
                String query = "select * from Cliente";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                while(rs.next()) {
                    for (int i = 1; i < 6; i++) {
                        arrayCliente[i-1] = rs.getString(i); 
                    }
                    cliente = new Cliente(arrayCliente[0], arrayCliente[1], arrayCliente[2], arrayCliente[3],arrayCliente[4]);
                    System.out.println(cliente.toString());
                }
                conn.close();
                
            }
            catch(Exception e) {
                System.out.print("Do not connect to DB - Error:");
                e.printStackTrace();
            }
        }
        
    }
