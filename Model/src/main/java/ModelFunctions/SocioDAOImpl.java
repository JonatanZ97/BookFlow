package ModelFunctions;

import ModelException.ModelException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelObjets.Socio;

public class SocioDAOImpl implements SocioDAO {

    ConexionDB objetoConexion = new ConexionDB();

    @Override
    public ArrayList<Socio> obtenerSocios() {
        ArrayList<Socio> listaSocios = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement preparacion = null;
        ResultSet resultado = null;

        try {
            // Establece la conexión
            conexion = objetoConexion.establecerConexion();

            // Consulta actualizada para incluir penalizado y motivoPenalizado
            String consulta = "SELECT nombre, apellido, dni, fecha_nac, telefono, mail, direccion, penalizado, motivo_penalizado FROM Personas";
            preparacion = conexion.prepareStatement(consulta);
            resultado = preparacion.executeQuery();

            while (resultado.next()) {
                Socio socio = new Socio();

                // Llenar el objeto Socio con los datos obtenidos
                socio.setNombre(resultado.getString("nombre"));
                socio.setApellido(resultado.getString("apellido"));
                socio.setDni(resultado.getLong("dni"));
                socio.setFechaNacimiento(resultado.getDate("fecha_nac"));
                socio.setTelefono(resultado.getLong("telefono"));
                socio.setMail(resultado.getString("mail"));
                socio.setDireccion(resultado.getString("direccion"));
                socio.setPenalizado(resultado.getBoolean("penalizado"));
                socio.setMotivoPenalizado(resultado.getString("motivo_penalizado"));

                listaSocios.add(socio); // Agregar el usuario a la lista
            }

        } catch (Exception e) {
            System.out.println("Error al obtener los socios: " + e.toString());
        } finally {
            try {
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
                System.out.println("Error al cerrar la conexion: " + e.toString());
            }
        }

        return listaSocios; // Retornar la lista de usuarios
    }

    @Override
    public void guardarSocio(Socio socio) throws ModelException {

        // Consulta SQL actualizada con las columnas penalizado y motivoPenalizado
        Connection conexion = null;
        PreparedStatement ejecucion = null;
        String consulta = "INSERT INTO Personas (nombre, apellido, dni, fecha_nac, telefono, mail, direccion, penalizado, motivo_penalizado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conexion = objetoConexion.establecerConexion();
            ejecucion = conexion.prepareStatement(consulta);
            // Configurar los valores del PreparedStatement
            ejecucion.setString(1, socio.getNombre());
            ejecucion.setString(2, socio.getApellido());
            ejecucion.setLong(3, socio.getDni());
            ejecucion.setDate(4, new java.sql.Date(socio.getFechaNacimiento().getTime()));
            ejecucion.setLong(5, socio.getTelefono());
            ejecucion.setString(6, socio.getMail());
            ejecucion.setString(7, socio.getDireccion());
            ejecucion.setBoolean(8, socio.getPenalizado());
            ejecucion.setString(9, socio.getMotivoPenalizado());

            // Ejecutar la inserción
            int filasAfectadas = ejecucion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Socio guardado correctamente.");
            }

        } catch (Exception e) {
            throw new ModelException("Error al guardar el socio: " + e.getMessage());
        } finally {
            try {
                if (ejecucion != null) {
                    ejecucion.close();
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
    public void eliminarSocioID(int idSocio) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            conexion = objetoConexion.establecerConexion();
            String consulta = "DELETE FROM Socios WHERE idsocio = ?";
            declaracion = conexion.prepareStatement(consulta);
            declaracion.setInt(1, idSocio);

            int filasAfectadas = declaracion.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Socio con ID " + idSocio + " fue eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un socio con ID " + idSocio + ".");
            }

        } catch (Exception e) {
            throw new ModelException("Error al eliminar el socio: " + e.getMessage());
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

    public void eliminarSocioDNI(long DNI) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            conexion = objetoConexion.establecerConexion();
            String consulta = "DELETE FROM Socios WHERE dni = ?";
            declaracion = conexion.prepareStatement(consulta);
            declaracion.setLong(1, DNI);

            int filasAfectadas = declaracion.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Socio con DNI " + DNI + " fue eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un socio con DNI " + DNI + ".");
            }

        } catch (Exception e) {
            throw new ModelException("Error al eliminar el socio: " + e.getMessage());
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

    public boolean verificarSocio(long dni) {
        boolean dniRepetido = false; // Valor por defecto: no está repetido
        Connection conexion = null;
        PreparedStatement preparacion = null;
        ResultSet resultado = null;

        try {
            conexion = objetoConexion.establecerConexion();
            // Consulta SQL para verificar si el DNI ya existe
            String consulta = "SELECT dni FROM Socios WHERE dni = ?";
            preparacion = conexion.prepareStatement(consulta);
            preparacion.setLong(1, dni); // Asignar el DNI al PreparedStatement
            resultado = preparacion.executeQuery();

            // Si hay un resultado, significa que el DNI ya existe
            if (resultado.next()) {
                dniRepetido = true;
            }

        } catch (Exception e) {
            System.out.println("Error al verificar el DNI: " + e.toString());
        } finally {
            try {
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
                System.out.println("Error al cerrar la conexion: " + e.toString());
            }
        }

        return dniRepetido; // Devolver el valor booleano
    }

    public void vaciarLista() throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establece la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Prepara la consulta SQL para truncar la tabla Reservas
            String consulta = "TRUNCATE TABLE Socios, Reservas, Historialprestamos CASCADE";

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

    public void cambiarDatosSocio(Socio socio, int idSocio) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para actualizar la contraseña de un usuario
            String consulta = "UPDATE Personas SET nombre = ?, apellido = ?, dni = ?, fecha_nac = ?, telefono = ?, mail = ?, direccion = ?, penalizado = ?, motivo_penalizado = ? WHERE idpersona = ?";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar los valores a los parámetros de la consulta
            declaracion.setString(1, socio.getNombre());
            declaracion.setString(2, socio.getNombre());
            declaracion.setLong(3, socio.getDni());
            declaracion.setDate(4, new java.sql.Date(socio.getFechaNacimiento().getTime()));
            declaracion.setLong(5, socio.getTelefono());
            declaracion.setString(6, socio.getMail());
            declaracion.setString(7, socio.getDireccion());
            declaracion.setBoolean(8, socio.getPenalizado());
            declaracion.setString(9, socio.getMotivoPenalizado());
            declaracion.setInt(10, idSocio);

            // Ejecutar la consulta de actualización
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Datos del socio modificados exitosamente.");
            } else {
                System.out.println("No se encontro ningun socio con el ID especificado.");
            }

        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            throw new ModelException("Error al cambiar los datos del socio: " + e.getMessage());
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

    public void cambiarPenalizado(boolean penalizado, String motivoPenalizado, int idSocio) throws ModelException {
        Connection conexion = null;
        PreparedStatement declaracion = null;

        try {
            // Establecer la conexión con la base de datos
            conexion = objetoConexion.establecerConexion();

            // Consulta SQL para actualizar la contraseña de un usuario
            String consulta = "UPDATE Personas SET penalizado = ?, motivo_penalizado = ? WHERE idpersona = ?";
            declaracion = conexion.prepareStatement(consulta);

            // Asignar los valores a los parámetros de la consulta
            declaracion.setBoolean(1, penalizado);
            declaracion.setString(2, motivoPenalizado);
            declaracion.setInt(3, idSocio);

            // Ejecutar la consulta de actualización
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Datos del socio modificados exitosamente.");
            } else {
                System.out.println("No se encontro ningun socio con el ID especificado.");
            }

        } catch (Exception e) {
            // Manejo de excepciones en caso de error
            throw new ModelException("Error al cambiar los datos del socio: " + e.getMessage());
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
