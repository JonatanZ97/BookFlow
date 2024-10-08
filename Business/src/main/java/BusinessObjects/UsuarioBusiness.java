package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.UsuarioDAOImpl;
import java.util.ArrayList;
import java.util.List;
import modelObjets.Usuario;

//autor jonatan zamora
public class UsuarioBusiness {

    private int idUsuario;
    private String nombre;
    private String contraseña;
    private int nivel;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

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
            usuarioBusiness.setContraseña(usuario.getContrasenia());
            usuarioBusiness.setNivel(usuario.getNivel());
            usuarioBusiness.setIdUsuario(usuario.getIdUsuario());

            // Agregamos el objeto convertido a la lista de usuarios de negocio
            listaUsuarios.add(usuarioBusiness);
        }

        // Devolvemos la lista de UsuarioBusiness
        return listaUsuarios;
    }

    //metodo para cambiar contraseña
    public boolean cambiarContrasenia(int idUsu, String nuevaContrasenia) throws ModelException {

        UsuarioDAOImpl usuarios = new UsuarioDAOImpl();

        usuarios.cambiarContrasenia(nuevaContrasenia, idUsu);

        return true;
    }

    public void nuevoUsuario(String nombre, String contrasenia, int nivel) throws ModelException {

        Usuario user = new Usuario();

        user.setNivel(nivel);
        user.setNombre(nombre);
        user.setContrasenia(contrasenia);

        UsuarioDAOImpl usuarios = new UsuarioDAOImpl();

        usuarios.guardarUsuario(user);

    }

    public void eliminarUsuario(int idUser) throws ModelException {

        UsuarioDAOImpl usuarios = new UsuarioDAOImpl();
        usuarios.eliminarUsuario(idUser);

    }

    public List<String> convertToString() {

        // Creamos la lista de string para devolver
        List<String> listaString = new ArrayList<>();

        // Creamos una instancia de UsuarioDAOImpl para obtener los datos de los socios desde la DB 
        UsuarioDAOImpl usuarioModel = new UsuarioDAOImpl();

        // Obtenemos la lista de socios desde el DAO
        List<Usuario> listaModel = usuarioModel.obtenerUsuarios();

        // Verificamos si la lista de socios no es nula o vacía
        if (listaModel != null || !listaModel.isEmpty()) {
            // Recorremos la listaModel y transferimos los datos a la lista de String
            for (Usuario usuario : listaModel) {

                // Concatenar los valores en un String, manejando posibles valores nulos
                String descripcionSocio = String.format(
                        "Id usuario: %s, Nombre: %s,Nivel: %s",
                        usuario.getIdUsuario(),
                        usuario.getNombre() != null ? usuario.getNombre() : "N/A",
                        usuario.getNivel()
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
    
    public boolean modificarContraseñaOtro(int idUsuario, String nuevaContraseña){
        
        
        
        
        return true;
    }
}
