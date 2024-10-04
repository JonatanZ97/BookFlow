
package ModelFunctions;

import modelObjets.Libro;
import ModelException.ModelException;
import java.util.List;
public interface LibroDAO {
    
    public List<Libro> obtenerLibros();
    
    public boolean guardarLibro(Libro libro) throws ModelException;
    
    public void eliminarLibro(long numeroIdentificacion) throws ModelException;
    
    public void cambiarEstadoLibro(long numeroIdentificacion, String nuevoEstado) throws ModelException;
}
