
package dam105t3_colecciones;

import java.time.LocalDate;
import java.util.*;


public class Dam105t3e117 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        List <Persona_v3> fiesta = new ArrayList<>();

        fiesta.add(new Persona_v3("Alfredo", "11111111A", 999888777, "uncorreo1@algo.com", LocalDate.parse("2001-08-14")));

        fiesta.add(new Persona_v3("Maria", "22222222B", 111222333, "uncorreo2@algo.com", LocalDate.parse("1980-08-14")));

        fiesta.add(new Persona_v3("Rodrigo", "33333333C", 444555666, "uncorreo3@algo.com", LocalDate.parse("1999-08-14")));

        fiesta.add(new Persona_v3("Julian", "44444444D", 777555333, "uncorreo4@algo.com", LocalDate.parse("1987-08-14")));

        fiesta.add(new Persona_v3("Sabela", "55555555E", 999555111, "uncorreo5@algo.com", LocalDate.parse("1997-08-14")));

        
        // Valores almacenados - Ordenados por Email

        ComparaEmail compEmail = new ComparaEmail();

        Collections.sort(fiesta, compEmail);

        System.out.println("--- Valores Almacenados - Ordenados por Email ---");

        for (Persona_v3 persona : fiesta) {
            
            System.out.println(persona.toString());

        }


        // Valores almacenados - Ordenados por Edad

        ComparaEdad compEdad = new ComparaEdad();

        Collections.sort(fiesta, compEdad);

        System.out.println("--- Valores Almacenados - Ordenados por Edad ---");

        for (Persona_v3 persona : fiesta) {
            
            System.out.println(persona.toString());

        }

    }
    
}
