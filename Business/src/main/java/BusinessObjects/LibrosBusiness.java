package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.LibroDAOImpl;
import java.util.ArrayList;
import modelObjets.Libro;
import modelObjets.LibroCorto;

public class LibrosBusiness {

    private String titulo;
    private String autor;
    private String estadoDelLibro;
    private String genero;
    private String editorial;
    private long numeroDeIdentificacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstadoDelLibro() {
        return estadoDelLibro;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public long getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstadoDelLibro(String estadoDelLibro) {
        this.estadoDelLibro = estadoDelLibro;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroDeIdentificacion(long numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public ArrayList<LibrosBusiness> getListaLibros() {

        // Creamos la lista que devolveremos
        ArrayList<LibrosBusiness> listaLibros = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de LibrosBusiness
        for (Libro libro : listaModel) {
            // Creamos una nueva instancia de LibrosBusiness
            LibrosBusiness libroBusiness = new LibrosBusiness();

            // Transferimos los atributos de 'libro' a 'libroBusiness'
            libroBusiness.setTitulo(libro.getTitulo());
            libroBusiness.setAutor(libro.getAutor());
            libroBusiness.setGenero(libro.getGenero());
            libroBusiness.setEditorial(libro.getEditorial());
            libroBusiness.setNumeroDeIdentificacion(libro.getNumeroDeIdentificacion());
            libroBusiness.setEstadoDelLibro(libro.getEstadoDelLibro());

            // Agregamos el libroBusiness a la lista de LibrosBusiness
            listaLibros.add(libroBusiness);
        }

        // Devolvemos la lista de LibrosBusiness
        return listaLibros;
    }

    public boolean guardarLibro(String titulo, String autor, String genero, String editorial, String numIdentificacion, String estado) throws ModelException {
        Libro libro = new Libro();

        if (verificarNoVacia(autor)) {
            return false;
        }
        if (verificarNoVacia(genero)) {
            return false;
        }
        if (verificarNoVacia(titulo)) {
            return false;
        }
        if (verificarNoVacia(editorial)) {
            return false;
        }
        if (verificarNoVacia(numIdentificacion)) {
            return false;
        }

        if (!soloNumeros(numIdentificacion)) {
            return false;
        }

        long numIdentificacionInt = Long.parseLong(numIdentificacion);

        estado = estado.toLowerCase();
        
        libro.setAutor(autor);
        libro.setTitulo(titulo);
        libro.setGenero(genero);
        libro.setNumeroDeIdentificacion(numIdentificacionInt);
        libro.setEstadoDelLibro(estado);
        libro.setEditorial(editorial);

        LibroDAOImpl libroGuardar = new LibroDAOImpl();

        libroGuardar.guardarLibro(libro);

        return true;
    }

//metodo que comprueba que las variables no esten vacias o sean null
    public boolean verificarNoVacia(String cadena) {
        if (cadena != null && !cadena.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

//metodo que comprueba que sean numeros
    public static boolean soloNumeros(String str) {
        // Verifica si el string no está vacío y si contiene solo números
        return str != null && str.matches("\\d+");
    }

//metodo para enviar la lista como string
    public ArrayList<String> convertToString() {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {

            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Titulo: %s, Autor: %s, Estado: %s, Genero: %s, Editorial: %s, ID: %d",
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getEstadoDelLibro(),
                    libro.getGenero(),
                    libro.getEditorial(),
                    libro.getNumeroDeIdentificacion()
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);
        }

        // Retornar la lista de descripciones
        return listaString;
    }

    //metodo para enviar la lista como string filtrando por autor
    public ArrayList<String> buscarPorAutor( String autor) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {

            if(libro.getAutor().equalsIgnoreCase(autor)){
            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Titulo: %s, Autor: %s, Estado: %s, Genero: %s, Editorial: %s, ID: %d",
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getEstadoDelLibro(),
                    libro.getGenero(),
                    libro.getEditorial(),
                    libro.getNumeroDeIdentificacion()
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);
            
            }
        }

        // Retornar la lista de descripciones
        return listaString;
    }
    
    //metodo para enviar la lista como string filtrando por autor
    public ArrayList<String> buscarPorTitulo( String titulo) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {

            if(libro.getTitulo().equalsIgnoreCase(titulo)){
            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Titulo: %s, Autor: %s, Estado: %s, Genero: %s, Editorial: %s, ID: %d",
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getEstadoDelLibro(),
                    libro.getGenero(),
                    libro.getEditorial(),
                    libro.getNumeroDeIdentificacion()
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);
            
            }
        }

        // Retornar la lista de descripciones
        return listaString;
    }
    
    //metodo para enviar la lista como string filtrando por autor
    public ArrayList<String> buscarPorEditorial( String editorial) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {

            if(libro.getEditorial().equalsIgnoreCase(editorial)){
            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Titulo: %s, Autor: %s, Estado: %s, Genero: %s, Editorial: %s, ID: %d",
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getEstadoDelLibro(),
                    libro.getGenero(),
                    libro.getEditorial(),
                    libro.getNumeroDeIdentificacion()
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);
            
            }
        }

        // Retornar la lista de descripciones
        return listaString;
    }
    
    //metodo para enviar la lista como string filtrando por autor
    public ArrayList<String> buscarPorCDU( String CDU) {

        // Creamos la lista de string para devolver
        ArrayList<String> listaString = new ArrayList<>();

        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {

            if(libro.getGenero().equalsIgnoreCase(CDU)){
            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Titulo: %s, Autor: %s, Estado: %s, Genero: %s, Editorial: %s, ID: %d",
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getEstadoDelLibro(),
                    libro.getGenero(),
                    libro.getEditorial(),
                    libro.getNumeroDeIdentificacion()
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);
            
            }
        }

        // Retornar la lista de descripciones
        return listaString;
    }
    
    //metodo para eliminar un libro
    public boolean eliminarLibro(Long numIdentificacion) throws ModelException{
        
        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos
        
        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {
            
            if(libro.getNumeroDeIdentificacion() == numIdentificacion){
                libroModel.eliminarLibro(numIdentificacion);
                return true;//devolvemos true para informar que se hizo de manera correcta
            }
            
        }
        
        
        return false;//informamos que el libro no fue enconterado
    }
    
    public boolean modificarLibro(long numOriginal, String titulo, String autor, String estado, String CDU, String editorial, String numIdentificacion) throws ModelException{
        
        Libro libro = new Libro();

        if (verificarNoVacia(autor)) {
            return false;
        }
        if (verificarNoVacia(genero)) {
            return false;
        }
        if (verificarNoVacia(titulo)) {
            return false;
        }
        if (verificarNoVacia(editorial)) {
            return false;
        }
        if (verificarNoVacia(numIdentificacion)) {
            return false;
        }

        if (!soloNumeros(numIdentificacion)) {
            return false;
        }

        int numIdentificacionInt = Integer.parseInt(numIdentificacion);
        
        libro.setAutor(autor);
        libro.setTitulo(titulo);
        libro.setGenero(genero);
        libro.setNumeroDeIdentificacion(numIdentificacionInt);
        libro.setEstadoDelLibro(estadoDelLibro);
        libro.setEditorial(editorial);

        LibroDAOImpl libroMod = new LibroDAOImpl();
        
        libroMod.cambiarDatosLibro(libro, numOriginal);
        
        return true;
    }

    public boolean existeLibro(long numI){
        
        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {
            
            if(libro.getNumeroDeIdentificacion() == numI){
                return true;
            }

        }
        
        return false;
    }
    
    public int obtenerID(long numID){
        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<LibroCorto> listaLC = libroModel.obtenerLibrosCortos();
        
        for(LibroCorto libro : listaLC){
            
            if(libro.getNumeroIdentificacion() == numID) return libro.getId();
        }

        return 0;

        }
    
    public LibrosBusiness obtenerDatos(long numIdentificacion){
        
        
        LibrosBusiness libroRetorno = new LibrosBusiness();
        
        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {
            if(libro.getNumeroDeIdentificacion() == numIdentificacion){
                
                libroRetorno.setAutor(libro.getAutor());
                libroRetorno.setEditorial(libro.getEditorial());
                libroRetorno.setEstadoDelLibro(libro.getEstadoDelLibro());
                libroRetorno.setGenero(libro.getGenero());
                libroRetorno.setNumeroDeIdentificacion(libro.getNumeroDeIdentificacion());
                libroRetorno.setTitulo(libro.getTitulo());
                
                
            }
        }
        
        return libroRetorno;
    }
    
    public boolean cambiarEstado(long numID, String nuevoEstado) throws ModelException{
        
        LibroDAOImpl libroM = new LibroDAOImpl();
        
        libroM.cambiarEstadoLibro(numID, nuevoEstado);
        
        return true;
    }
    
    public boolean cambiarAprestado(long numID) throws ModelException{
        
        LibroDAOImpl libroM = new LibroDAOImpl();
        
        String nuevoEstado = "prestado";
        
        libroM.cambiarEstadoLibro(numID, nuevoEstado);
        
        return true;
    }
    
        public boolean cambiarAdisponible(long numID) throws ModelException{
        
        LibroDAOImpl libroM = new LibroDAOImpl();
        
        String nuevoEstado = "disponible";
        
        libroM.cambiarEstadoLibro(numID, nuevoEstado);
        
        return true;
    }
        
        
        public String buscarEstado(long numID){
        
            String estado = "";
            
        // Creamos una instancia de LibroDAOImpl para obtener los datos de libros desde la DB
        LibroDAOImpl libroModel = new LibroDAOImpl();

        // Obtenemos la lista de libros desde el DAO
        ArrayList<Libro> listaModel = libroModel.obtenerLibros(); // Llenamos la listaModel con datos

        // Recorremos la listaModel y transferimos los datos a la lista de String
        for (Libro libro : listaModel) {
            
            if(libro.getNumeroDeIdentificacion() == numID){
                estado = libro.getEstadoDelLibro();
            }

        }
           
        return estado;
        
        }
}
