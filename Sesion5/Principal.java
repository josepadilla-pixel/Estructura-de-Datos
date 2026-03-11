package Sesion5;

import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Muelle muelle1 = new Muelle();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        // arreglo de datos
        String[] nombresBuques = {"Evergreen", "Maersk", "MSC", "Cosco", "Hapag-Lloyd", "ONE", "CMA CGM", "HMM", "Zim", "Yang Ming"};
        String[] paisesOrigen = {"China", "Mexico", "USA", "Alemania", "Japón", "Brasil", "España"};

        // 1. Cargar Buques
        for (int i = 0; i < 10; i++) {
            String nombre = nombresBuques[r.nextInt(nombresBuques.length)] + " " + (i + 1);
            int id = 1000 + i;
            muelle1.registrarBuque(new Buque(nombre, id));
        }

        // 2. Cargar Contenedores
        for (int col = 0; col < 10; col++) {
            for (int fila = 0; fila < 10; fila++) {

                int idCont = 5000 + (col * 10 + fila);
                String origen = paisesOrigen[r.nextInt(paisesOrigen.length)];
                double peso = 10.0 + (50.0 - 10.0) * r.nextDouble();

                Contenedor nuevoCont = new Contenedor(idCont, origen, peso);

                muelle1.registrarContenedor(nuevoCont, col);
            }
        }

        System.out.println("\n--- CARGA AUTOMÁTICA COMPLETADA ---");

        // ===== MENU =====

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Mostrar buques registrados");
            System.out.println("2. Mostrar contenedores registrados");
            System.out.println("3. Mostrar peso total");
            System.out.println("4. Mostrar esquema del muelle");
            System.out.println("5. Listar origenes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    muelle1.mostrarBuques();
                    break;

                case 2:
                    muelle1.mostrarContenedores();
                    break;

                case 3:
                    System.out.println("Peso total: " + muelle1.calcularPesoTotal());
                    break;

                case 4:
                    muelle1.mostrarMatriz();
                    break;

                case 5:
                    muelle1.listarOrigenes();
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");

            }

        } while (opcion != 6);

        sc.close();
    }
}

































































































































































































