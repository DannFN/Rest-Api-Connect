/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT.connect.COfertas.bd;

import DOT.connect.COfertas.pojos.COfertas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Orozco S
 */
public class COfertasBD {
    
    public static ArrayList<COfertas> getAllVWOfertas() throws SQLException{
        
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            conexion = ConexionBD.getConexion();
            ArrayList <COfertas> vofertass = new ArrayList<>();
            
            ps = conexion.prepareStatement("SELECT * FROM COferta;");
            //TODO Maybe la wea por asreas
            rs = ps.executeQuery();
            
            COfertas oferta;
            
            while(rs.next()){
                oferta = new COfertas (
                rs.getInt("IdOferta"),
                rs.getInt("IdOrganizacion"),
                rs.getString("Titulo"),
                rs.getString("Descripcion"),
                rs.getInt("IdCategoria"),
                rs.getString("Beneficios"),
                rs.getDouble("Pago"),
                rs.getInt("IdPeriodoDePago"),
                rs.getDouble("Latitud"),
                rs.getDouble("Longitud")
                );
                vofertass.add(oferta);
            }
            
            return vofertass;
    
        }catch  (Exception e){
            System.out.println(e);
        }
        finally {
            if (ps != null) {
                ps.close();
            }
            if (rs !=null) {
                rs.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        }
        
        return null;
    }
    
    
    
}
