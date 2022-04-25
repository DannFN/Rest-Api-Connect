/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT.connect.VWOfertas;

import DOT.connect.COfertas.bd.COfertasBD;
import DOT.connect.COfertas.pojos.COfertas;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Orozco S
 */
@Path("VWOfertas")
public class JSONOfertasResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of JSONOfertasResource
     */
    public JSONOfertasResource() {
    }

    /**
     * Retrieves representation of an instance of DOT.connect.VWOfertas.JSONOfertasResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("Ofertas")
    
    ///http://localhost:52089/JSonRespBD/webresources/VWOfertas/Ofertas
    @Produces(MediaType.TEXT_PLAIN)
    public String getXml() {
        //TODO return proper representation object
        return "Hola alv<br>\n https://github.com/tcrurav/PGL-ProveedorContenido-Parte-3";
    }

    @GET
    //@Path("Ofertas")
    
    ///http://localhost:52089/JSonRespBD/webresources/VWOfertas/Ofertas
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllOfertas() {
        //TODO return proper representation object
        List <COfertas> ofertas;
        try {
            ofertas = COfertasBD.getAllVWOfertas();
            String json = new Gson().toJson(ofertas);
            return Response.ok(json, MediaType.APPLICATION_JSON).build();
        } catch (SQLException ex) {
            return Response.status(Response.Status.SEE_OTHER).entity("error").build();
        }
    }
    
    
    /**
     * PUT method for updating or creating an instance of JSONOfertasResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
