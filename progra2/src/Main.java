import java.util.ArrayList;
import java.util.List;

public class Main {


    private static Object Lote;

    public static void main(String[] args) {

        ///Lote

        Lote Medicamentos = new Lote(1,"3334" ,"agosto del 2020","Septiembre del 2028");

        //producto

        Producto Mentisan = new Producto(1,"Mentisan");

        Producto LechesitaMangnesia = new Producto(2,"lechesitaMagenesia");



        //Muestra

        Muestra laboratorio = new Muestra(1,"laboratorio");

        //Ensayo

        Lote  = new Ensayo ("167686" ,"NEGATIVA ");

        Lote  = new Ensayo ("0000" , "POSITIVA");

        Ensayo orielLea = new Ensayo ("00000", "POSITIVA");


        //Resultados

        List<Producto> resultados = new ArrayList<Producto>();

        Resultados Certficado = new Resultados("777");

        resultados.add(Mentisan);

        Resultados resultados1 = new Resultados("45345345", Mentisan);

        resultados.add(LechesitaMangnesia);

        //Certficacio

        Certficado certficado = new Certficado(1, 189546 , Mentisan, LechesitaMangnesia , Certficado);


        System.out.println("SISTEMA NACIONAL DE CERTIFICACION");

        System.out.println("================================================================================================================================================================================");

        System.out.println("ID--: "+ LechesitaMangnesia + "73001");

        System.out.println("RESULTADOS-: " + Mentisan + "La supervisión de los tiempos de traslado es fundamental para que se conserven estables los analitos que se desean estudiar. ");

        System.out.println("EMISION POSITIVA DE INFORME-:" + certficado.getInforme()+ "REVISION ESTANDARIZADA DE MEDICAMENTOS");

        System.out.println("INFORME-: " + certficado.getMuestra() + " LOS MEDICAMENTOS CUMPLEN CON LA NORMATIVA Boliviana 73001");

        System.out.println("FECHA DE INICIO-: " + certficado.getProducto() + "21 DE SEPTIEMBRE DEL 2020");

        System.out.println("FECHE DE FINALIZACION-: " + certficado.getIdCertificado() + "30 DE AGOSTO DEL 2028");

        System.out.println("CERTIFICADO-: " + certficado + "\nEMITIDO");

        System.out.println("****--FUE APROVADO PARA EL USO DE ESTOS FARMACOS----****");

        {


            System.out.println("Muestras:" + certficado.getIdCertificado() + " | informe: " + certficado.getProducto() + " | fecha inicio:" + certficado.getMuestra() + " | fechafinal:" + certficado.getInforme());


        }

        System.out.println("===========================================================================================================================================================================================");





    }



}
