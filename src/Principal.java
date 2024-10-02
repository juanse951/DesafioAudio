import com.aluracursos.AppAudio.modelos.Cancion;

public class Principal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();

        cancion.aumentarMeGusta();
        cancion.reproducirCancion();

        System.out.println("Total de me gusta: " + cancion.getTotalDeMeGusta());
        System.out.println("Total de reproducciones: " + cancion.getTotalDeReproducciones());




    }

}
