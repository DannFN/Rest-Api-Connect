/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOT.connect.COfertas.pojos;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Orozco S
 */

@XmlRootElement
public class COfertas {
    private int IdOferta;
    private int IdOrganizacion;
    private String Titulo;
    private String Descripcion;
    private int IdCategoria;
    private String Beneficios;
    private double Pago;
    private int IdPeriodoDePago;
    private double Latitud;
    private double Longitud;

    public COfertas() {
    }

    public COfertas(int IdOferta, int IdOrganizacion, String Titulo, String Descripcion, int IdCategoria, String Beneficios, double Pago, int IdPeriodoDePago, double Latitud, double Longitud) {
        this.IdOferta = IdOferta;
        this.IdOrganizacion = IdOrganizacion;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.IdCategoria = IdCategoria;
        this.Beneficios = Beneficios;
        this.Pago = Pago;
        this.IdPeriodoDePago = IdPeriodoDePago;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    public int getIdOferta() {
        return IdOferta;
    }

    public void setIdOferta(int IdOferta) {
        this.IdOferta = IdOferta;
    }

    public int getIdOrganizacion() {
        return IdOrganizacion;
    }

    public void setIdOrganizacion(int IdOrganizacion) {
        this.IdOrganizacion = IdOrganizacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getBeneficios() {
        return Beneficios;
    }

    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }

    public double getPago() {
        return Pago;
    }

    public void setPago(double Pago) {
        this.Pago = Pago;
    }

    public int getIdPeriodoDePago() {
        return IdPeriodoDePago;
    }

    public void setIdPeriodoDePago(int IdPeriodoDePago) {
        this.IdPeriodoDePago = IdPeriodoDePago;
    }

    public double getLatitud() {
        return Latitud;
    }

    public void setLatitud(double Latitud) {
        this.Latitud = Latitud;
    }

    public double getLongitud() {
        return Longitud;
    }

    public void setLongitud(double Longitud) {
        this.Longitud = Longitud;
    }

    
    
}
