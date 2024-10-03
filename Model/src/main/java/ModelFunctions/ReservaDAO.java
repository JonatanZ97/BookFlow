
package ModelFunctions;
import modelObjets.Reserva;
import ModelException.ModelException;
import java.util.Date;
import java.util.List;
public interface ReservaDAO {
    
    public List<Reserva> obtenerReservas();
    
    public void agregarReserva(Reserva reserva) throws ModelException;
    
}
