import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio2b {
    public static void main(String[] args) {     
        String fileDir = "file/inventario.txt";
        Scanner consola = new Scanner (System.in);

        System.out.println ("Escriba la data del equipo en el formato desc#ct#mu#dd/mm/aaaa#nf#ci (Ejemplo: \"CPU 203#1#10000,00#20/09/2017#01#14444733\"): ");
        String nuevoEquipo = consola.nextLine();
        String [] equipo = nuevoEquipo.split("#");
    
        String[][] resultado = new String[1][6];
        resultado[0] = equipo;
        System.out.println("Escribo al profesor en el archivo: " + fileDir);
        writeFile(resultado,fileDir);
        
        System.out.println ("Se ha ingresado el siguiente equipo: ");
        System.out.println ("Descripicón: " + equipo[0]);
        System.out.println ("Cantidad: " + equipo[1]);
        System.out.println ("Costo unitario: " + equipo[2]);
        System.out.println ("Fecha: " + equipo[3]);    
        System.out.println ("Número Factura: " + equipo[4]);  
        System.out.println ("CI del responsable: " + equipo[5]);  
    }
    
    public static void writeFile(String[][] equipos, String fileDir) {
        
        String content = "";
        for (int i=0; i < equipos.length; i++) {
            String[] equipo = equipos[i];
            System.out.println("equipos[" + i + "]:" + equipo[0] + "#" + equipo[1] + "#" + equipo[2]+ "#" + equipo[3]+ "#" + equipo[4]+ "#" + equipo[5] + ";");
            content += equipo[0] + "#" + equipo[1] + "#" + equipo[2]+ "#" + equipo[3]+ "#" + equipo[4]+ "#" + equipo[5] + ";";
        }
        try{
            FileWriter fw = new FileWriter(fileDir);
            fw.write(content);
            fw.close();
        }catch(IOException e){
            System.out.println("ERROR: al escribir archivo: "  + fileDir);
            e.printStackTrace();
        }    
    }
}
