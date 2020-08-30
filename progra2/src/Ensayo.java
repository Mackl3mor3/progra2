public class Ensayo {

      private int idEnsayo;

      private Muestra muestra;

      //generate method construct


    public Ensayo(int idEnsayo, Muestra muestra) {
        this.idEnsayo = idEnsayo;
        this.muestra = muestra;
    }

    public Ensayo(String s, String positiva) {
    }


    //generate get and set


    public int getIdEnsayo() {
        return idEnsayo;
    }

    public void setIdEnsayo(int idEnsayo) {
        this.idEnsayo = idEnsayo;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }


}



