public class Cine {


// Campos de la clase:

    private String nombre;
    private int aforo;
    private Sala[] salas;



    public Cine(String nombre, int aforo, Sala[] salas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.salas = salas;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }



    public void setAforo(int aforo) {
        this.aforo = aforo;
    }


    public int getAforo() {
        return aforo;
    }



    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }


    public Sala[] getSalas() {
        return salas;
    }




    public void verSalas() {

        for(Sala sala : salas) {

            System.out.println("Sala " + sala.getNumI() + ": Pelicula: " + sala.getTitulo().getTitulo() + "\nDuración: " + sala.getTitulo().getDuracion()+" min.\n");

        }
        System.out.println("Aforo del cine: "+ aforo +". Público hoy: " + Sala.getPublico()+".");
    }








    public void mostrarPlanoAsientos(int numSala) {

        if(numSala >= 1 && numSala <= salas.length) {

            Sala sala = salas[numSala-1];
            sala.planoAsientos();

        }else {

            System.out.println("Sala no encontrada.");
        }

    }






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