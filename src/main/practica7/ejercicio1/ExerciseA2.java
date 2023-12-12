import java.util.Scanner;

/**
 *
 * @author mariapaulaherrero
 */
public class ExerciseA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        System.out.println ("Escriba el numero de elementos del arreglo arrayX: ");
        int totalN = console.nextInt();
        int[] arrayX = new int[totalN];

        int i=0;
        while( i<arrayX.length) {
            System.out.println("Introduzca el elemento [" + i+ "]");
            arrayX[i] = console.nextInt();
            i++;
        }

        System.out.println ("Introduzca el valor de z: ");
        int z = console.nextInt();
        
        boolean isElementOfArray = false;
        i=0;
        while(i<arrayX.length){
            if (arrayX[i] == z){
                isElementOfArray=true;
                break;
            }
            i++;
         }
        if(isElementOfArray){
            System.out.println (z + " pertenece a X");
        } else {
            System.out.println (z + " no pertenece a X");
        }
    }
    
}
