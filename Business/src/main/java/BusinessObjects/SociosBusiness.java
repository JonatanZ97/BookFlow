package BusinessObjects;

import ModelFunctions.SocioDAOImpl;
import java.util.ArrayList;
import java.util.Date;
import modelObjets.Socio;

public class SociosBusiness {
    
     String nombre;
    String apellido;
    long dni;
    Date fechaNacimiento = new Date();
    long telefono;
    String mail;
    String direccion;
    boolean penalizado = false;
    String motivoPenalizado;

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public boolean getPenalizado() {
        return penalizado;
    }
    
    public String getMotivoPenalizado() {
        return motivoPenalizado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }
    
    public void setMotivoPenalizado(String motivoPenalizado) {
        this.motivoPenalizado = motivoPenalizado;
    }
    
    // Método para obtener la lista de SociosBusiness
    public static ArrayList<SociosBusiness> getListaUsuarios() {

        // Creamos la lista que devolveremos
        ArrayList<SociosBusiness> listaSocios = new ArrayList<>();

        // Creamos una instancia de SocioDAOImpl para obtener los datos de socios
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de socios desde socioModel
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la lista de Socio y convertimos cada uno en SociosBusiness
        for (Socio socio : listaModel) {
            // Crear una nueva instancia de SociosBusiness
            SociosBusiness socioBusiness = new SociosBusiness();

            // Copiamos los datos de Socio a SociosBusiness
            socioBusiness.setNombre(socio.getNombre());
            socioBusiness.setApellido(socio.getApellido());
            socioBusiness.setDni(socio.getDni());
            socioBusiness.setFechaNacimiento(socio.getFechaNacimiento());
            socioBusiness.setTelefono(socio.getTelefono());
            socioBusiness.setMail(socio.getMail());
            socioBusiness.setDireccion(socio.getDireccion());
            socioBusiness.setPenalizado(socio.getPenalizado());
            socioBusiness.setMotivoPenalizado(socio.getMotivoPenalizado());

            // Agregamos el objeto convertido a la lista de SociosBusiness
            listaSocios.add(socioBusiness);
        }

        // Devolvemos la lista de SociosBusiness
        return listaSocios;
    }
}