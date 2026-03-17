package sesion6;

import java.util.Random;

public class ejecutadorSuministro {

    public static void main(String[] args) {

        Random r = new Random();

        int[] energiaContenedor = new int[12];

        int max = 150;
        int min = 50;

        // Paso 1: Generar energías
        for (int i = 0; i < 12; i++) {
            energiaContenedor[i] = r.nextInt(max - min + 1) + min;
        }

        System.out.println("=== Energias generadas ===");
        for (int i = 0; i < energiaContenedor.length; i++) {
            System.out.print(energiaContenedor[i] + " ");
        }

        // Filtrar múltiplos de 10
        int[] filtrados = new int[12];
        int c = 0;

        for (int i = 0; i < energiaContenedor.length; i++) {
            if (energiaContenedor[i] % 10 == 0) {
                filtrados[c] = energiaContenedor[i];
                c++;
            }
        }

        System.out.println("\n\n=== Multiplos de 10 ===");
        for (int i = 0; i < c; i++) {
            System.out.print(filtrados[i] + " ");
        }

        // Paso 2: Llenar matriz
        int[][] mapaCarga = new int[3][3];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (k < c) {
                    mapaCarga[i][j] = filtrados[k];
                    k++;
                } else {
                    mapaCarga[i][j] = -1;
                }
            }
        }

        System.out.println("\n\n=== Mapa de Carga (Matriz 3x3) ===");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mapaCarga[i][j] + "\t");
            }
            System.out.println();
        }

        // Paso 3: Crear objetos
        Suministro[] manifiesto = new Suministro[9];
        int posicion = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int energia = mapaCarga[i][j];

                if (energia != -1) {

                    String prioridad;

                    if (energia > 100) {
                        prioridad = "ALTA";
                    } else {
                        prioridad = "ESTANDAR";
                    }

                    String id = "C-" + i + "-" + j;
                    manifiesto[posicion] = new Suministro(id, energia, prioridad);

                } else {
                    manifiesto[posicion] = null;
                }

                posicion++;
            }
        }

        System.out.println("\n=== Manifiesto de Suministros ===");
        for (int i = 0; i < manifiesto.length; i++) {
            System.out.println(manifiesto[i]);
        }
    }
}
