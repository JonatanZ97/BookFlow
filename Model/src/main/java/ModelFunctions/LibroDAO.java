
package ModelFunctions;

import modelObjets.Libro;
import ModelException.ModelException;
import java.util.List;
public interface LibroDAO {
    
    public List<Libro> obtenerLibros();
    
    public boolean guardarLibro(Libro libro) throws ModelException;
    
    public void eliminarLibro(int idLibro) throws ModelException;
    
    public void cambiarEstadoLibro(int idLibro, String nuevoEstado) throws ModelException;
}
