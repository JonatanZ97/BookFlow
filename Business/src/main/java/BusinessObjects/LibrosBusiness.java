
package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.LibroDAOImpl;
import java.util.ArrayList;
import modelObjets.Libro;


public class LibrosBusiness {
    private String titulo;
    private String autor;
    private String estadoDelLibro = "disponible";
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
    
    
    public static ArrayList<LibrosBusiness> getListaLibros() {
    
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
    
    
public boolean guardarLibro(String titulo, String autor, String genero, String editorial, String numIdentificacion, String estado) throws ModelException{
    Libro libro = new Libro();
    
    
    if(verificarNoVacia(autor)) return false;
    if(verificarNoVacia(genero)) return false;
    if(verificarNoVacia(titulo)) return false;
    if(verificarNoVacia(editorial)) return false;
    if(verificarNoVacia(numIdentificacion)) return false;
    
    if(!soloNumeros(numIdentificacion)) return false;
    
     int numIdentificacionInt = Integer.parseInt(numIdentificacion);
    
    
    libro.setAutor(autor);
    libro.setTitulo(titulo);
    libro.setGenero(genero);
    libro.setNumeroDeIdentificacion(numIdentificacionInt);
    libro.setEstadoDelLibro(estadoDelLibro);
    libro.setEditorial(editorial);
    
    
    LibroDAOImpl libroGuardar = new LibroDAOImpl();
    
    libroGuardar.guardarLibro(libro);
    
    
    
    return true;
}

//metodo que comprueba que las variables no esten vacias o sean null
public boolean verificarNoVacia(String cadena) {
    if (cadena != null && !cadena.trim().isEmpty()) {
        return true;
    } else {
        return false;
    }
}

//metodo que comprueba que sean numeros
public static boolean soloNumeros(String str) {
        // Verifica si el string no está vacío y si contiene solo números
        return str != null && str.matches("\\d+");
    }
    
}
