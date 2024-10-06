
package BusinessObjects;

import ModelException.ModelException;
import ModelFunctions.HistorialDAOImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import modelObjets.Historial;


public class PrestamoBusiness {
    
    public boolean prestar(int idSocio, long numID, Date fechaRetorno) throws ModelException{
        
        Historial prestamo = new Historial();
        
        SociosBusiness socioB = new SociosBusiness();
        
        LibrosBusiness libroB = new LibrosBusiness();
        
        if(libroB.buscarEstado(numID).equalsIgnoreCase("prestado")){
            
            JOptionPane.showMessageDialog(null, "Este libro ya se encuentra prestado");
            return false;
        }
        
        //consultamos si el socio existe
        if(!socioB.existeSocioID(numID))return false;
        
        //consulyamos si el libro existe
        if(!libroB.existeLibro(numID)) return false;
        
        //obtenemos la fecha actual
        Date fechaActual = new Date(); // Obtener la fecha actual de la PC
        
        // Comparar si la fecha de retorno es anterior a la fecha actual
        if (fechaRetorno.before(fechaActual))return false; // Si la fecha de retorno es anterior, retorna false
        
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
    
    public boolean devolver(long numID) throws ModelException{
        
        boolean resultado = false;
        
        //obtener lista historial
        HistorialDAOImpl historialM = new HistorialDAOImpl();
        
        List<Historial> listaHis;
        
        
        
        listaHis = historialM.obtenerHistorial();
        
        
        for (Historial his : listaHis){
        
            if(his.getFechaReal() == null){
                //aca
                resultado = true;
            }
        }
        
        Date fechaActual = new Date();
        
        historialM.agregarRetorno(0, fechaActual);
        
        return resultado;
    }
    
    
    
    
    
    
}
