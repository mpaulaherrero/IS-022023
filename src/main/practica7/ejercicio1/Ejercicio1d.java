import java.util.Scanner;
/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner consola = new Scanner (System.in);

        System.out.println ("Escriba el numero de elementos del arreglo X: ");
        int n = consola.nextInt();
        int[] X = new int[n];

        for(int i=0; i<X.length; i++) {
            System.out.println("Introduzca el elemento [" + i+ "]");
            X[i] = consola.nextInt();
        }
        
        System.out.println ("Introduzca el valor de z: ");
        int z = consola.nextInt();
        
        boolean Resultado = false;
        for(int i=0; i<X.length; i++) {
            //System.out.println("Elemento [" + i+ "]=" + X[i]);
            if (X[i] == z){
                Resultado=true;
                break;
            }
         }
        if(Resultado){
            System.out.println (z + " pertenece a X");            
        } else {
            System.out.println (z + " no pertenece a X");
        }
    }
    
}
