public class Producto {
    private int idProducto;

    private String nombre;



    //metodo construct

    public Producto(int idProducto, String nombre) {
        this.setIdProducto(idProducto);
        this.setNombre(nombre);
    }

    //get and set

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
