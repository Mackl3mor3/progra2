import java.util.List;

public class Certficado {


    private int idCertificado;

    private String informe;

    private Producto producto;

    private  Muestra muestra;

    private  Resultados resultados;

    private List<Certficado> certficados;

    //generate method construct


    public Certficado(int idCertificado, String informe, Producto producto, Muestra muestra, Resultados resultados, List<Certficado> certficados) {
        this.idCertificado = idCertificado;
        this.informe = informe;
        this.producto = producto;
        this.muestra = muestra;
        this.resultados = resultados;
        this.certficados = certficados;
    }

    public Certficado(int i, double v, Producto mentisan, Producto lechesitaMangnesia, Resultados certficado) {
    }

    public int getIdCertificado() {
        return idCertificado;
    }

    public void setIdCertificado(int idCertificado) {
        this.idCertificado = idCertificado;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public Resultados getResultados() {
        return resultados;
    }

    public void setResultados(Resultados resultados) {
        this.resultados = resultados;
    }

    public List<Certficado> getCertficados() {
        return certficados;
    }

    public void setCertficados(List<Certficado> certficados) {
        this.certficados = certficados;
    }
}
