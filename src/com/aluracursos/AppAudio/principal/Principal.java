package com.aluracursos.AppAudio.principal;

import com.aluracursos.AppAudio.modelos.Cancion;
import com.aluracursos.AppAudio.modelos.MisFavoritos;
import com.aluracursos.AppAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        Podcast podcast = new Podcast();
        MisFavoritos reproducciones = new MisFavoritos();
        MisFavoritos meGustas = new MisFavoritos();

        //cancion
        for (int i = 0; i < 700; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            cancion.reproducir();
        }
        //podcast
        for (int i = 0; i < 1000; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 90000; i++) {
            podcast.reproducir();
        }

        cancion.setTitulo("Forever:");
        cancion.setCantante("Kiss:");
        reproducciones.adicioneReproducciones(cancion);
        System.out.println("Total de reproducciones: " + cancion.getTotalDeReproducciones());
        meGustas.adicioneMeGustas(cancion);
        System.out.println("Total de me gusta: " + cancion.getTotalDeMeGusta());


//        cancion.aumentarMeGusta();
//        cancion.reproducirCancion();

        podcast.setPresentador("CAfe.tech:");
        podcast.setTitulo("El Señor:");
        reproducciones.adicioneReproducciones(podcast);
        System.out.println("Total de reproducciones: " + podcast.getTotalDeReproducciones());
        meGustas.adicioneMeGustas(podcast);
        System.out.println("Total de me gusta: " + podcast.getTotalDeMeGusta());



    }

}
