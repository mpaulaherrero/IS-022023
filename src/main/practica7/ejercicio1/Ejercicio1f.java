import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio1f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner consola = new Scanner (System.in);
        int[] X = null;
        int z = 0;
        try{
            System.out.println ("Escriba el numero de elementos del arreglo X: ");
            int n = consola.nextInt();
            X = new int[n];

            for(int i=0; i<X.length; i++) {
                System.out.println("Introduzca el elemento [" + i+ "]");
                X[i] = consola.nextInt();
            }

            System.out.println ("Introduzca el valor de z: ");
            z = consola.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERROR: El valor debe ser numerico");
            X = null;
        } 
            
        Ejercicio1fFuncion funcion = new Ejercicio1fFuncion();
        
        boolean Resultado = funcion.pertenece(X,z);
        if(Resultado){
            System.out.println (z + " pertenece a X");            
        } else {
            System.out.println (z + " no pertenece a X");
        }
    }
    
}
