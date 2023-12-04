/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author favel
 */
public class ConexionSQL {
    // declaramos lo que usearemos 
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String db="tortilleria";
    private static final String url = "jdbc:mysql://localhost:3306/";
    private Connection conn;
    
    public ConexionSQL(){
        conn=null;
    }
    // comenzamos la conexion
    public Connection Conectar(){
        try{
            Class.forName(Driver);
            conn=DriverManager.getConnection(url+db, user,pass);
           //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage(),"error en la conexion",JOptionPane.ERROR_MESSAGE);
           System.exit(0);
        }
        return conn;
    }
    // metodo para deconectarse
    public void Desconectar(){
        try{
           conn.close();  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
       
    }
}
