package com.parque;

public class Dinosaurio {
    private String nombre;
    private String especie;
    private boolean hambriento;

    // Constructor
    public Dinosaurio(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambriento = true;
    }

    // Alimentar al dinosaurio
    public void alimentar() {
        this.hambriento = false;
        System.out.println(nombre + " ha sido alimentado.");
    }

    // Ver si tiene hambre
    public boolean estaHambriento() {
        return hambriento;
    }

    // Obtener nombre
    public String getNombre() {
        return nombre;
    }

    // Mostrar información del dinosaurio
    public String toString() {
        return nombre + " (" + especie + ") - " + (hambriento ? " Hambriento" : " Feliz");
    }
}
