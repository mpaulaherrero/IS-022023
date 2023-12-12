import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio2c {
    public static void main(String[] args) {     
        String fileDir = "file/inventario.txt";
        Scanner consola = new Scanner (System.in);
        
        System.out.println ("Escriba la data del equipo en el formato desc#ct#mu#dd/mm/aaaa#nf#ci (Ejemplo: \"CPU 203#1#10000.00#20/09/2017#01#14444733\"): ");
        String nuevoEquipo = consola.nextLine();
        String [] equipo = nuevoEquipo.split("#");
        
        String[][] equipos = readFile(fileDir);
        
        String[][] resultado = new String[equipos.length+1][6];
        for (int i=0; i < equipos.length; i++) {
               resultado[i] = equipos[i];
        }
        resultado[equipos.length] = equipo;
       
        System.out.println ("Se ha ingresado el siguiente equipo: ");
        System.out.println ("Descripicón: " + equipo[0]);
        System.out.println ("Cantidad: " + equipo[1]);
        System.out.println ("Costo unitario: " + equipo[2]);
        System.out.println ("Fecha: " + equipo[3]);    
        System.out.println ("Número Factura: " + equipo[4]);  
        System.out.println ("CI del responsable: " + equipo[5]);  
        
        System.out.println("Escribo al profesor en el archivo: " + fileDir);
        writeFile(resultado,fileDir);
       
        System.out.println("Calculo el reporte");
        
        HashMap reporteTotalEquipos = new HashMap();
        HashMap reporteMontoEquipos = new HashMap();
      
        //String cedulasStr ="";
        for (String[] resultado1 : resultado) {
            String ci = resultado1[5];
            int cantidad = Integer.parseInt(resultado1[1]);
            float monto = Float.parseFloat(resultado1[2]);
            if(reporteTotalEquipos.containsKey(ci)){
                int sumaCantidad = cantidad + (int)reporteTotalEquipos.get(ci);
                float sumaMonto = monto + (float)reporteMontoEquipos.get(ci);
                //System.out.println("Profesor: " + ci + ", cantidad de equipos: " + sumaCantidad + ", monto: " + sumaMonto + ";");
                reporteTotalEquipos.put(ci,sumaCantidad);
                reporteMontoEquipos.put(ci,sumaMonto);                
            } else {
                reporteTotalEquipos.put(ci,cantidad);
                reporteMontoEquipos.put(ci,monto);
            }
        }
        //Procesor, numero total de equipos, monto que tiene bajo su reponsabilidad
        Iterator iterator = reporteTotalEquipos.keySet().iterator();
        while(iterator.hasNext()) {
            String ci = iterator.next().toString();
            int cantidad = (int)reporteTotalEquipos.get(ci);
            float monto = (float)reporteMontoEquipos.get(ci);
            System.out.println("Profesor: " + ci + ", cantidad de equipos: " + cantidad + ", monto: " + monto + ";");
        }
    }
    
       public static String[][] readFile(String fileDir) {
           String content = "";
           try{
            content = new Scanner(new File(fileDir)).useDelimiter("\\Z").next();
            content = content.replaceAll("\n", "");
           }catch(FileNotFoundException e){
              System.out.println("ERROR: Archivo no encontrado"  + fileDir);
           }catch(NoSuchElementException e){
              System.out.println("ERROR: Elemenot incorrecto al abrir:"  + fileDir);
           } 
       
           
        //System.out.println("content:" + content);
        
        String[] equipos = content.split(";");
        //System.out.println("a.length: "+ a.length);
        String[][] resultado = new String[equipos.length][3];
        for (int i=0; i < equipos.length; i++) {
            resultado[i] = equipos[i].split("#");
            //System.out.println(Arrays.toString(resultado[i]));
        }
        return resultado;
    }
   
    
    public static void writeFile(String[][] equipos, String fileDir) {
        
        String content = "";
        //System.out.println(Arrays.toString(profesores));
        for (int i=0; i < equipos.length; i++) {
            String[] equipo = equipos[i];
            System.out.println("equipos[" + i + "]:" + equipo[0] + "#" + equipo[1] + "#" + equipo[2]+ "#" + equipo[3]+ "#" + equipo[4]+ "#" + equipo[5] + ";");
            content += equipo[0] + "#" + equipo[1] + "#" + equipo[2]+ "#" + equipo[3]+ "#" + equipo[4]+ "#" + equipo[5] + ";\n";
        }
        //System.out.println(content);
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
