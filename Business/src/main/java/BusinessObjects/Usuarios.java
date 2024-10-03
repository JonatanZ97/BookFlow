
package BusinessObjects;

import java.util.ArrayList;
import java.util.List;



//autor jonatan zamora
public class Usuarios {
    
    private String nombre;
    private String contraseña;
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    // Método para obtener la lista de usuarios
    public static ArrayList<Usuarios> getListaUsuarios() {
        
        ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
        
        return listaUsuarios;
    }
    
    
    
}
