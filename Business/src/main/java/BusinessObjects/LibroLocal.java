
package BusinessObjects;


public class LibroLocal {
    private static LibroLocal instance;
    private long numIdentificacion;

    // Constructor privado para evitar que se pueda instanciar desde fuera de la clase.
    private LibroLocal() { }

    // Método estático para obtener la única instancia de la clase.
    public static synchronized LibroLocal getInstance() {
        if (instance == null) {
            instance = new LibroLocal();
        }
        return instance;
    }

    public long getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(long numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
}

