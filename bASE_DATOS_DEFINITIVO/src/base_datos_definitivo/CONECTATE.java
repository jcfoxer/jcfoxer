/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos_definitivo;
import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 1
 */
public class CONECTATE {
    
    private String driver="com.mysql.jdbc.Driver";
    private String cadenaConeccion="jdbc:mysql://127.0.0.1/falta_sanciones";
    private String usuario ="root";
    private String password="";
    
    public Connection con;
    
    public CONECTATE (){
        try {
        Class.forName(driver);
        
        con=DriverManager.getConnection(cadenaConeccion,usuario,password);
            
                JOptionPane.showMessageDialog(null,"conectado a la base de datos ");

        }catch (Exception e){
        JOptionPane.showMessageDialog(null,"nose puede establecer conexion con la base de datos"+e.getMessage());
        }
        
    
    }
            
    
  
        }  
     
    
    
    
    