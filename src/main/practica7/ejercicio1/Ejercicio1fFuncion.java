/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio1fFuncion {
    
    public boolean pertenece( int[] X, int z ){
        boolean Resultado = false;
        try{
            for(int i=0; i<X.length; i++) {
                //System.out.println("Elemento [" + i+ "]=" + X[i]);
                if (X[i] == z){
                    Resultado=true;
                    break;
                }
            }
        }catch (NullPointerException e){
            System.out.println("ERROR: El arreglo X es nulo");
        }     
        return Resultado;
    }
}
