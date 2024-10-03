package com.aluracursos.AppAudio.modelos;

public class MisFavoritos {

    public void opcionesCancion (Cancion cancion){

    }

    public void adicioneReproducciones(Audio play){
        if(play.getClasificacionReproducciones()  >= 5){
            System.out.println(play.getTitulo() + " Es uno de los favoritos del momento:");
        }else if (play.getClasificacionReproducciones() >= 4) {
            System.out.println(play.getTitulo() + " Gana terreno entre las preferencias del público:");
        } else if (play.getClasificacionReproducciones() >= 3) {
            System.out.println(play.getTitulo() + " Se está volviendo cada vez más popular:");
        } else if (play.getClasificacionReproducciones() >= 2) {
            System.out.println(play.getTitulo() + " Comienza a captar la atención del público:");
        } else if (play.getClasificacionReproducciones() >= 1) {
            System.out.println(play.getTitulo() + " Aún está empezando a ser conocido:");
        } else {
            System.out.println(play.getTitulo() + " Nuevo en la plataforma:");
        }
    }

    public void adicioneMeGustas(Audio likes){
        if(likes.getClasificacionesMeGusta()  >= 5){
            System.out.println(likes.getTitulo() + " ¡Es un éxito total, está arrasando en las redes!:");
        }else if (likes.getClasificacionesMeGusta() >= 4) {
            System.out.println(likes.getTitulo() + " ¡Es un hit en crecimiento, la gente no puede dejar de darle 'like'!:");
        } else if (likes.getClasificacionesMeGusta() >= 3) {
            System.out.println(likes.getTitulo() + " ¡Va tomando vuelo y cada vez más personas lo disfrutan!:");
        } else if (likes.getClasificacionesMeGusta() >= 2) {
            System.out.println(likes.getTitulo() + " ¡Empieza a ganar fans y a generar interés!:");
        } else if (likes.getClasificacionesMeGusta() >= 1) {
            System.out.println(likes.getTitulo() + " ¡Está arrancando, pero necesita más amor!:");
        } else {
            System.out.println(likes.getTitulo() + " Nuevo en la plataforma, dale tu apoyo:");
        }
    }
}
