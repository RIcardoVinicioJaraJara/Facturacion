package Controlador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package facturacion.conexion;
import java.sql.*;

/**
 *
 * @author WILSON O
 */
public class Conexion {

   
   
   
   private final String url = "jdbc:mysql://localhost/facturacion";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    
    public Conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");
         
         con = DriverManager.getConnection(url,"root","");
         if (con!=null){
           // System.out.println("Conexión a base de datos facturacion. listo");
         }
      }
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 

    
}
