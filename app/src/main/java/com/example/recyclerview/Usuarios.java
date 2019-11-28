package com.example.recyclerview;

public class Usuarios {

    //private int id;
    private String nombre;
    private String altaprot;
    private String image;

    public Usuarios(/*int id,*/ String nombre, String altaprot, String image) {
        //this.id = id;
        this.nombre = nombre;
        this.altaprot = altaprot;
        this.image = image;
    }

/*
    public int getId() {
        return id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public String getAltaprot() {
        return altaprot;
    }

    public String getImage() {
        return image;
    }
}
