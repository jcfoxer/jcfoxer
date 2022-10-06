/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos_tiendita;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import  javax.swing.JOptionPane;
public class CONECTAR {
    
     private String driver ="com.mysql.jdbc.Driver";
    private String cadenaConeccion ="jdbc:mysql://127.0.0.1/tiendita";
    private String usuario ="root";
    private String  contraseña="";
    public Connection cc ;
    
        public CONECTAR() throws SQLException{
        
        
    try{
        Class.forName(driver);
    
    cc=DriverManager.getConnection(cadenaConeccion,usuario,contraseña);
    
    JOptionPane.showMessageDialog(null,"conectado a la base de datos  ");
        
        }
       catch (Exception e){
           
       JOptionPane.showMessageDialog(null,"no se ha podido establecer la conexion"+e.getMessage());
           
               }
        }

    Connection conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

   