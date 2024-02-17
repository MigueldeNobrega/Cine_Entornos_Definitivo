/**
 * Esta clase define el objeto Sala
 * @author: Miguel de Nóbrega
 */

public class Sala {

// Campos de la clase:

    private int numI;
    private Pelicula titulo;
    private String [][] butacas;
    private static int publico;


    /**
     * Constructor para el objeto Sala.
     * @param numI El parámetro numI define el numero identificativo que tendrá la sala.
     * @param titulo El parámetro titulo creado en la clase Pelicula define el nombre de la pelicula que va reproducir la sala.
     * @param filas El parámetro filas define el numero de filas que tendra la sala para las butacas.
     * @param columnas El parámetro columnas define el numero de columnas que tendra la sala para las butacas.
     */
    public Sala(int numI, Pelicula titulo, int filas, int columnas) {
        this.numI = numI;
        this.titulo = titulo;
        this.butacas = new String[filas][columnas];
    }
// Cierre del constructor.


    /**
     * numI es el numero que identifica la sala.
     * @param numI es un int (lo mejor sería que fueran numeros consecutivos para seguir el orden de las salas)
     */
    public void setNumI(int numI) {
        this.numI = numI;
    }


    /**
     * @return Retornará el numero identificativo que se le haya puesto a la sala.
     */
    public int getNumI() {
        return numI;
    }


    /**
     * titulo es el nombre de la pelicula que se va reproducir en la sala. Viene de la clase pelicula.
     * @param titulo es un String
     */
    public void setTitulo(Pelicula titulo) {
        this.titulo = titulo;
    }


    /**
     * @return Retornará el titulo de la pelicula que se le haya puesto a la sala.
     */
    public Pelicula getTitulo() {
        return titulo;
    }


    /**
     * butacas es la matriz creada para los asientos la sala, siendo la dimensión las filas y columnas usadas para crear la sala.
     * @param butacas es una matriz [][] de int.
     */
    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }


    /**
     *
     * @return Retornará la matriz creada para la sala por las filas x columnas.
     */
    public String[][] getButacas() {
        return butacas;
    }


    /**
     * publico es un contador de +1 para cada vez que se reserve una entrada. Para saber la cantidad de personas que hay en el cine.
     * @param publico es un int (no debe ser menor que 0, ni mayor al aforo utilizado para crear el cine)
     */
    public void setPublico(int publico) {
        Sala.publico = publico;
    }


    /**
     *
     * @return Retornará el valor actual del contador de entradas reservadas.
     */
    public static int getPublico() {
        return publico;
    }



    /**
     *Método para pintar la matriz de las butacas. Saldrá una X si está ocupada y una O si está libre.
     */

    public void planoAsientos() {

        for(int i=0; i<butacas.length; i++) {
            for(int j=0; j<butacas[i].length; j++) {

                if(butacas[i][j]==null) {
                    System.out.printf("%3s","O");
                }else {
                    System.out.printf("%3s","X");
                }
            }
            System.out.println();
        }

    }

    /**
     * Método que reserva una entrada (según la posición de la matriz).
     * Verifica también si las filas y columnas son válidas. Y si la butaca está ocupada o no.
     * @param fila Será un int que define el primer valor de la matriz butacas[][], es decir el número de filas.
     * @param columna Será un int que define el segundo valor de la matriz butacas[][], es decir el número de columnas.
     * @param correo Será un String que guarde el correo electrónico del cliente y lo guarde en la posición de la matriz donde reserve la entrada.
     */

    public void reservaEntrada(int fila, int columna, String correo) {

        if((fila >0 && fila <= butacas.length) && (columna >0 && columna <= butacas[0].length)) {

            if(butacas[fila-1][columna-1]==null) {

                butacas[fila-1][columna-1]=correo;

                System.out.println("Entrada reservada con éxito.");
                setPublico(getPublico()+1);
            }else {

                System.out.println("Butaca ocupada. Seleccione otra.");
            }

        }else {
            System.out.println("Fila o Columna no válida.");
        }


    }




}
