
package dam105t3_colecciones;

import java.time.LocalDate;
import java.util.*;


public class Dam105t3e104 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nomMayor = "";

        int totalEdades = 0;

        int edadMayor = 0;

        LinkedHashSet <Persona> fiesta = new LinkedHashSet<>();

        fiesta.add(new Persona("Alfredo", 999888777, "uncorreo@algo.com", LocalDate.parse("2001-08-14")));

        fiesta.add(new Persona("Eduardo", 111222333, "uncorreo2@algo.com", LocalDate.parse("1980-08-14")));

        fiesta.add(new Persona("Maria", 444555666, "uncorreo3@algo.com", LocalDate.parse("1999-08-14")));

        fiesta.add(new Persona("Julian", 777555333, "uncorreo4@algo.com", LocalDate.parse("1987-08-14")));

        fiesta.add(new Persona("Sabela", 999555111, "uncorreo5@algo.com", LocalDate.parse("1997-08-14")));

        for (Persona persona : fiesta) {

            if (persona.calcEdad() > edadMayor) {

                edadMayor = persona.calcEdad();

                nomMayor = persona.getNombre();

            }
            
            totalEdades += persona.calcEdad();

        }

        int edadMedia = (int) totalEdades / fiesta.size();

        System.out.println("La persona más mayor se llama " + nomMayor);

        System.out.println("La edad media de las personas es de " + edadMedia);


        // Valores almacenados

        System.out.println("--- Valores Almacenados ---");

        for (Persona persona : fiesta) {
            
            System.out.println(persona.toString());

        }

    }
    
}
