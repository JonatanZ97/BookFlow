package ModelFunctions;

import ModelException.ModelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelObjets.Reserva;

public class ReservaDAOImpl implements ReservaDAO {

    ConexionDB objetoConexion = new ConexionDB();

    @Override
    public List<Reserva> obtenerReservas() {
        Connection conexion = null;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        List<Reserva> listaReservas = new ArrayList<>();

        try {
            // Establecer conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para obtener todas las reservas
            String consulta = "SELECT * FROM Reservas";
            declaracion = conexion.prepareStatement(consulta);

            // Ejecutar la consulta
            resultado = declaracion.executeQuery();

            // Recorrer los resultados y mapearlos a objetos Reserva
            while (resultado.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(resultado.getInt("idreserva"));
                reserva.setIdLibro(resultado.getInt("idlibro"));
                reserva.setIdSocio(resultado.getInt("idsocio"));
                reserva.setFechaReserva(resultado.getDate("fecha_reserva"));

                listaReservas.add(reserva);
            }

        } catch (Exception e) {
            System.out.println("Error al obtener las reservas: " + e.getMessage());
        } finally {
            // Cerrar recursos
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

        return listaReservas;
    }

    @Override
    public void agregarReserva(Reserva reserva) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para insertar una nueva reserva
            String consulta = "INSERT INTO Reservas (idlibro, idsocio, fecha_reserva) VALUES (?, ?, ?)";

            // Preparar la declaración SQL
            declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, reserva.getIdLibro());
            declaracion.setInt(2, reserva.getIdSocio());
            declaracion.setDate(3, new java.sql.Date(reserva.getFechaReserva().getTime()));

            // Ejecutar la consulta
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Reserva agregada exitosamente.");
            } else {
                System.out.println("No se pudo agregar la reserva.");
            }

        } catch (Exception e) {
            throw new ModelException("Error al agregar la reserva: " + e.getMessage());
        } finally {
            // Cerrar recursos
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
            String consulta = "TRUNCATE TABLE Reservas CASCADE";

            // Ejecuta la consulta
            declaracion = conexion.prepareStatement(consulta);
            declaracion.executeUpdate();

            System.out.println("Se vacio la lista exitosamente.");

        } catch (Exception e) {
            throw new ModelException("Error al vaciar la lista de reserva: " + e.getMessage());
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
