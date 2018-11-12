/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmac.repository;

import cmac.conexion.DbPosgresql;
import java.sql.Statement;

/**
 *
 * @author jorge
 */
public class UserRepository extends DbPosgresql{
    
     Statement stmt  = null;
    
     public Boolean verifyLogin(String usuario,String clave){
         String sql  = "SELECT  * FROM user WHERE usuario = ? ";
         
         return null;
         
     }
    
}
