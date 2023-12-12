/**
 *
 * @author mariapaulaherrero
 */
public class Ejercicio1eFuncion {
    
    public boolean pertenece( int[] X, int z ){
        boolean Resultado = false;
        for(int i=0; i<X.length; i++) {
            //System.out.println("Elemento [" + i+ "]=" + X[i]);
            if (X[i] == z){
                Resultado=true;
                break;
            }
         }
        return Resultado;
    }
}
