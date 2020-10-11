import java.util.List;

public class servicio<Ciudad> {

String idServicio;

String nombre;

Ciudad ciudad;

int telefono;

List<Hospital> servicios;

Medico director;


    public servicio(String idServicio, String nombre, Ciudad ciudad, int telefono, List<Hospital> servicios, Medico director) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
        this.director = director;
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Hospital> getServicios() {
        return servicios;
    }

    public void setServicios(List<Hospital> servicios) {
        this.servicios = servicios;
    }

    public Medico getDirector() {
        return director;
    }

    public void setDirector(Medico director) {
        this.director = director;
    }
}
