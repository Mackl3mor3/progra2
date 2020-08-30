public class controlCalidad {

    private int idControlcalidad;

    private  Muestra muestra;

    //generate method construct


    public controlCalidad(int idControlcalidad, Muestra muestra) {
        this.idControlcalidad = idControlcalidad;
        this.muestra = muestra;
    }

    //generate get and set


    public int getIdControlcalidad() {
        return idControlcalidad;
    }

    public void setIdControlcalidad(int idControlcalidad) {
        this.idControlcalidad = idControlcalidad;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }


}
