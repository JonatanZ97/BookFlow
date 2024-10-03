
package ModelFunctions;
import modelObjets.Historial;
import ModelException.ModelException;
import java.util.Date;
import java.util.List;
public interface HistorialDAO {
    
    public List<Historial> obtenerHistorial();
    
    public void agregarHistorial(Historial historial) throws ModelException;
    
    public void eliminarHistorial(int idHistorial) throws ModelException;
    
    public void agregarRetorno(int idHistorial, Date fechaRetorno) throws ModelException;
}
