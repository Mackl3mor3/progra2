package Hospital;

final class Paciente {

    private String id;

    private String nombre;

    private String apellidos;

    private int edad;

    private String genero;

    private String CodVisita;

    public Paciente(String id, String nombre, String apellidos, int edad, String genero) {

        this.id = id;

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.edad = edad;

        this.genero = genero;
    }

    public Paciente() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void mostrar() {

        System.out.println("\n\t***********************************");

        System.out.println("CI DEL PACIENTE: " + id);

        System.out.println("Nombre: " + nombre);

        System.out.println("Apellidos: " + apellidos);

        System.out.println("Edad: " + edad);

        System.out.println("Genero: " + genero);

        System.out.println("codigo de visita " + CodVisita);

        System.out.println("\t************************************");

    }

    public void modificar() {


        System.out.println("\n\t***********************************");

        System.out.println("CI DEL PACIENTE: " + id);

        System.out.println("Nombre: " + nombre);

        System.out.println("Apellidos: " + apellidos);

        System.out.println("Edad: " + edad);

        System.out.println("Genero: " + genero);

        String ciudad = null;
        
        System.out.println("Ciudad: " + ciudad);

        System.out.println("\t************************************");



    }

    public void setVisita() {



        System.out.println("\n\t***********************************");

        System.out.println("Codigo de visita: " + CodVisita);

        Paciente fechaHora = new Paciente();

        System.out.println("Fecha y hora: " + fechaHora);

        String hospital = "";
        System.out.println("Hospital: LOS CACHIS " + hospital);

        System.out.println("Medico: JUAN CARLOS " );

        System.out.println("Diagnostico: NULO " + null);

        System.out.println("Ciudad: COCHABAMBA  ");

        System.out.println("Trtamientos: FUTURA REVISION" );

        System.out.println("Numero de cama: 1354" );

        String fechaSadlida = "";

        System.out.println("Fecha de salida" + fechaSadlida);

        System.out.println("Historial medico : CORRECTO SIN SINTOMATOLOGIAS" );



        System.out.println("\t************************************");



    }
}
