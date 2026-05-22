package com.parque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parque parque = new Parque();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== PARQUE DE DINOSAURIOS ===");
            System.out.println("1. Registrar dinosaurio");
            System.out.println("2. Registrar visitante");
            System.out.println("3. Vender boleto");
            System.out.println("4. Alimentar dinosaurios");
            System.out.println("5. Simular evento aleatorio");
            System.out.println("6. Mostrar estado del parque");
            System.out.println("7. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del dinosaurio: ");
                    String nombreDino = scanner.nextLine();
                    System.out.print("Especie: ");
                    String especie = scanner.nextLine();
                    parque.registrarDinosaurio(nombreDino, especie);
                    break;

                case 2:
                    System.out.print("Nombre del visitante: ");
                    String nombreVisitante = scanner.nextLine();
                    parque.registrarVisitante(nombreVisitante);
                    break;

                case 3:
                    System.out.print("Nombre del visitante: ");
                    String nombreVenta = scanner.nextLine();
                    parque.venderBoleto(nombreVenta);
                    break;

                case 4:
                    parque.alimentarDinosaurios();
                    break;

                case 5:
                    parque.simularEventoAleatorio();
                    break;

                case 6:
                    parque.mostrarEstado();
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}