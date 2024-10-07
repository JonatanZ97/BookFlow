package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.SocioDAOImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelObjets.Socio;

public class SociosBusiness {

    int idsocio;
    String nombre;
    String apellido;
    long dni;
    Date fechaNacimiento;
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
            socioBusiness.setIdsocio(socio.getId());
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
        socio.setFechaNacimiento(fechaNac);
        socio.setTelefono(telefono);
        socio.setMail(mail);
        socio.setDireccion(direccion);

        SocioDAOImpl guardar = new SocioDAOImpl();

        if (guardar.verificarSocio(socio.getDni())) {
            return false;
        } else {
            guardar.guardarSocio(socio);
            return true;
        }

    }

    public boolean verificarNoVacia(String cadena) {
        if (cadena != null && !cadena.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean soloLetras(String cadena) {
        // Verifica si la cadena no es nula y no está vacía
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }

        // Recorre cada carácter de la cadena
        for (char c : cadena.toCharArray()) {
            // Si el carácter no es una letra y no es un espacio, retorna false
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        // Si todos los caracteres son letras o espacios, retorna true
        return true;
    }

    public List<String> convertToString() {

        // Creamos la lista de string para devolver
        List<String> listaString = new ArrayList<>();

        // Creamos una instancia de SocioDAOImpl para obtener los datos de los socios desde la DB 
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de socios desde el DAO
        List<Socio> listaModel = socioModel.obtenerSocios();

        // Verificamos si la lista de socios no es nula o vacía
        if (listaModel != null && !listaModel.isEmpty()) {
            // Recorremos la listaModel y transferimos los datos a la lista de String
            for (Socio socio : listaModel) {

                // Concatenar los valores en un String, manejando posibles valores nulos
                String descripcionSocio = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Dni: %s, Fecha de nacimiento: %s, telefono: %s, Mail: %s, Direccion: %s, Penalizado: %s, Motivo de penalizacion: %s",
                        socio.getId(),
                        socio.getNombre() != null ? socio.getNombre() : "N/A",
                        socio.getApellido() != null ? socio.getApellido() : "N/A",
                        socio.getDni(),
                        socio.getFechaNacimiento() != null ? socio.getFechaNacimiento() : "N/A",
                        socio.getTelefono(),
                        socio.getMail() != null ? socio.getMail() : "N/A",
                        socio.getDireccion() != null ? socio.getDireccion() : "N/A",
                        socio.getPenalizado(),
                        socio.getMotivoPenalizado() != null ? socio.getMotivoPenalizado() : "N/A"
                );

                // Añadir el String a la lista
                listaString.add(descripcionSocio);
            }
        } else {
            // Si la lista está vacía o nula, puedes manejarlo según lo requiera la lógica
            listaString.add("No se encontraron socios.");
        }

        // Retornar la lista de descripciones
        return listaString;
    }

    public boolean cambiarDatosSocios(int id, String nombre, String apellido, long dni, Date fechaNacimiento, long telefono, String mail, String direccion, boolean penalizado, String motivoPenalizado, long dniOriginal) throws ModelException {
        if (dni < 1 || telefono < 10000000 || id < 1) {
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

        socio.setId(id);
        socio.setNombre(nombre);
        socio.setApellido(apellido);
        socio.setDni(dni);
        socio.setFechaNacimiento(fechaNacimiento);
        socio.setTelefono(telefono);
        socio.setMail(mail);
        socio.setDireccion(direccion);
        socio.setPenalizado(penalizado);
        socio.setMotivoPenalizado(motivoPenalizado);

        SocioDAOImpl socioModel = new SocioDAOImpl();

        if (socioModel.verificarSocio(socio.getDni())) {//compruebo que no exista un socio con ese dni en la base de datos
            if (socio.getDni() != dniOriginal) {
                return false;
            }
        }
        socioModel.cambiarDatosSocio(socio);
        return true;
    }

    public boolean eliminarSocioID(int ID) throws ModelException {

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getId() == ID) {
                socioModel.eliminarSocioID(ID);
                return true;//retornamos true si se encontro el dato a eliminar
            }

        }

        return false;//retornamos false si no se encontro el id del socio a eliminar
    }

    public boolean eliminarSocioDNI(long DNI) throws ModelException {

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getDni() == DNI) {
                socioModel.eliminarSocioDNI(DNI);
                return true;//retornamos true si se encontro el dato a eliminar
            }

        }

        return false;//retornamos false si no se encontro el id del socio a eliminar
    }

    public ArrayList<String> buscarPorNombre(String nombre) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getNombre().equalsIgnoreCase(nombre)) {

                // Concatenar los valores en un String, manejando posibles valores nulos
                String descripcionSocio = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Dni: %s, Fecha de nacimiento: %s, telefono: %s, Mail: %s, Direccion: %s, Penalizado: %s, Motivo de penalizacion: %s",
                        socio.getId(),
                        socio.getNombre() != null ? socio.getNombre() : "N/A",
                        socio.getApellido() != null ? socio.getApellido() : "N/A",
                        socio.getDni(),
                        socio.getFechaNacimiento() != null ? socio.getFechaNacimiento() : "N/A",
                        socio.getTelefono(),
                        socio.getMail() != null ? socio.getMail() : "N/A",
                        socio.getDireccion() != null ? socio.getDireccion() : "N/A",
                        socio.getPenalizado(),
                        socio.getMotivoPenalizado() != null ? socio.getMotivoPenalizado() : "N/A"
                );

                listaString.add(descripcionSocio);

            }

        }

        return listaString;

    }

    public ArrayList<String> buscarPorApellido(String apellido) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getApellido().equalsIgnoreCase(apellido)) {

                // Concatenar los valores en un String, manejando posibles valores nulos
                String descripcionSocio = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Dni: %s, Fecha de nacimiento: %s, telefono: %s, Mail: %s, Direccion: %s, Penalizado: %s, Motivo de penalizacion: %s",
                        socio.getId(),
                        socio.getNombre() != null ? socio.getNombre() : "N/A",
                        socio.getApellido() != null ? socio.getApellido() : "N/A",
                        socio.getDni(),
                        socio.getFechaNacimiento() != null ? socio.getFechaNacimiento() : "N/A",
                        socio.getTelefono(),
                        socio.getMail() != null ? socio.getMail() : "N/A",
                        socio.getDireccion() != null ? socio.getDireccion() : "N/A",
                        socio.getPenalizado(),
                        socio.getMotivoPenalizado() != null ? socio.getMotivoPenalizado() : "N/A"
                );

                listaString.add(descripcionSocio);

            }

        }

        return listaString;

    }

    public boolean existeSocioDNI(long dni) {

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getDni() == dni) {
                return true;
            }

        }

        return false;
    }

    public boolean existeSocioID(int id) {

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {

            if (socio.getId() == id) {
                return true;
            }

        }

        return false;
    }

    public int buscarID(long dni) {

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {
            if (socio.getDni() == dni) {
                return socio.getId();
            }
        }

        return 0;
    }

    public SociosBusiness traerDatos(int id) {
        // Obtener la lista de usuarios (SociosBusiness)
        ArrayList<SociosBusiness> lista = getListaUsuarios();

        // Recorrer la lista para buscar el usuario que coincida con el id
        for (SociosBusiness socio : lista) {
            if (socio.getIdsocio() == id) {  // Comparamos el id del socio con el id proporcionado
                return socio;  // Si coinciden, devolvemos el socio
            }
        }

        // Si no se encuentra un socio con ese id, devolvemos null o podemos lanzar una excepción
        return null;
    }

    public String obtenerNombre(int idSocio) {
        String respuesta = " ";

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {
            if (socio.getId() == idSocio) {

                respuesta = socio.getNombre();
            }
        }

        return respuesta;
    }

    public String obtenerApellido(int idSocio) {
        String respuesta = " ";

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        SocioDAOImpl socioModel = new SocioDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Socio> listaModel = socioModel.obtenerSocios(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Socio socio : listaModel) {
            if (socio.getId() == idSocio) {

                respuesta = socio.getApellido();
            }
        }

        return respuesta;
    }

    public void vaciarLista() throws ModelException {
        SocioDAOImpl socios = new SocioDAOImpl();

        socios.vaciarLista();
    }
}
