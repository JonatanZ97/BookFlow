package ModelFunctions;

import modelObjets.Usuario;
import ModelException.ModelException;
import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> obtenerUsuarios();

    public void guardarUsuario(Usuario usuario) throws ModelException;

    public void eliminarUsuario(int idUsuario) throws ModelException;
    
    public void cambiarContrasenia(String contrasenia, int idUsuario) throws ModelException;
}
