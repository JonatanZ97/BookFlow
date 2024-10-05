
package BusinessObjects;

public class SocioLocal {
    private static SocioLocal instance;
    private int id;

    // Constructor privado para evitar instanciaciones externas
    private SocioLocal() { }

    // Método estático sincronizado para obtener la única instancia
    public static synchronized SocioLocal getInstance() {
        if (instance == null) {
            instance = new SocioLocal();
        }
        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

