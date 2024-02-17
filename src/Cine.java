
/**
 * Esta clase define el objeto Cine.
 * @author: Miguel de Nóbrega
 */

public class Cine {


// Campos de la clase:

    private String nombre;
    private int aforo;
    private Sala[] salas;


    /**
     * Constructor para el objeto Cine.
     * @param nombre El parámetro nombre define el nombre que tendrá el cine.
     * @param aforo El parámetro aforo define la capacidad del cine.
     * @param salas El parámetro salas, creado desde la clase Sala, para seleccionar las salas que tenga el cine.
     */
    public Cine(String nombre, int aforo, Sala[] salas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = salas;
    }
// Cierre del constructor.


    /**
     * nombre será el nombre que tenga el cine.
     * @param nombre es un String.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Retornará el nombre actual que se le haya puesto al cine.
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * aforo será la capacidad máxima permitida de personas en el cine
     * @param aforo será un int (no menor que 0).
     */
    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    /**
     *
     * @return Retornará el numero que se le haya puesto al aforo al crear el cine.
     */
    public int getAforo() {
        return aforo;
    }


    /**
     * Para usar el objeto creado en la clase Sala
     * @param salas
     */
    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    /**
     *
     * @return Retorna las salas creadas para el cine.
     */
    public Sala[] getSalas() {
        return salas;
    }


    /**
     * Método creado para ver todas las diferentes salas creadas del cine,
     * el nombre de la pelicula que se esté reproduciendo, la duracion en minutos.
     * También el aforo del cine y el público actual.
     */
    public void verSalas() {

        for(Sala sala : salas) {

            System.out.println("Sala " + sala.getNumI() + ": Pelicula: " + sala.getTitulo().getTitulo() + "\nDuración: " + sala.getTitulo().getDuracion()+" min.\n");

        }
        System.out.println("Aforo del cine: "+ aforo +". Público hoy: " + Sala.getPublico()+".");
    }


    /**
     * Método creado para mostrar la matriz de las butacas según la sala seleccionada.
     * @param numSala Será un int (tiene que estar dentro del rango mayor igual a 1 y
     *  que sea menor o igual al numero de salas creadas).
     */

    public void mostrarPlanoAsientos(int numSala) {

        if(numSala >= 1 && numSala <= salas.length) {

            Sala sala = salas[numSala-1];
            sala.planoAsientos();

        }else {

            System.out.println("Sala no encontrada.");
        }

    }


    /**
     * Método creado para comprar entrada. Se usa el método de reservaEntrada creado en la clase Sala.
     * @param numSala int para seleccionar el número de sala. (Se verifica que la sala exista).
     * @param fila int para seleccionar la fila en la que quieras tu asiento.
     * @param columna int para seleccionar la columna en la que quieras tu asiento.
     * @param correo String para rellenar el hueco de la matriz con el correo del cliente.
     */

// Método para Comprar entrada ( Se usa el método del objeto Sala ).


    public void comprarEntrada(int numSala, int fila, int columna, String correo) {

        if(numSala >= 1 && numSala <= salas.length) {


            Sala sala = salas[numSala-1];

            sala.reservaEntrada(fila, columna, correo);
            sala.planoAsientos();
        }else {
            System.out.println("Sala no encontrada.");
        }

    }



}
