
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e108 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        ArrayList <Integer> arrayTemps = new ArrayList<>();

        System.out.print("Introduce un año: ");
        int año = teclado.nextInt();

        for (int i = 1; i <= 365; i++) {
            
            arrayTemps.add((int) (Math.random() * 21) + 10);

        }

        HashMap <Integer, Integer> disTemps = new HashMap<>();

        for (int i = 0; i < arrayTemps.size(); i++) {

            if (disTemps.containsKey(arrayTemps.get(i))) {

                disTemps.put(arrayTemps.get(i), disTemps.get(arrayTemps.get(i)) + 1);

            }
            
            else {
                
                disTemps.put(arrayTemps.get(i), 1);
            
            }
            
        }

        System.out.println("--- Temperaturas del Año " + año + " ---");

        for (Integer grados : disTemps.keySet()) {

            System.out.println("Hubo " + disTemps.get(grados) + " días de " + grados + " grados");
            
        }

    }
    
}
