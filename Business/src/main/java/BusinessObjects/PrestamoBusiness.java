
package BusinessObjects;

import java.time.LocalDate;
import java.util.Date;
import modelObjets.Historial;


public class PrestamoBusiness {
    
    public boolean prestar(int idSocio, long numID, Date fechaRetorno){
        
        Historial prestamo = new Historial();
        
        SociosBusiness socioB = new SociosBusiness();
        
        LibrosBusiness libroB = new LibrosBusiness();
        
        if(!socioB.existeSocioID(numID))return false;
        
        if(!libroB.existeLibro(numID)) return false;
        
        Date fechaActual = new Date(); // Obtener la fecha actual de la PC
        
        // Comparar si la fecha de retorno es anterior a la fecha actual
        if (fechaRetorno.before(fechaActual))return false; // Si la fecha de retorno es anterior, retorna false
        
       // prestamo.setIdLibro(libroB.);
        
        return true;
        
    }
    
    
}
