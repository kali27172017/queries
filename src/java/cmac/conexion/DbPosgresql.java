
package cmac.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbPosgresql {
    
    Connection cn = null;
    private String url  = "jdbc:postgresql://localhost/queries";
    private String usuario  = "jorge";
    private String clave = "12345";
    
    
    public DbPosgresql() throws SQLException{
        try{
          cn  = DriverManager.getConnection(url, usuario,clave);
          if(cn!=null){
              System.out.println("Conexion exitosa");
          }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            if(cn!=null && !cn.isClosed()){
                cn.close();
            }
        }
    }
    
    
    public Connection postgresql(){
        return this.cn;
    }
}
