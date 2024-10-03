package ModelFunctions;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    /*
    autor: david
    hora 15:31
    hago toda la configuracion para conectarme a la base de datos
     */
    Connection conectar = null;
    //guardo los datos para luego unirlo en la variable cadena
    final String usuario = "postgres";
    final String contrasenia = "1234";
    final String DB = "Libreria";
    final String ip = "localhost";
    final String puerto = "5432";
    //lo uno todo en una direccion
    final String cadena = "jdbc:postgresql://" + ip + ":" + puerto + "/" + DB;

    public Connection establecerConexion() {
        try {
            System.out.println("intentando cargar el driver de postgreSQL");
            Class.forName("org.postgresql.Driver");// me paro en la direccion de la libreria
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);//me conecto a la base de datos
            System.out.println("se conecto correctamente a la base de datos");
        } catch (Exception e) {
            System.out.println("error al conectar a la base de datos, error: " + e.toString());
        }
        return conectar;//devuelvo el estado de la conexion
    }
}
