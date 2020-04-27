
package dam105t3_colecciones;

import java.time.LocalDate;
import java.util.*;


public class Dam105t3e105 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nomMayor = "";

        int totalEdades = 0;

        int edadMayor = 0;

        LinkedHashSet <Persona_v2> fiesta = new LinkedHashSet<>();

        fiesta.add(new Persona_v2("Alfredo", 999888777, "uncorreo@algo.com", LocalDate.parse("2001-08-14")));

        fiesta.add(new Persona_v2("Maria", 111222333, "uncorreo2@algo.com", LocalDate.parse("1980-08-14")));

        fiesta.add(new Persona_v2("MARIA", 444555666, "uncorreo3@algo.com", LocalDate.parse("1999-08-14")));

        fiesta.add(new Persona_v2("Julian", 777555333, "uncorreo4@algo.com", LocalDate.parse("1987-08-14")));

        fiesta.add(new Persona_v2("Sabela", 999555111, "uncorreo5@algo.com", LocalDate.parse("1997-08-14")));

        for (Persona_v2 persona : fiesta) {

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

        for (Persona_v2 persona : fiesta) {
            
            System.out.println(persona.toString());

        }

    }
    
}
