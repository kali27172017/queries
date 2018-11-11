/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmac.models;

/**
 *
 * @author jorge
 */
public class Usuario {
    private String usuario;
    private String clave;
    
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    
    public void setClave(String clave){
        this.clave  = clave;
    }
    
    
    public String getUsuario(){
        return this.usuario;
    }
    
    
    public String getClave(){
        return this.clave;
    }
}
