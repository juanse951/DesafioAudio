import modelos.Canciones;

public class Principal {
    public static void main(String[] args) {

        Canciones cancion = new Canciones();

        cancion.aumentarMeGusta();
        cancion.reproducirCancion();

        System.out.println("Total de me gusta: " + cancion.getMeGusta());
        System.out.println("Total de reproducciones: " + cancion.getTotalDeReproducciones());




    }

}
