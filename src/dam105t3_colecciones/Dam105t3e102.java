
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e102 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        String matr = "";

        int maxParking = 10;

        LinkedList <String> parking = new LinkedList<>();

        while (opcion != 4) {
         
            System.out.println("Operaciones Parking");
            System.out.println("");
            System.out.println("1 - Aparcar");
            System.out.println("2 - Desaparcar");
            System.out.println("3 - Mostrar matrículas");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.print("Qué desea realizar? ");
            opcion = teclado.nextInt();

            teclado.nextLine();

            System.out.println("\n");
            
            switch (opcion) {

                case 1:

                    System.out.print("Introduce la matricula del coche: ");
                    matr = teclado.nextLine();

                    if (parking.size() < maxParking) {

                        parking.push(matr);

                        System.out.println("La matricula se almacenó con éxito!");

                    }

                    else {

                        System.out.println("No se ha podido almacenar la matricula");
                        System.out.println("El parking está lleno!!!");

                    }
                
                    System.out.println("\n");

                break;

                case 2:

                    if (parking.isEmpty() == true) {

                        System.out.println("El parking está vacio!!!");

                    }

                    else {

                        System.out.println("El coche con matricula " + parking.peek() + " se desaparcó con éxito!");
                        
                        parking.poll();

                    }
                    
                    System.out.println("\n");

                break;

                case 3:

                    for (int i = 0; i < parking.size(); i++) {

                        int x = i + 1;

                        System.out.println("Matricula: " + parking.get(i) + "; Posición: " + x);
                        
                    }
                    
                    System.out.println("\n");

                break;

            }

        }

    }
    
}
