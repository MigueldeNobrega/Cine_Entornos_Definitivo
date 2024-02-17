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
