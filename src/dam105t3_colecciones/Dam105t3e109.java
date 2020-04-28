
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e109 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ArrayList <Integer> arrayTemps = new ArrayList<>();

        for (int i = 1; i <= 365; i++) {
            
            arrayTemps.add((int) (Math.random() * 21) + 10);

        }

        TreeMap <Integer, Integer> disTemps = new TreeMap<>();

        for (int i = 0; i < arrayTemps.size(); i++) {

            if (disTemps.containsKey(arrayTemps.get(i))) {

                disTemps.put(arrayTemps.get(i), disTemps.get(arrayTemps.get(i)) + 1);

            }
            
            else {
                
                disTemps.put(arrayTemps.get(i), 1);
            
            }
            
        }

        System.out.println("Temperatura mínima:");

        System.out.println("Hubo " + disTemps.firstEntry().getValue() + " días de " + disTemps.firstEntry().getKey() + " grados");

        System.out.println("");

        System.out.println("Temperatura máxima:");

        System.out.println("Hubo " + disTemps.lastEntry().getValue() + " días de " + disTemps.lastEntry().getKey() + " grados");

    }
    
}
