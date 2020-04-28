
package dam105t3_colecciones;

import java.util.*;


public class Dam105t3e107 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        int maxJugador = 25;

        String nom = ""; double sal = 0; int key = 0;

        HashMap <Integer, Jugador> plantilla = new HashMap<>();

        while (opcion != 5) {
         
            System.out.println("Gestión Jugadores");
            System.out.println("");
            System.out.println("1 - Añadir Jugador");
            System.out.println("2 - Eliminar Jugador");
            System.out.println("3 - Listar Jugadores");
            System.out.println("4 - Consultar Jugadores por Salario");
            System.out.println("5 - Salir");
            System.out.println("");
            System.out.print("Qué desea realizar? ");
            opcion = teclado.nextInt();

            teclado.nextLine();

            System.out.println("\n");
            
            switch (opcion) {

                case 1:

                    if(plantilla.size() < maxJugador) {

                        System.out.print("Introduce el nombre del jugador: ");
                        nom = teclado.nextLine();

                        System.out.print("Introduce el salario del jugador: ");
                        sal = teclado.nextDouble();

                        System.out.print("Introduce la clave del jugador: ");
                        key = teclado.nextInt();

                        plantilla.put(key, new Jugador(nom, sal));

                        System.out.println("Se añadió con éxito el nuevo jugador!");

                    }

                    else {

                        System.out.println("La plantilla de jugadores está llena!");

                    }

                    System.out.println("\n");

                break;

                case 2:

                    if (plantilla.isEmpty() == false) {

                        System.out.print("Introduce la clave del jugador a eliminar: ");
                        key = teclado.nextInt();

                        if (plantilla.containsKey(key) == true) {

                            plantilla.remove(key);

                            System.out.println("Se eliminó con éxito el jugador!");
                            
                        } 
                        
                        else {

                            System.out.println("La clave introducida no existe en la plantilla!");
                            
                        }

                    }

                    else {

                        System.out.println("La plantilla de jugadores está vacía!");

                    }

                    System.out.println("\n");

                break;

                case 3:

                    for (Integer clave : plantilla.keySet()) {

                        System.out.println("----- Jugador con Clave " + clave + " -----");

                        System.out.println("Nombre: " + plantilla.get(clave).getNombre());

                        System.out.println("Salario: " + plantilla.get(clave).getSalario());

                        System.out.println("----- ----- ----- ----- -----");
                        
                    }
                    
                    System.out.println("\n");

                break;

                case 4:

                    System.out.print("Introduce el salario del jugador: ");
                    sal = teclado.nextDouble();

                    double maxSal = sal + 6000;

                    double minSal = sal - 6000;

                    for (Integer clave : plantilla.keySet()) {

                        if (plantilla.get(clave).getSalario() >= minSal && plantilla.get(clave).getSalario() <= maxSal) {

                            System.out.println("----- Jugador con Clave " + clave + " -----");

                            System.out.println("Nombre: " + plantilla.get(clave).getNombre());

                            System.out.println("Salario: " + plantilla.get(clave).getSalario());

                            System.out.println("----- ----- ----- ----- -----");

                        }
                        
                    }
                    
                    System.out.println("\n");

                break;

            }

        }

    }
    
}
