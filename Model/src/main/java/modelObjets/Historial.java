package modelObjets;

import java.util.Date;//importo para usar variables tipo Date

public class Historial {

    /*
    autor: david
    hora 15:02
    seccion de atributos
    principales atributos que componen al objeto
    */
    int idLibro;
    int idSocio;
    Date fechaPrestamo = new Date();
    Date fechaRetorno = new Date();
    Date fechaReal = null;

    /*
    autor: david
    hora 15:05
    seccion de getters and setters
    para obtener y modificar los datos
     */
    public int getIdLibro() {
        return idLibro;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaRetorno() {
        return fechaRetorno;
    }
    
    public Date getFechaReal() {
        return fechaReal;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaRetorno(Date fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }
    
    public void setFechaReal(Date fechaReal) {
        this.fechaReal = fechaReal;
    }

}
