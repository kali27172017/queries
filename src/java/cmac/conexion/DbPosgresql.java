
package cmac.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbPosgresql {
    
    
    private static final String driver = "org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/queries";
    private static final String usuario  = "postgres";
    private static final String clave = "postgres";
    static Connection cn;
    
   
      
    public static Connection getConnection() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException ex) {
            return null;
        }
    }

 
    
    
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
      }

 
    }

