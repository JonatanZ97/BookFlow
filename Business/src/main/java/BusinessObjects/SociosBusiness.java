package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.SocioDAOImpl;
import java.util.ArrayList;
import java.util.Date;
import modelObjets.Socio;

public class SociosBusiness {

    int idsocio;
    String nombre;
    String apellido;
    long dni;
    Date fechaNacimiento = new Date();
    long telefono;
    String mail;
    String direccion;
    boolean penalizado = false;
    String motivoPenalizado;

    public int getIdsocio() {
        return idsocio;
    }

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

    public void setIdsocio(int idsocio) {
        this.idsocio = idsocio;
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
    public ArrayList<SociosBusiness> getListaUsuarios() {

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

    public boolean guardarSocio(String nombre, String apellido, long dni, Date fechaNac, long telefono, String mail, String direccion) throws ModelException {

        if (dni < 1 || telefono < 10000000) {
            return false;
        }

        if (verificarNoVacia(nombre)) {
            return false;
        }

        if (verificarNoVacia(apellido)) {
            return false;
        }

        if (verificarNoVacia(mail)) {
            return false;
        }

        if (verificarNoVacia(direccion)) {
            return false;
        }

        if (!soloLetras(nombre)) {
            return false;
        }

        if (!soloLetras(apellido)) {
            return false;
        }

        Socio socio = new Socio();

        socio.setNombre(nombre);
        socio.setApellido(apellido);
        socio.setDni(dni);
        socio.setFechaNacimiento(fechaNacimiento);
        socio.setTelefono(telefono);
        socio.setMail(mail);
        socio.setDireccion(direccion);

        SocioDAOImpl guardar = new SocioDAOImpl();
        guardar.guardarSocio(socio);

        return true;
    }

    public boolean verificarNoVacia(String cadena) {
        if (cadena != null && !cadena.trim().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean soloLetras(String cadena) {
        // Verifica si la cadena no es nula y no está vacía
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        // Recorre cada carácter de la cadena
        for (char c : cadena.toCharArray()) {
            // Si el carácter no es una letra, retorna false
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        // Si todos los caracteres son letras, retorna true
        return true;
    }

    public ArrayList<String> convertToString() {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            // Concatenar los valores en un String
            String descripcionSocio = String.format(
                    "Id socio: %s, Nombre: %s, Apellido: %s, Dni: %s, Fecha de nacimiento: %s, telefono: %s, Mail: %s, Direccion: %s, Penalizado: %s, Motivo de penalizacion: %s",
                    socio.getId(),
                    socio.getNombre(),
                    socio.getApellido(),
                    socio.getDni(),
                    socio.getFechaNacimiento(),
                    socio.getTelefono(),
                    socio.getMail(),
                    socio.getDireccion(),
                    socio.getPenalizado(),
                    socio.getMotivoPenalizado()
            );

            // Añadir el String a la lista
            listaString.add(descripcionSocio);
        }

        // Retornar la lista de descripciones
        return listaString;
    }

}
