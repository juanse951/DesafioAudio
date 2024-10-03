package com.aluracursos.AppAudio.modelos;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalDeReproducciones;
    private int totalDeMeGusta;
    private int clasificacionReproducciones;
    private int clasificacionesMeGusta;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacionesMeGusta() {
        if(getTotalDeMeGusta() >= 1000){
            return 5;
        } else if (getTotalDeMeGusta() >= 800){
            return 4;
        } else if (getTotalDeMeGusta() >= 600){
            return 3;
        } else if (getTotalDeMeGusta() >= 400) {
            return 2;
        } else if(getTotalDeMeGusta() >= 200) {
            return 1;
        } else if(getTotalDeMeGusta() < 200){
            return 0;
        }else {
            return 0;
        }
    }

    public void setClasificacionesMeGusta(int clasificacionesMeGusta) {
        this.clasificacionesMeGusta = clasificacionesMeGusta;
    }

    public int getClasificacionReproducciones() {
        if(getTotalDeReproducciones() >= 10000){
            return 5;
        } else if (getTotalDeReproducciones() >= 8000){
            return 4;
        } else if (getTotalDeReproducciones() >= 6000){
            return 3;
        } else if (getTotalDeReproducciones() >= 4000) {
            return 2;
        } else if(getTotalDeReproducciones() >= 2000) {
            return 1;
        } else if(getTotalDeReproducciones() < 2000){
            return 0;
        }else {
            return 0;
        }
    }

    public void setClasificacionReproducciones(int clasificacionReproducciones) {
        this.clasificacionReproducciones = clasificacionReproducciones;
    }

    public void meGusta(){
        this.totalDeMeGusta++;
    }

    public void reproducir(){
        this.totalDeReproducciones++;
    }

}
