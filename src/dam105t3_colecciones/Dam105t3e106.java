
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e106 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        String nom = ""; double sal = 0; int key = 0;

        HashMap <Integer, Jugador> plantilla = new HashMap<>();

        while (opcion != 5) {
         
            System.out.println("Gestión Jugadores");
            System.out.println("");
            System.out.println("1 - Añadir Jugador");
            System.out.println("2 - Eliminar Jugador");
            System.out.println("3 - Consultar Salario Jugador");
            System.out.println("4 - Incrementar Salario");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.print("Qué desea realizar? ");
            opcion = teclado.nextInt();

            teclado.nextLine();

            System.out.println("\n");
            
            switch (opcion) {

                case 1:

                    System.out.print("Introduce el nombre del jugador: ");
                    nom = teclado.nextLine();

                    System.out.print("Introduce el salario del jugador: ");
                    sal = teclado.nextDouble();

                    System.out.print("Introduce la clave del jugador: ");
                    key = teclado.nextInt();

                    plantilla.put(key, new Jugador(nom, sal));

                    System.out.println("Se añadió con éxito el nuevo jugador!");

                    System.out.println("\n");

                break;

                case 2:

                    System.out.print("Introduce la clave del jugador a eliminar: ");
                    key = teclado.nextInt();

                    if (plantilla.containsKey(key) == true) {

                        plantilla.remove(key);

                        System.out.println("Se eliminó con éxito el jugador!");
                        
                    } 
                    
                    else {

                        System.out.println("La clave introducida no existe en la plantilla!");
                        
                    }

                    System.out.println("\n");

                break;

                case 3:

                    System.out.print("Introduce la clave del jugador para consultar el salario: ");
                    key = teclado.nextInt();

                    if (plantilla.containsKey(key) == true) {

                        System.out.println("El salario de " + plantilla.get(key).getNombre() + " es de " + plantilla.get(key).getSalario() + "€");
                        
                    } 
                    
                    else {

                        System.out.println("La clave introducida no existe en la plantilla!");
                        
                    }
                    
                    System.out.println("\n");

                break;

                case 4:

                    System.out.print("Introduce la clave del jugador a incrementar el salario: ");
                    key = teclado.nextInt();

                    if (plantilla.containsKey(key) == true) {

                        plantilla.get(key).incSalario();

                        System.out.println("El salario se incrementó corecctamente!");

                        System.out.println("Nuevo Salario: " + plantilla.get(key).getSalario());
                        
                    } 
                    
                    else {

                        System.out.println("La clave introducida no existe en la plantilla!");
                        
                    }
                    
                    System.out.println("\n");

                break;

            }

        }

    }
    
}
