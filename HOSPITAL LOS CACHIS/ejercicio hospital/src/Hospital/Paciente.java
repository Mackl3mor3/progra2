package Hospital;

import java.util.ArrayList;
import java.util.Scanner;

final class Pacientes {

    private ArrayList<Paciente> pacientes;
    private Scanner teclado;

    public Pacientes() {
        pacientes = new ArrayList<Paciente>();
        teclado = new Scanner(System.in);
    }


    public boolean nuevoPaciente() {

        System.out.println("\n\t**************************************");

        System.out.print("INGRESE EL CI: ");

        String id = teclado.nextLine();

        System.out.print("Nombre: ");

        String nombre = teclado.nextLine();

        System.out.print("Apellidos: ");

        String apellidos = teclado.nextLine();

        System.out.print("Genero: ");

        String genero = teclado.nextLine();

        System.out.print("Edad: ");

        int edad = teclado.nextInt();

        teclado.nextLine();
        Paciente nuevoPaciente = new Paciente(id, nombre, apellidos, edad, genero);

        return pacientes.add(nuevoPaciente);
    }

    public void mostrarPacientes() {
        for (Paciente p: pacientes)
            p.mostrar();
    }

    public void modificarPaciente() {

        for (Paciente p: pacientes)
            p.modificar();


    }


    public void servicio() {
        for (Paciente p: pacientes)
            p.getNombre();
    }

    public void Visita() {
        for (Paciente p: pacientes)
            p.setVisita();
    }

}