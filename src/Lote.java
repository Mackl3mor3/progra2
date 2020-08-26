import java.util.Date;

public class Lote {
    private int idLote;
    private String codigo;
    private Date fechaProduccion;
    private Date fechaVencimiento;
    private Producto producto;

    public Lote(int idLote, String codigo, Date fechaProduccion, Date fechaVencimiento, Producto producto) {
        this.idLote = idLote;
        this.codigo = codigo;
        this.fechaProduccion = fechaProduccion;
        this.fechaVencimiento = fechaVencimiento;
        this.producto = producto;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
