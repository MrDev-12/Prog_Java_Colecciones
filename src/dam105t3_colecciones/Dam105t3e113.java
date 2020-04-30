package dam105t3_colecciones;

import java.util.*;

public class Dam105t3e113 {

    static Scanner teclado;
    static Random random;
    static final int HORAS = 8;
    static LinkedList<Integer> cola;
    static LinkedList<Integer> cola2;
    static int instanteSiguCliente;
    static int t;

    static int atendidos = 0;
    static int noAtendidos = 0;

    //la cola contiene los minutos que va a requerir la atención del cajero
    //cuando le toque. Al primero de la cola se le va reduciendo en cada instante.

    public static void main(String[] args) {

        teclado = new Scanner(System.in);

        random = new Random();

        cola = new LinkedList<>();

        cola2 = new LinkedList<>();

        instanteSiguCliente = random.nextInt(5) + 3;

        //un bucle simula los minutos que van pasando

        for (t = 1; t <= HORAS * 60; t++) {

            if (!cola.isEmpty()) {

                //reducir el tiempo de atencion del primero de la lista
                //que es el que está siendo atendido

                cola.set(0, cola.getFirst() - 1);

                //si ese tiempo es cero, acabó de atenderlo. Sale de la cola

                if (cola.getFirst() == 0) {

                    cola.removeFirst();

                    atendidos++;

                }

            }

            if (!cola2.isEmpty()) {

                //reducir el tiempo de atencion del primero de la lista
                //que es el que está siendo atendido

                cola2.set(0, cola2.getFirst() - 1);

                //si ese tiempo es cero, acabó de atenderlo. Sale de la cola

                if (cola2.getFirst() == 0) {

                    cola2.removeFirst();

                    atendidos++;

                }

            }

            //se añade un nuevo cliente a a la lista (instante aleatorio)

            if (t == instanteSiguCliente) {

                if (cola.size() < 5 || cola2.size() < 5) {

                    if (cola.size() < cola2.size()) {

                        cola.addLast(random.nextInt(11) + 3);

                    }

                    else {

                        cola2.addLast(random.nextInt(11) + 3);

                    }

                }

                else {

                    noAtendidos++;

                }

                //se genera el instante de llegada del próximo cliente

                instanteSiguCliente += random.nextInt(5) + 3;

            }

        }

        mostrarResultado();
        
    }

    static void mostrarResultado() {

        System.out.println("Clientes Atendidos: " + atendidos);

        System.out.println("Clientes no Atendidos: " + noAtendidos);

    }

}
