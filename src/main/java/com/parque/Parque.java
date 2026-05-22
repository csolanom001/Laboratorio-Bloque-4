package com.parque;

import java.util.ArrayList;
import java.util.Random;

public class Parque {
    private ArrayList<Dinosaurio> dinosaurios;
    private ArrayList<Visitante> visitantes;
    private double dinero;
    private Random random;

    public Parque() {
        dinosaurios = new ArrayList<>();
        visitantes = new ArrayList<>();
        dinero = 5000.0;
        random = new Random();
    }

    public void registrarDinosaurio(String nombre, String especie) {
        Dinosaurio d = new Dinosaurio(nombre, especie);
        dinosaurios.add(d);
        System.out.println("Dinosaurio registrado: " + nombre);
    }

    public void registrarVisitante(String nombre) {
        Visitante v = new Visitante(nombre);
        visitantes.add(v);
        System.out.println("Visitante registrado: " + nombre);
    }

    public void venderBoleto(String nombreVisitante) {
        for (Visitante v : visitantes) {
            if (v.getNombre().equals(nombreVisitante)) {
                v.comprarBoleto();
                dinero += 50;
                System.out.println("Saldo del parque: $" + dinero);
                return;
            }
        }
        System.out.println("Visitante no encontrado.");
    }

    public void alimentarDinosaurios() {
        for (Dinosaurio d : dinosaurios) {
            if (d.estaHambriento()) {
                d.alimentar();
                dinero -= 10;
            }
        }
        System.out.println(" Alimentación completada. Saldo: $" + dinero);
    }

    public void simularEventoAleatorio() {
        int evento = random.nextInt(3);
        if (evento == 0) {
            System.out.println("¡UN DINOSAURIO ESCAPÓ! El parque pierde $500.");
            dinero -= 500;
        } else if (evento == 1) {
            System.out.println("⚡ ¡APAGÓN MASIVO! Se pierden $200 en reparaciones.");
            dinero -= 200;
        } else {
            System.out.println("¡Todo está tranquilo en el parque!");
        }
        System.out.println("Saldo actual: $" + dinero);
    }

    public void mostrarEstado() {
        System.out.println("\n===  ESTADO DEL PARQUE ===");
        System.out.println("Dinero: $" + dinero);
        System.out.println("Dinosaurios (" + dinosaurios.size() + "):");
        for (Dinosaurio d : dinosaurios) {
            System.out.println("   - " + d);
        }
        System.out.println("Visitantes con boleto:");
        int contador = 0;
        for (Visitante v : visitantes) {
            if (v.tieneBoleto()) {
                System.out.println("   - " + v.getNombre());
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("   (No hay visitantes con boleto)");
        }
    }
}