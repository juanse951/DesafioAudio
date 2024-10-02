package com.aluracursos.AppAudio.principal;

import com.aluracursos.AppAudio.modelos.Cancion;
import com.aluracursos.AppAudio.modelos.MisFavoritos;
import com.aluracursos.AppAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        Podcast podcast = new Podcast();
        MisFavoritos favoritos = new MisFavoritos();

        cancion.setTitulo("Forever");
        cancion.setCantante("Kiss");
        cancion.aumentarMeGusta();
        cancion.reproducirCancion();

        podcast.setPresentador("CAfe.tech");
        podcast.setTitulo("El Señor");

        favoritos.adicione(podcast);
        favoritos.adicione(cancion);

        //cancion
        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            cancion.reproducir();
        }
        //podcast
        for (int i = 0; i < 100; i++) {
            podcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            podcast.reproducir();
        }

        System.out.println("Total de reproducciones: " + cancion.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + cancion.getTotalDeMeGusta());

        System.out.println("Total de reproducciones: " + podcast.getTotalDeReproducciones());
        System.out.println("Total de me gusta: " + podcast.getTotalDeMeGusta());

    }

}
