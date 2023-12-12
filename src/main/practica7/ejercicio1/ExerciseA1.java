/**
 *
 * @author mariapaulaherrero
 */
public class ExerciseA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[ ] arrayX = {-8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        int elementZ = 13;
        boolean isElementOfArray = false;
        int i=0;
        while(i<arrayX.length){
            if (arrayX[i] == elementZ){
                isElementOfArray=true;
                break;
            }
            i++;
         }
        if(isElementOfArray){
            System.out.println (elementZ + " pertenece a X");            
        } else {
            System.out.println (elementZ + " no pertenece a X");
        }
    }
    
}
