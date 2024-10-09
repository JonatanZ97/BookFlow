package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.ReservaDAOImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelObjets.Reserva;

public class ReservaBusiness {

    int idReserva;
    int idLibro;
    int idSocio;
    Date fechaReserva;

    //getters y setters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public ArrayList<String> obtenerListaReservas() {

        //obtenemos el objeto reservaDAO del model para usar sus metodos
        ReservaDAOImpl reservaM = new ReservaDAOImpl();

        //instanciamos el objeto socio para usar sus metodos
        SociosBusiness socios = new SociosBusiness();

        //creamos una lista que llenaremos con objetos del model
        List<Reserva> listaOBJ = new ArrayList<>();

        //llenamos la lista con los datos de la DB
        listaOBJ = reservaM.obtenerReservas();

        //creamos la lista de String que retornaremos
        ArrayList<String> lista = new ArrayList<>();

        //creamos el objeto libro para usar sus metodos
        LibrosBusiness libros = new LibrosBusiness();

        for (Reserva reserva : listaOBJ) {
            // Concatenar los valores en un String, manejando posibles valores nulos
            String descripcion = String.format(
                    "Id socio: %s, Nombre: %s, Apellido: %s, Fecha de reserva: %s, titulo del libro: %s",
                    reserva.getIdSocio(),
                    socios.obtenerNombre(reserva.getIdSocio()),
                    socios.obtenerApellido(reserva.getIdSocio()),
                    reserva.getFechaReserva(),
                    libros.obtenerTitulo(reserva.getIdLibro())
            );

            // Añadir el String a la lista
            lista.add(descripcion);
        }

        return lista;
    }

    public ArrayList<String> buscarPorNumeroIdentificacion(long numID) {

        //obtenemos el objeto reservaDAO del model para usar sus metodos
        ReservaDAOImpl reservaM = new ReservaDAOImpl();

        //instanciamos el objeto socio para usar sus metodos
        SociosBusiness socios = new SociosBusiness();

        //creamos una lista que llenaremos con objetos del model
        List<Reserva> listaOBJ = new ArrayList<>();

        //llenamos la lista con los datos de la DB
        listaOBJ = reservaM.obtenerReservas();

        //creamos la lista de String que retornaremos
        ArrayList<String> lista = new ArrayList<>();

        //creamos el objeto libro para usar sus metodos
        LibrosBusiness libros = new LibrosBusiness();

        //obtenemos el id del libro
        int idLibro = libros.obtenerID(numID);

        for (Reserva reserva : listaOBJ) {

            if (reserva.getIdLibro() == idLibro) {
                String descripcion = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Fecha de reserva: %s, titulo del libro: %s",
                        reserva.getIdSocio(),
                        socios.obtenerNombre(reserva.getIdSocio()),
                        socios.obtenerApellido(reserva.getIdSocio()),
                        reserva.getFechaReserva(),
                        libros.obtenerTitulo(reserva.getIdLibro())
                );

                // Añadir el String a la lista
                lista.add(descripcion);
            }
        }

        return lista;
    }

    public ArrayList<String> buscarPorIdSocio(int idSocio) {

        //obtenemos el objeto reservaDAO del model para usar sus metodos
        ReservaDAOImpl reservaM = new ReservaDAOImpl();

        //instanciamos el objeto socio para usar sus metodos
        SociosBusiness socios = new SociosBusiness();

        //creamos una lista que llenaremos con objetos del model
        List<Reserva> listaOBJ = new ArrayList<>();

        //llenamos la lista con los datos de la DB
        listaOBJ = reservaM.obtenerReservas();

        //creamos la lista de String que retornaremos
        ArrayList<String> lista = new ArrayList<>();

        //creamos el objeto libro para usar sus metodos
        LibrosBusiness libros = new LibrosBusiness();

        for (Reserva reserva : listaOBJ) {

            if (reserva.getIdSocio() == idSocio) {
                String descripcion = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Fecha de reserva: %s, titulo del libro: %s",
                        reserva.getIdSocio(),
                        socios.obtenerNombre(reserva.getIdSocio()),
                        socios.obtenerApellido(reserva.getIdSocio()),
                        reserva.getFechaReserva(),
                        libros.obtenerTitulo(reserva.getIdLibro())
                );

                // Añadir el String a la lista
                lista.add(descripcion);

            }
        }

        return lista;
    }

    public ArrayList<String> buscarPorDNI(long dni) {

        //obtenemos el objeto reservaDAO del model para usar sus metodos
        ReservaDAOImpl reservaM = new ReservaDAOImpl();

        //instanciamos el objeto socio para usar sus metodos
        SociosBusiness socios = new SociosBusiness();

        //creamos una lista que llenaremos con objetos del model
        List<Reserva> listaOBJ = new ArrayList<>();

        //llenamos la lista con los datos de la DB
        listaOBJ = reservaM.obtenerReservas();

        //creamos la lista de String que retornaremos
        ArrayList<String> lista = new ArrayList<>();

        //creamos el objeto libro para usar sus metodos
        LibrosBusiness libros = new LibrosBusiness();

        //obtenemos el id del socio apartir del dni
        int idSocio = socios.buscarID(dni);

        for (Reserva reserva : listaOBJ) {

            if (reserva.getIdSocio() == idSocio) {
                String descripcion = String.format(
                        "Id socio: %s, Nombre: %s, Apellido: %s, Fecha de reserva: %s, titulo del libro: %s",
                        reserva.getIdSocio(),
                        socios.obtenerNombre(reserva.getIdSocio()),
                        socios.obtenerApellido(reserva.getIdSocio()),
                        reserva.getFechaReserva(),
                        libros.obtenerTitulo(reserva.getIdLibro())
                );

                // Añadir el String a la lista
                lista.add(descripcion);
            }
        }

        return lista;
    }

    public boolean agregarReserva(int idSocio, long numIdentificacion) throws ModelException {

        Date fechaActual = new Date();

        LibrosBusiness libros = new LibrosBusiness();

        if (!libros.existeLibro(numIdentificacion)) {
            return false;
        }

        int idLibro = libros.obtenerID(numIdentificacion);

        Reserva reserva = new Reserva();

        reserva.setIdLibro(idLibro);

        reserva.setFechaReserva(fechaActual);

        reserva.setIdSocio(idSocio);

        ReservaDAOImpl reservar = new ReservaDAOImpl();

        reservar.agregarReserva(reserva);

        return true;

    }

    public void vaciarListaReservas() throws ModelException {
        ReservaDAOImpl reserva = new ReservaDAOImpl();

        reserva.vaciarLista();
    }
}
