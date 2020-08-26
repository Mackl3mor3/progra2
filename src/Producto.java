public class Producto {
    private int idProducto;
    private String nombre;

    public Producto(int idProducto, String nombre) {
        this.setIdProducto(idProducto);
        this.setNombre(nombre);
    }


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
