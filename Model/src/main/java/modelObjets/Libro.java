package modelObjets;

public class Libro {

    /*
    autor: david
    hora 14:50
    seccion de atributos
    principales atributos que componen al objeto
     */
    private String titulo;
    private String autor;
    private String estadoDelLibro;
    private String genero;
    private String editorial;
    private long numeroDeIdentificacion;


    /*
    autor: david
    hora 14:51
    seccion de getters and setters
    para obtener y modificar los datos
     */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstadoDelLibro() {
        return estadoDelLibro;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public long getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstadoDelLibro(String estadoDelLibro) {
        this.estadoDelLibro = estadoDelLibro;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setNumeroDeIdentificacion(long numeroDeIdentificacion) {
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

}
