package Sesion5;

public class Muelle {
    private Buque[] buques;
    private Contenedor[][] matriz;
    private int contadorBuques;

    public Muelle() {
        buques = new Buque[10];
        matriz = new Contenedor[10][10];
        contadorBuques = 0;
    }

    public void registrarBuque(Buque buque) {

        if (contadorBuques < buques.length) {
            buques[contadorBuques] = buque;
            contadorBuques++;
            System.out.println("Buque registrado correctamente.");
        } else {
            System.out.println("No hay espacio para más buques.");
        }
    }

    public void registrarContenedor(Contenedor c, int columna) {

        if (columna < 0 || columna >= 10) {
            System.out.println("Columna inválida.");
            return;
        }

        for (int fila = 9; fila >= 0; fila--) {

            if (matriz[fila][columna] == null) {

                if (fila == 9 || matriz[fila + 1][columna] != null) {

                    matriz[fila][columna] = c;
                    System.out.println("Contenedor ubicado correctamente.");
                    return;
                }
            }
        }

        System.out.println("La columna está llena.");
    }

    public double calcularPesoTotal() {

        double total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {
                    total += matriz[i][j].getPeso();
                }
            }
        }

        return total;
    }

    public void listarOrigenes() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] != null) {
                    System.out.println("Origen: " + matriz[i][j].getOrigen());
                }
            }
        }
    }

    public void mostrarMatriz() {

        System.out.println("\nEstado actual del muelle:");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (matriz[i][j] == null) {
                    System.out.print("[ ] ");
                } else {
                    System.out.print("[X] ");
                }
            }
            System.out.println();
        }
    }


public void mostrarBuques() {

    for (int i = 0; i < contadorBuques; i++) {
        System.out.println("Nombre: " + buques[i].getNombre());
        System.out.println("ID: " + buques[i].getId());
        System.out.println("----------------");
    }
} 






public void mostrarContenedores() {

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {

            if (matriz[i][j] != null) {
                System.out.println("ID: " + matriz[i][j].getId());
                System.out.println("Origen: " + matriz[i][j].getOrigen());
                System.out.println("Peso: " + matriz[i][j].getPeso());
                System.out.println("----------------");
            }
        }
    }
}











































}
