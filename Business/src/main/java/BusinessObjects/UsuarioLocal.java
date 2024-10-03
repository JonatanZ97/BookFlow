
package BusinessObjects;

//autor jonatan zamora
public class UsuarioLocal {

    //atributos
    private static UsuarioLocal instancia; // Única instancia de la clase
    private String usuario;
    private String contraseña;
    private int nivel;

    // Constructor privado para evitar instanciación externa
    private UsuarioLocal() {}

    // Método para obtener la única instancia de la clase (patrón Singleton)
    public static UsuarioLocal getInstancia() {
        if (instancia == null) {
            instancia = new UsuarioLocal();
        }
        return instancia;
    }

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
}

