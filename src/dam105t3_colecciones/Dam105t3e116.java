
package dam105t3_colecciones;

import java.time.LocalDate;
import java.util.*;


public class Dam105t3e116 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        TreeSet <Persona_v3> fiesta = new TreeSet<>();

        fiesta.add(new Persona_v3("Alfredo", "11111111A", 999888777, "uncorreo1@algo.com", LocalDate.parse("2001-08-14")));

        fiesta.add(new Persona_v3("Maria", "22222222B", 111222333, "uncorreo2@algo.com", LocalDate.parse("1980-08-14")));

        fiesta.add(new Persona_v3("Rodrigo", "33333333C", 444555666, "uncorreo3@algo.com", LocalDate.parse("1999-08-14")));

        fiesta.add(new Persona_v3("Julian", "44444444D", 777555333, "uncorreo4@algo.com", LocalDate.parse("1987-08-14")));

        fiesta.add(new Persona_v3("Sabela", "55555555E", 999555111, "uncorreo5@algo.com", LocalDate.parse("1997-08-14")));

        
        // Valores almacenados

        System.out.println("--- Valores Almacenados ---");

        for (Persona_v3 persona : fiesta) {
            
            System.out.println(persona.toString());

        }

    }
    
}
