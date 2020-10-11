package Hospital;

public final class Main {

    static Pacientes pacientes = new Pacientes();


    public static void main(String[] args) {

        pacientes.nuevoPaciente();

        pacientes.nuevoPaciente();

        pacientes.mostrarPacientes();

        pacientes.modificarPaciente();

        pacientes.mostrarPacientes();

        pacientes.mostrarPacientes();

        pacientes.modificarPaciente();

        pacientes.Visita();



    }

}