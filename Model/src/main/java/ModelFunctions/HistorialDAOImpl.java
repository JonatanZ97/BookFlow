package ModelFunctions;

import ModelException.ModelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelObjets.Historial;

public class HistorialDAOImpl implements HistorialDAO {

    ConexionDB objetoConexion = new ConexionDB();

    @Override
    public List<Historial> obtenerHistorial() {
        Connection conexion = null;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Historial> listaHistorial = new ArrayList<>();

        try {
            conexion = objetoConexion.establecerConexion();
            // Incluye la columna fechaReal en la consulta
            String consulta = "SELECT * FROM Historialprestamos";
            declaracion = conexion.prepareStatement(consulta);
            resultado = declaracion.executeQuery();

            while (resultado.next()) {
                Historial historial = new Historial();
                historial.setIdHistorial(resultado.getInt("idhistorial"));
                historial.setIdLibro(resultado.getInt("idlibro"));
                historial.setIdSocio(resultado.getInt("idsocio"));
                historial.setFechaPrestamo(resultado.getDate("fecha_prestamo"));
                historial.setFechaRetorno(resultado.getDate("fecha_retiro"));

                // Manejar fechaReal, que puede ser null
                Date fechaReal = resultado.getDate("fechareal");
                historial.setFechaReal(fechaReal != null ? fechaReal : null);

                listaHistorial.add(historial);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener el historial: " + e.getMessage());
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
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }

        return listaHistorial;
    }

    @Override
    public void agregarHistorial(Historial historial) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establece la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Prepara la consulta SQL para insertar un nuevo historial, incluyendo fechaReal
            String consulta = "INSERT INTO HistorialPrestamos (idlibro, idsocio, fecha_prestamo, fecha_retiro, fechareal) VALUES (?, ?, ?, ?, ?)";

            declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, historial.getIdLibro());
            declaracion.setInt(2, historial.getIdSocio());
            declaracion.setDate(3, new java.sql.Date(historial.getFechaPrestamo().getTime()));
            declaracion.setDate(4, new java.sql.Date(historial.getFechaRetorno().getTime()));
            // Manejar la fechaReal: Si es null, se inserta NULL en la base de datos
            if (historial.getFechaReal() != null) {
                declaracion.setDate(5, new java.sql.Date(historial.getFechaReal().getTime()));
            } else {
                declaracion.setNull(5, java.sql.Types.DATE);
            }

            // Ejecuta la consulta
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Historial agregado exitosamente.");
            } else {
                System.out.println("No se pudo agregar el historial.");
            }

        } catch (Exception e) {
            throw new ModelException("Error al agregar el historial: " + e.getMessage());
        } finally {
            // Cierra la conexión y el statement
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

    @Override
    public void eliminarHistorial(int idHistorial) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establece la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Prepara la consulta SQL para eliminar un historial por su ID
            String consulta = "DELETE FROM Historialprestamos WHERE idhistorial = ?";

            declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, idHistorial);

            // Ejecuta la consulta
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Historial eliminado exitosamente.");
            } else {
                System.out.println("No se encontro ningun historial con el ID especificado.");
            }

        } catch (Exception e) {
            throw new ModelException("Error al eliminar historial: " + e.getMessage());
        } finally {
            // Cierra la conexión y el statement
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

    @Override
    public void agregarRetorno(int idHistorial, Date fechaReal) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establece la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Prepara la consulta SQL para actualizar la fecha de retorno en un historial por su ID
            String consulta = "UPDATE Historialprestamos SET fechareal = ? WHERE idhistorial = ?";

            declaracion = conexion.prepareStatement(consulta);
            declaracion.setDate(1, new java.sql.Date(fechaReal.getTime()));
            declaracion.setInt(2, idHistorial);

            // Ejecuta la consulta
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Fecha de retorno agregada exitosamente.");
            } else {
                System.out.println("No se encontro ningún historial con el ID especificado.");
            }

        } catch (Exception e) {
            throw new ModelException("Error al agregar la fecha de retorno: " + e.getMessage());
        } finally {
            // Cierra la conexión y el statement
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
            String consulta = "TRUNCATE TABLE Historialprestamos CASCADE";

            // Ejecuta la consulta
            declaracion = conexion.prepareStatement(consulta);
            declaracion.executeUpdate();

            System.out.println("Exito al vaciar la lista.");

        } catch (Exception e) {
            throw new ModelException("Error al vaciar la lista del historial de prestamos: " + e.getMessage());
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
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
    }
}
