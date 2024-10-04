
package BusinessObjects;

import ModelFunctions.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import modelObjets.Usuario;



//autor jonatan zamora
public class UsuarioBusiness {
    
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
    public static ArrayList<UsuarioBusiness> getListaUsuarios() {
    
    // Creamos la lista que devolveremos
    ArrayList<UsuarioBusiness> listaUsuarios = new ArrayList<>();
    
    // Creamos una instancia de UsuarioDAOImpl para obtener los datos de usuarios
    UsuarioDAOImpl userModel = new UsuarioDAOImpl();
    
    // Obtenemos la lista de usuarios desde userModel
    ArrayList<Usuario> listaModel = userModel.obtenerUsuarios(); // Llenamos la listaModel con datos
    
    // Recorremos la lista de Usuario y convertimos cada uno en UsuarioBusiness
    for (Usuario usuario : listaModel) {
        // Aquí podrías hacer alguna conversión de Usuario a UsuarioBusiness
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        
        // Copiamos los datos de Usuario a UsuarioBusiness
        usuarioBusiness.setNombre(usuario.getNombre());
        usuarioBusiness.setContraseña(usuario.getContrasenia()); // Asegúrate de que el método se llame así
        usuarioBusiness.setNivel(usuario.getNivel());
        
        // Agregamos el objeto convertido a la lista de usuarios de negocio
        listaUsuarios.add(usuarioBusiness);
    }
    
    // Devolvemos la lista de UsuarioBusiness
    return listaUsuarios;
}

    
    
    
}
