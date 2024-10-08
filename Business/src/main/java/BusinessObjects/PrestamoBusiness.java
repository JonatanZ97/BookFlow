package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.HistorialDAOImpl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import modelObjets.Historial;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class PrestamoBusiness {

    int idHistorial;
    int idLibro;
    int idSocio;
    LocalDate fechaPrestamo;

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public boolean prestar(int idSocio, long numID, Date fechaRetorno) throws ModelException {

        Historial prestamo = new Historial();

        SociosBusiness socioB = new SociosBusiness();

        LibrosBusiness libroB = new LibrosBusiness();

        if (libroB.buscarEstado(numID).equalsIgnoreCase("prestado")) {

            JOptionPane.showMessageDialog(null, "Este libro ya se encuentra prestado");
            return false;
        }

        //consultamos si el socio existe
        //if(!socioB.existeSocioID(numID))return false;
        //consulyamos si el libro existe
        if (!libroB.existeLibro(numID)) {
            return false;
        }

        //obtenemos la fecha actual
        Date fechaActual = new Date(); // Obtener la fecha actual de la PC

        // Comparar si la fecha de retorno es anterior a la fecha actual
        if (fechaRetorno.before(fechaActual)) {
            return false; // Si la fecha de retorno es anterior, retorna false
        }
        //guardamos los datos en el objeto
        prestamo.setIdLibro(libroB.obtenerID(numID));//obtenemos el id del socio

        prestamo.setIdSocio(idSocio);

        prestamo.setFechaPrestamo(fechaActual);

        prestamo.setFechaRetorno(fechaRetorno);

        HistorialDAOImpl prestamoModel = new HistorialDAOImpl();

        prestamoModel.agregarHistorial(prestamo);

        libroB.cambiarAprestado(numID);

        return true;

    }

    public boolean devolver(long numID) throws ModelException {

        boolean resultado = false;

        //obtener lista historial
        HistorialDAOImpl historialM = new HistorialDAOImpl();

        List<Historial> listaHis;

        int idHis = 0;

        listaHis = historialM.obtenerHistorial();

        LibrosBusiness libroB = new LibrosBusiness();

        int idDB = libroB.obtenerID(numID);

        for (Historial his : listaHis) {

            if (his.getFechaReal() == null && idDB == his.getIdLibro()) {

                idHis = his.getIdHistorial();

                resultado = true;
            }
        }

        Date fechaActual = new Date();

        historialM.agregarRetorno(idHis, fechaActual);

        return resultado;
    }

    public ArrayList<String> obtenerHistrorial() {

        ArrayList<String> listaString = new ArrayList<>();

        List<Historial> listaM = new ArrayList<>();

        HistorialDAOImpl historialM = new HistorialDAOImpl();

        listaM = historialM.obtenerHistorial();

        LibrosBusiness libroB = new LibrosBusiness();

        SociosBusiness socio = new SociosBusiness();

        for (Historial his : listaM) {

            // Concatenar los valores en un String
            String descripcionLibro = String.format(
                    "Libro: %s, Nombre: %s, apellido: %d Fecha de prestamo: %s, Fecha de rotorno pactada: %s, Fecha de retorno real: %s",
                    libroB.obtenerTitulo(his.getIdLibro()),
                    socio.obtenerNombre(his.getIdSocio()),
                    socio.obtenerApellido(his.getIdSocio()),
                    his.getFechaPrestamo(),
                    his.getFechaRetorno() != null ? socio.getMotivoPenalizado() : "N/A",
                    his.getFechaReal() != null ? socio.getMotivoPenalizado() : "N/A"
            );

            // Añadir el String a la lista
            listaString.add(descripcionLibro);

        }

        return listaString;

    }

    public boolean renovarPrestamo(long numIdentificacion, Date nuevaFecha) throws ModelException {
        //variable a retornar
        boolean resultado = false;

        //obtener lista historial
        HistorialDAOImpl historialM = new HistorialDAOImpl();

        //creamos la lista de los prestamos
        List<Historial> listaHis;

        //obtenemos desde la DB el historial de prestamos
        listaHis = historialM.obtenerHistorial();

        //instanciamos libroBusiness para usar sus metodos
        LibrosBusiness libroB = new LibrosBusiness();

        //apartir del numero de identificacion obtenemos el id del libro
        int idDB = libroB.obtenerID(numIdentificacion);

        //recorremos la lista en busca de un libro que no halla sido devuelto y su id coinsida con el del libro ingresado
        for (Historial his : listaHis) {

            if (his.getFechaReal() == null && idDB == his.getIdLibro()) {

                //le asignamos la nueva fecha de retorno
                his.setFechaRetorno(nuevaFecha);
                
                historialM.cambiarFechaRetorno(idDB, nuevaFecha);

                resultado = true;
            }
        }

        return resultado;
    }

    public void borrarHistorialPrestamos() throws ModelException {

        HistorialDAOImpl prestamos = new HistorialDAOImpl();

        prestamos.vaciarLista();

    }

    // Método de conversión de Date a LocalDate
    public static LocalDate convertirDateALocalDate(Date fecha) {
        return fecha.toInstant()
                .atZone(ZoneId.of("America/Argentina/Buenos_Aires")) // Definir la zona horaria de Buenos Aires
                .toLocalDate();
    }

    public ArrayList<String> obtenerEstadisticas(Date fechaInicio, Date fechaFin) {

        //creamos los objetos nesesarios
        ArrayList<String> listaString = new ArrayList<>();

        LibrosBusiness libros = new LibrosBusiness();

        //convierto las variables tipo Date a LocalDate
        LocalDate fechaInicioLD = convertirDateALocalDate(fechaInicio);
        LocalDate fechaFinLD = convertirDateALocalDate(fechaFin);

        //obtenemos la lista de los libros mas prestados entre las fechas seleccionadas
        List<Integer> masPrestados = librosMasPrestadosEntreFechas(fechaInicioLD, fechaFinLD);
        
        
        //==========================================================================================
            
        //obtenemos los datos del libro 1
        long numID = libros.obtenerNumID(masPrestados.get(0));

        libros = libros.obtenerDatos(numID);
        
        //guardamos los datos en variables String
        String titulo = libros.getTitulo();
        String autor = libros.getAutor();
        String editorial = libros.getEditorial();

        //las convinamos en un String
        StringBuilder sb = new StringBuilder();
        sb.append(titulo);
        sb.append(", ");
        sb.append(editorial);
        sb.append(", ");
        sb.append(autor);

        //las guardamos en un nuevo String
        String combinacion = sb.toString();
        
        //lo sumamos a la lista
        listaString.add(combinacion);
        
        //==========================================================================================
            
        //obtenemos los datos del libro 1
        numID = libros.obtenerNumID(masPrestados.get(1));

        libros = libros.obtenerDatos(numID);
        
        //guardamos los datos en variables String
        titulo = libros.getTitulo();
        autor = libros.getAutor();
        editorial = libros.getEditorial();

        //las convinamos en un String
        StringBuilder sb2 = new StringBuilder();
        sb.append(titulo);
        sb.append(", ");
        sb.append(editorial);
        sb.append(", ");
        sb.append(autor);

        //las guardamos en un nuevo String
        combinacion = sb2.toString();
        
        //lo sumamos a la lista
        listaString.add(combinacion);
        
        //==========================================================================================
            
        //obtenemos los datos del libro 1
        numID = libros.obtenerNumID(masPrestados.get(0));

        libros = libros.obtenerDatos(numID);
        
        //guardamos los datos en variables String
        titulo = libros.getTitulo();
        autor = libros.getAutor();
        editorial = libros.getEditorial();

        //las convinamos en un String
        StringBuilder sb3 = new StringBuilder();
        sb.append(titulo);
        sb.append(", ");
        sb.append(editorial);
        sb.append(", ");
        sb.append(autor);

        //las guardamos en un nuevo String
        combinacion = sb3.toString();
        
        //lo sumamos a la lista
        listaString.add(combinacion);
        
        
        //retornamos la loista con los libros 
        return listaString;
    }

    public List<Integer> librosMasPrestadosEntreFechas(LocalDate fechaInicio, LocalDate fechaFin) {

        // Instanciación correcta de la lista
        List<Historial> prestamosM = new ArrayList<>();

        // Obtener la lista de préstamos desde el DAO
        HistorialDAOImpl historialM = new HistorialDAOImpl();
        prestamosM = historialM.obtenerHistorial();

        // Creamos lista de PrestamoBusiness
        List<PrestamoBusiness> prestamos = new ArrayList<>();

        for (Historial his : prestamosM) {
            PrestamoBusiness prestamoB = new PrestamoBusiness();
            prestamoB.setIdHistorial(his.getIdHistorial());
            prestamoB.setIdLibro(his.getIdLibro());
            prestamoB.setIdSocio(his.getIdSocio());

            LocalDate fechaLocalDate = convertirDateALocalDate(his.getFechaPrestamo());
            prestamoB.setFechaPrestamo(fechaLocalDate);

            // Añadir prestamo a la lista de PrestamoBusiness
            prestamos.add(prestamoB);
        }

        // Filtrar los préstamos entre las fechas dadas
        Map<Integer, Long> conteoPrestamos = prestamos.stream()
                .filter(p -> !p.getFechaPrestamo().isBefore(fechaInicio) && !p.getFechaPrestamo().isAfter(fechaFin))
                .collect(Collectors.groupingBy(PrestamoBusiness::getIdLibro, Collectors.counting()));

        // Ordenar por el número de préstamos en orden descendente y limitar a los 3 más prestados
        return conteoPrestamos.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue())) // Ordenar de mayor a menor
                .limit(3) // Limitar a los 3 más prestados
                .map(Map.Entry::getKey) // Obtener el ID de los libros
                .collect(Collectors.toList());  // Devolver la lista de IDs
    }

}
