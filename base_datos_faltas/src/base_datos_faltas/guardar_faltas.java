/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos_faltas;

import javax.swing.JOptionPane;



public class guardar_faltas {
    
    conection bd=new conection();
    public void registra_falta(String cod_falta,String descripcion)
    {
        
        try
    {
        
        
       bd.conectar_base_datos(); 
      bd.sentencia.executeUpdate("insert into faltas( cod_falta,descripcion)values('"+cod_falta+"','"+descripcion+"')");
      JOptionPane.showMessageDialog(null,"se registro con exito",".::mensaje ::.",JOptionPane.INFORMATION_MESSAGE);
    }
      
      catch (Exception e){
              JOptionPane.showMessageDialog(null,"error al cargar driver"+e.toString());
              }
      
      
    
    }
    
    
    }
    
    
    

