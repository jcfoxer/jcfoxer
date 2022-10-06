/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos_faltas;

import javax.swing.JOptionPane;


public class guardar_sanciones {
    
    
     conection bd=new conection  ();
     
    public void registrar_sanciones(String cod_sancion,String descripcion)
    {
        
        try
    {
        
        
       bd.conectar_base_datos(); 
      bd.sentencia.executeUpdate("insert into faltas ( cod_sancion,descripcion)values('"+cod_sancion+"','"+descripcion+"')");
      JOptionPane.showMessageDialog(null,"se registro con exito",".::mensaje ::.",JOptionPane.INFORMATION_MESSAGE);
    }
      
      catch (Exception e){
              JOptionPane.showMessageDialog(null,"error al cargar driver"+e.toString());
              }
      
      
    
    }

    
    }
    
    

