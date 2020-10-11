import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;


//NOTA CAMBIAR LA DIRECCION A SEGUN EL USUARIO Y LA PC AL QUE VAYA QUERER GENERAR EL HASH

public class Main {


    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {


        new Documento(1, 5, "D", "C", 12, Calendar.getInstance().getTime(), "asd");


        String ruta = "C:/Users/KUNIO/Desktop/hash.txt";//cambiar la ruta segun el user para que genere correctamente el hash

        File archivo = new File(ruta);

        BufferedWriter bw;

        if(archivo.exists())
        {

            bw = new BufferedWriter(new FileWriter(archivo));

            bw.write("****generando hash******\n");

        }
        else
            {
            bw = new BufferedWriter(new FileWriter(archivo));

            bw.write("******hash checksum*****\n");
        }

        //tranformacion de lectura de byte a string para que muestre en texto el hash generado en la memoria ram

        byte[] b = Files.readAllBytes(Paths.get("C:\\Users\\KUNIO\\Desktop\\prueba.txt"));//CAMBIAR ESTA RUTA SEGUN LA PC PARA QUE FUNCIONE EL GENERAR ARCHIVOS
        byte[] digest = MessageDigest.getInstance("MD5").digest(b);

        String s = toHexString(digest);

        bw.write(s);

        bw.close();

        File miDir = new File("\"C:\\\\Users\\\\KUNIO\\\\Desktop\\\\prueba.txt\"");
        Buscador(miDir);


    }


    //busca los documentos en el hash ya generado
    private static void Buscador(File miDir) {


        try {
            File dir = null;
            assert false;
            File[] files = dir.listFiles();
            assert files != null;
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directorio:" + file.getCanonicalPath());
                    Buscador(file);
                } else {
                    System.out.println("     archivo:" + file.getCanonicalPath());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static String toHexString(byte[] bytes)
    {
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < bytes.length; i++)
        {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

}
