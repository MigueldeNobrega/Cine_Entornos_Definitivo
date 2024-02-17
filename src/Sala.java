public class Sala {

// Campos de la clase:

    private int numI;
    private Pelicula titulo;
    private String [][] butacas;
    private static int publico;



    public Sala(int numI, Pelicula titulo, int filas, int columnas) {
        this.numI = numI;
        this.titulo = titulo;
        this.butacas = new String[filas][columnas];
    }




    public void setNumI(int numI) {
        this.numI = numI;
    }


    public int getNumI() {
        return numI;
    }



    public void setTitulo(Pelicula titulo) {
        this.titulo = titulo;
    }



    public Pelicula getTitulo() {
        return titulo;
    }



    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }



    public String[][] getButacas() {
        return butacas;
    }



    public void setPublico(int publico) {
        Sala.publico = publico;
    }



    public static int getPublico() {
        return publico;
    }









}
