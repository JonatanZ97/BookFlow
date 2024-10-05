
package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.HistorialDAOImpl;
import java.time.LocalDate;
import java.util.Date;
import modelObjets.Historial;


public class PrestamoBusiness {
    
    public boolean prestar(int idSocio, long numID, Date fechaRetorno) throws ModelException{
        
        Historial prestamo = new Historial();
        
        SociosBusiness socioB = new SociosBusiness();
        
        LibrosBusiness libroB = new LibrosBusiness();
        
        if(!socioB.existeSocioID(numID))return false;
        
        if(!libroB.existeLibro(numID)) return false;
        
        Date fechaActual = new Date(); // Obtener la fecha actual de la PC
        
        // Comparar si la fecha de retorno es anterior a la fecha actual
        if (fechaRetorno.before(fechaActual))return false; // Si la fecha de retorno es anterior, retorna false
        
        prestamo.setIdLibro(libroB.obtenerID(numID));
        
        prestamo.setIdSocio(idSocio);
        
        prestamo.setFechaPrestamo(fechaActual);
        
        prestamo.setFechaRetorno(fechaRetorno);
        
        HistorialDAOImpl prestamoModel = new HistorialDAOImpl();
        
        prestamoModel.agregarHistorial(prestamo);
        
        
        
        return true;
        
    }
    
    
}
