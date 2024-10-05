package modelObjets;

import java.util.Date;//importo para usar variables tipo Date

public class Socio {

    /*
    autor: david
    hora 14:53
    seccion de atributos
    principales atributos que componen al objeto
     */
    int id;    
    String nombre;
    String apellido;
    long dni;
    Date fechaNacimiento;
    long telefono;
    String mail;
    String direccion;
    boolean penalizado = false;
    String motivoPenalizado;
    
    
    /*
    autor: david
    hora 14:53
    seccion de getters and setters
    principales metodos para modificar al ojeto
     */

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getDni() {
        return dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public boolean getPenalizado() {
        return penalizado;
    }
    
    public String getMotivoPenalizado() {
        return motivoPenalizado;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void setPenalizado(boolean penalizado) {
        this.penalizado = penalizado;
    }
    
    public void setMotivoPenalizado(String motivoPenalizado) {
        this.motivoPenalizado = motivoPenalizado;
    }

}
