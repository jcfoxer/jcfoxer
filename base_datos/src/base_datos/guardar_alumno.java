/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos;

import java.sql.Connection;
import javax.swing.JOptionPane;






public class guardar_alumno {
    
    
    conexion  bd=new conexion();
    
    public void registrar_alumno(String cod_alumno,string apat,string amat,String nombre);
    
    try 
    
    { bd.Conectar_Base_Datos();
    
    bd.sentencia.executeUpdate("insert into alumno (cod_alumno");
    
     JOption.ShowMesaageDialog(null)       
            
            
    }
    
}
