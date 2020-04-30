
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e115 {

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
            System.out.println("3 - Mostrar Coches");
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

                        parking.addFirst(matr);

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

                        System.out.println("El coche con matricula " + parking.getFirst() + " se desaparcó con éxito!");
                        
                        parking.removeFirst();

                    }
                    
                    System.out.println("\n");

                break;

                case 3:

                    Iterator <String> iter = parking.descendingIterator();

                    while (iter.hasNext() == true) {

                        System.out.println("Matricula: " + iter.next());
                        
                    }
                    
                    System.out.println("\n");

                break;

            }

        }

    }
    
}
