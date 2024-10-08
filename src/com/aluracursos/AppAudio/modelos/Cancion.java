package com.aluracursos.AppAudio.modelos;

public class Cancion extends Audio{

    private String album;
    private String cantante;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void aumentarMeGusta(){
        meGusta();
    }

    public void reproducirCancion(){
        reproducir();
    }

}
