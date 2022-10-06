/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos;
import java.io.*;
import java.sql.*; 
import javax.swing.*;
import java.sql.DriverManager.*;
import java.sql.Connection;

/**
 *
 * @author 1
 */
public class conexion {
   
    
    public static java.sql.Connection conexion;
    public Statement sentencia;
    
    public ResultSet resultado;
    

    
public void Conectar_Base_Datos() throws SQLException     
{

try

{
Class.forName("com.mysql.jdbc.Driver");
conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1/falta_sanciones?user=root&password=");
sentencia=conexion.createStatement();
}

catch (ClassNotFoundException ex1)

{
 ex1.printStackTrace();

JOptionPane.showMessageDialog(null,"error a cargar el driver"+ex1.toString());
System.exit(1);

}
}
}