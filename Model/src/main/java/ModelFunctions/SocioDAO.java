package ModelFunctions;

import modelObjets.Socio;
import ModelException.ModelException;
import java.util.List;

public interface SocioDAO {

    public List<Socio> obtenerSocios();

    public void guardarSocio(Socio usuario) throws ModelException;

    public void eliminarSocioID(int idUsuario) throws ModelException;

}
