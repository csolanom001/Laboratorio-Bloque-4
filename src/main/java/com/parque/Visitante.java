package com.parque;

public class Visitante {
    private String nombre;
    private boolean tieneBoleto;

    public Visitante(String nombre) {
        this.nombre = nombre;
        this.tieneBoleto = false;
    }

    public void comprarBoleto() {
        this.tieneBoleto = true;
        System.out.println( nombre + " ha comprado un boleto.");
    }

    public boolean tieneBoleto() {
        return tieneBoleto;
    }

    public String getNombre() {
        return nombre;
    }
}