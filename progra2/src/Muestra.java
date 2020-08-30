public class Muestra {


    private int idMuestra;

   private String nombre;

    private String ensayo;

     // generate method construct

    public Muestra(int idMuestra, String nombre, String ensayo) {
        this.idMuestra = idMuestra;
        this.nombre = nombre;
        this.ensayo = ensayo;
    }

    public Muestra(int i, String laboratorio) {
    }


    // generate method get and set


    public int getIdMuestra() {
        return idMuestra;
    }

    public void setIdMuestra(int idMuestra) {
        this.idMuestra = idMuestra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnsayo() {
        return ensayo;
    }

    public void setEnsayo(String ensayo) {
        this.ensayo = ensayo;
    }

}
