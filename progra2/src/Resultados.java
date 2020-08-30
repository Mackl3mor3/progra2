import java.util.Date;

public class Resultados {


    private int idResultados;

    private Date tiempo;

    //generate method construct


    public Resultados(int idResultados, Date tiempo) {
        this.idResultados = idResultados;
        this.tiempo = tiempo;
    }

    public Resultados(String s) {
    }

    public Resultados(String s, Producto mentisan) {
    }


    //generate get and set


    public int getIdResultados() {
        return idResultados;
    }

    public void setIdResultados(int idResultados) {
        this.idResultados = idResultados;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }


}
