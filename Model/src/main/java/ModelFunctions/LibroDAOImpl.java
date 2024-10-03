package ModelFunctions;

import ModelException.ModelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelObjets.Libro;

public class LibroDAOImpl implements LibroDAO {

    ConexionDB objetoConexion = new ConexionDB();

    @Override
    public List<Libro> obtenerLibros() {
        List<Libro> listaLibros = new ArrayList<>();
        Connection conexion = null;
        Statement declaracion = null;
        ResultSet resultado = null;

        try {
            conexion = objetoConexion.establecerConexion();
            declaracion = conexion.createStatement();
            String consulta = "SELECT * FROM Libros";
            resultado = declaracion.executeQuery(consulta);

            while (resultado.next()) {
                Libro libro = new Libro();
                libro.setTitulo(resultado.getString("titulo"));
                libro.setAutor(resultado.getString("autor"));
                libro.setEstadoDelLibro(resultado.getString("estado_libro"));
                libro.setGenero(resultado.getString("genero"));
                libro.setEditorial(resultado.getString("editorial"));
                libro.setNumeroDeIdentificacion(resultado.getLong("numero_identificacion"));

                listaLibros.add(libro);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los libros: " + e.toString());
        } finally {
            try {
                if (resultado != null) {
                    resultado.close();
                }
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexion: " + e.toString());
            }
        }
        return listaLibros;
    }

    @Override
    public boolean guardarLibro(Libro libro) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            conexion = objetoConexion.establecerConexion();
            String consulta = "INSERT INTO Libros (titulo, autor, estado_libro, genero, editorial, numero_identificacion) VALUES (?, ?, ?, ?, ?, ?)";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar los valores del objeto libro a la sentencia SQL
            declaracion.setString(1, libro.getTitulo());
            declaracion.setString(2, libro.getAutor());
            declaracion.setString(3, libro.getEstadoDelLibro());
            declaracion.setString(4, libro.getGenero());
            declaracion.setString(5, libro.getEditorial());
            declaracion.setLong(6, libro.getNumeroDeIdentificacion());

            // Ejecutar la sentencia SQL
            int resultado = declaracion.executeUpdate();

            // Verificar si se insertó correctamente
            if (resultado > 0) {
                System.out.println("El libro se guardo correctamente.");
                return true;
            } else {
                System.out.println("No se pudo guardar el libro.");
                return false;
            }

        } catch (Exception e) {
            throw new ModelException("Error al guardar el libro: " + e.getMessage());
        } finally {
            try {
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    @Override
    public void eliminarLibro(int idLibro) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;
        try {
            conexion = objetoConexion.establecerConexion();
            String consuta = "DELETE FROM Libros WHERE idlibro = ?";
            declaracion = conexion.prepareStatement(consuta);
            declaracion.setInt(1, idLibro);

            int rowsAffected = declaracion.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Libro eliminado exitosamente.");
            } else {
                System.out.println("No se encontro ningun libro con el ID especificado.");
            }
        } catch (Exception e) {
            throw new ModelException("Error al eliminar el libro: " + e.getMessage());
        } finally {
            try {
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    @Override
    public void cambiarEstadoLibro(int idLibro, String nuevoEstado) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            conexion = objetoConexion.establecerConexion();
            String consulta = "UPDATE Libros SET estado_libro = ? WHERE idlibro = ?";
            declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, nuevoEstado);
            declaracion.setInt(2, idLibro);

            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Estado del libro actualizado exitosamente a: " + nuevoEstado);
            } else {
                System.out.println("No se encontro ningun libro con el ID especificado.");
            }
        } catch (Exception e) {
            throw new ModelException("Error al actualizar el estado del libro: " + e.getMessage());
        } finally {
            try {
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

    public void vaciarLista() throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establece la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Prepara la consulta SQL para truncar la tabla Reservas
            String consulta = "TRUNCATE TABLE Libros, Reservas, Historialprestamos CASCADE";

            // Ejecuta la consulta
            declaracion = conexion.prepareStatement(consulta);
            declaracion.executeUpdate();

            System.out.println("Exito al vaciar la lista.");

        } catch (Exception e) {
            throw new ModelException("Error al vaciar la lista de libros: " + e.getMessage());
        } finally {
            // Cierra la conexión y el PreparedStatement
            try {
                if (declaracion != null) {
                    declaracion.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public void cambiarDatosLibro(Libro libro, Long numIdentificacion) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            conexion = objetoConexion.establecerConexion();
            String consulta = "UPDATE Libros SET titulo = ?, autor = ?, estado_libro = ?, editorial = ?,numero_identificacion = ?, genero = ?  WHERE numero_identificacion = ?";
            declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, libro.getTitulo());
            declaracion.setString(2, libro.getAutor());
            declaracion.setString(3, libro.getEstadoDelLibro());
            declaracion.setString(4, libro.getEditorial());
            declaracion.setLong(5,libro.getNumeroDeIdentificacion());
            declaracion.setString(6,libro.getGenero());
            declaracion.setLong(7, numIdentificacion);

            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Se actualizaron los datos del libro exitosamente");
            } else {
                System.out.println("No se encontro ningun libro con el numero de identificacion especificado.");
            }
        } catch (Exception e) {
            throw new ModelException("Error al actualizar los datos del libro: " + e.getMessage());
        } finally {
            try {
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
