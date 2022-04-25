/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT.connect.COfertas.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Orozco S
 */
public class ConexionBD {
    
    public static final String URL ="jdbc:mysql://localhost:3305/connect";
    //TODO cambiar puerto 3305 -> 3306
    public static final String USER = "root";
    public static final String PASSWORD = "n0m3l0";
    
    public static Connection getConexion() throws SQLException {
    
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Se Conecta ♥");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
        
        //JOptionPane.showMessageDialog(null, "Lo Completa "+conexion.getCatalog());
        return conexion;
        
    }
    
    
}
