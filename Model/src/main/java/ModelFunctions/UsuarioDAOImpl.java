package ModelFunctions;

import ModelException.ModelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelObjets.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

    ConexionDB objetoConexion = new ConexionDB();

    @Override
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement preparacion = null;
        ResultSet resultado = null;

        try {
            // Establecer conexión con la base de datos
            conexion = objetoConexion.establecerConexion();
            // Consulta para obtener todos los usuarios de la tabla Usuarios
            String consulta = "SELECT idusuario, nombre, contrasenia, nivel FROM Usuarios";
            preparacion = conexion.prepareStatement(consulta);
            resultado = preparacion.executeQuery();

            // Iterar sobre los resultados y agregar cada usuario a la lista
            while (resultado.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultado.getInt("idusuario"));
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setContrasenia(resultado.getString("contrasenia"));
                usuario.setNivel(resultado.getInt("nivel"));

                listaUsuarios.add(usuario);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los usuarios: " + e.getMessage());
        } finally {
            try {
                // Cerrar recursos
                if (resultado != null) {
                    resultado.close();
                }
                if (preparacion != null) {
                    preparacion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }

        return listaUsuarios;
    }

    @Override
    public void guardarUsuario(Usuario usuario) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para insertar un nuevo usuario en la tabla Usuarios
            String consulta = "INSERT INTO Usuarios (nombre, contrasenia, nivel) VALUES (?, ?, ?)";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar los valores de los atributos del objeto Usuario a la consulta
            declaracion.setString(1, usuario.getNombre());
            declaracion.setString(2, usuario.getContrasenia());
            declaracion.setInt(3, usuario.getNivel());

            // Ejecutar la consulta de inserción
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario guardado correctamente.");
            } else {
                System.out.println("No se pudo guardar el usuario.");
            }

        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            throw new ModelException("Error al guardar el usuario: " + e.getMessage());
        } finally {
            try {
                // Cerrar los recursos
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }

    @Override
    public void eliminarUsuario(int idUsuario) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para eliminar un usuario por su ID
            String consulta = "DELETE FROM Usuarios WHERE idusuario = ?";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar el valor del idUsuario al parámetro de la consulta
            declaracion.setInt(1, idUsuario);

            // Ejecutar la consulta de eliminación
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("No se encontro ningun usuario con el ID especificado.");
            }

        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            throw new ModelException("Error al eliminar el usuario: " + e.getMessage());
        } finally {
            try {
                // Cerrar los recursos
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }

    @Override
    public void cambiarContrasenia(String contrasenia, int idUsuario) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para actualizar la contraseña de un usuario
            String consulta = "UPDATE Usuarios SET contrasenia = ? WHERE idusuario = ?";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar los valores a los parámetros de la consulta
            declaracion.setString(1, contrasenia);
            declaracion.setInt(2, idUsuario);

            // Ejecutar la consulta de actualización
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Contrasenia actualizada correctamente.");
            } else {
                System.out.println("No se encontro ningun usuario con el ID especificado.");
            }

        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            throw new ModelException("Error al cambiar la contrasenia: " + e.getMessage());
        } finally {
            try {
                // Cerrar los recursos
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }
}
