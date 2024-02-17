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













}