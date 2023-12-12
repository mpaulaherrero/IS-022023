import java.util.Scanner;

/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio2a {
    public static void main(String[] args) {
        Scanner consola = new Scanner (System.in);
        System.out.println ("Escriba la data del equipo en el formato desc#ct#mu#dd/mm/aaaa#nf#ci (Ejemplo: \"CPU 203#1#10000,00#20/09/2017#01#14444733\"): ");
        String nuevoEquipo = consola.nextLine();
        String [] equipo = nuevoEquipo.split("#");
        
        System.out.println ("Se ha ingresado el siguiente equipo: ");
        System.out.println ("Descripicón: " + equipo[0]);
        System.out.println ("Cantidad: " + equipo[1]);
        System.out.println ("Costo unitario: " + equipo[2]);
        System.out.println ("Fecha: " + equipo[3]);    
        System.out.println ("Número Factura: " + equipo[4]);  
        System.out.println ("CI del responsable: " + equipo[5]);
    }
}
