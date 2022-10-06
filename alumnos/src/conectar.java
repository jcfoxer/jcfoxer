


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class conectar {
    
    Connection conectar=null;
public Connection conexion(){   
  try{
    Class.forName("com.mysql.jdbc.Driver");//.newInstance();
   
    conectar = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/alumnos?user=root&password=");
    
  }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}

   

    }
