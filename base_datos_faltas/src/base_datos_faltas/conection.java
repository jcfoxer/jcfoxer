/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos_faltas;

import java.io.*;
import java.sql.*;
import javax.swing.*;

import  java.sql.DriverManager;
import java.sql.SQLException;

public class conection {

public static  java.sql.Connection conexion;
    
public Statement  sentencia;
public ResultSet resultado;


public void conectar_base_datos()
{ 
    try 
    {
        Class.forName("com.mysql.jdbc.Driver");
    conexion=DriverManager.getConnection("jdbc:mysql://localhost/faltas_sanciones?user=root&password=");
    sentencia=conexion.createStatement();
    }

catch (ClassNotFoundException exl)

{ 
    JOptionPane.showMessageDialog(null,"error al cargar el driver"+exl.toString()
    );
    System.exit(1);


}
  catch(SQLException ex)
  {
    JOptionPane.showMessageDialog(null,"error al crear Statement "+ex.toString()
    );
    System.exit(1);
  
  }
          
    
    
}

    
}

