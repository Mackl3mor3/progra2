public class Lote {


    private String idLote;

    private String codigo;

    private String fechaProduccion;

    private String fechaVencimiento;

    private Producto producto;

    //generate Method construct

    public Lote(String idLote, String codigo, String fechaProduccion, String fechaVencimiento, Producto producto) {

        this.idLote = idLote;
        this.codigo = codigo;
        this.fechaProduccion = fechaProduccion;
        this.fechaVencimiento = fechaVencimiento;
        this.producto = producto;
    }

    public Lote(int i, String s, String s1, String s2) {

        this.idLote = getFechaProduccion();

        this.idLote = getFechaVencimiento();

    }


    //generate get and set


    public String getIdLote() {


        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}