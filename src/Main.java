
import java.util.Scanner;

import Cine;
import Pelicula;
import Sala;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
/**
 * Se crean las peliculas usando su constructor
 */
        Pelicula pelicula1 = new Pelicula("Oppenheimer",180);
        Pelicula pelicula2 = new Pelicula("Fight Club",139);
        Pelicula pelicula3 = new Pelicula("Shutter Island",138);
        Pelicula pelicula4 = new Pelicula("The Departed",151);

/**
 * Se crean las salas usando su constructor
 */
        Sala sala1 = new Sala(1, pelicula1, 8, 8);
        Sala sala2 = new Sala(2, pelicula2, 6, 8);
        Sala sala3 = new Sala(3, pelicula3, 8, 10);
        Sala sala4 = new Sala(4, pelicula4, 5, 10);
        Sala sala5 = new Sala(5, pelicula1, 5, 8);
        Sala sala6 = new Sala(6, pelicula4, 4, 6);

/**
 * Se crea el cine usando su constructor.
 */
        Cine cine = new Cine("CINESA, Manoteras", 306, new Sala[]{sala1,sala2,sala3,sala4,sala5,sala6});

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

/**
 * Bucle para generar un menú de opciones.
 */


        do {

            System.out.println("\nSeleccione una opción: ");

            System.out.println("1. Ver Salas y la película. "
                    + "\n2. Ver Asientos de las Salas. "
                    + "\n3. Comprar Entrada. "
                    + "\n4. Salir.");

            int op = entrada.nextInt();

            switch(op) {


/**
 * Muestra la información de las salas.
 */
                case 1:
                    cine.verSalas();

                    break;


                /**
                 * Recibe el numero de la sala y muestra la matriz de butacas.
                 */
                case 2:

                    System.out.println("Número de Sala: ");
                    int nSala = entrada.nextInt();
                    cine.mostrarPlanoAsientos(nSala);

                    break;

                /**
                 * Recibe el numero de sala y verifica su existencia.
                 * Luego pide el correo y la posición de las butacas para terminar la compra de la entrada.
                 */
                case 3:

                    System.out.println("Número de Sala: ");
                    int nSalaC = entrada.nextInt();

                    if(nSalaC<1 || nSalaC>cine.getSalas().length) {
                        System.out.println("Sala No encontrada");

                    }else {

                        cine.mostrarPlanoAsientos(nSalaC);
                        System.out.println("Ingresar correo electrónico: ");
                        String correoC=entrada.next();
                        System.out.println("Ingresa Fila y Columna de tu butaca: ");
                        int filaC=entrada.nextInt();
                        int columnaC=entrada.nextInt();

                        cine.comprarEntrada(nSalaC, filaC, columnaC, correoC);
                    }

                    break;

                /**
                 * Sale del bucle del menú de opciones.
                 */
                case 4:

                    System.out.println("Gracias por su visita. Vuelva Pronto!");
                    seguir=false;

                    break;


                default:

                    System.out.println("Error");
                    seguir=false;

                    break;


            }

        }while(seguir);


        entrada.close();


    }

}
