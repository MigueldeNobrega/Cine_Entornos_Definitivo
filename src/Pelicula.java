
/**
 * Esta clase define el objeto Pelicula
 * @author: Miguel de Nóbrega
 */

public class Pelicula {

// Campos de la clase:

    private String titulo;
    private int duracion;


    /**
     * Constructor para el objeto pelicula.
     * @param titulo El parámetro titulo define el nombre que va tener la pelicula.
     * @param duracion El parámetro duración define el tiempo (en minutos) con numeros enteros que va tener la pelicula.
     */

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
// Cierre del constructor.



    /**
     * Titulo es el nombre que se usará para crear la pelicula.
     * @param titulo es un String.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    /**
     * @return Retornará el titulo actual que se le haya puesto a la pelicula.
     */
    public String getTitulo() {
        return titulo;
    }


    /**
     * Duracion es la duracion en minutos que se le haya puesto a la pelicula.
     * @param duracion es un int (al ser una pelicula debería ser mayor que 60 (min)).
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    /**
     *
     * @return Retornará la duración actual (en minutos) que se le haya puesto a la pelicula.
     */
    public int getDuracion() {
        return duracion;
    }


}





