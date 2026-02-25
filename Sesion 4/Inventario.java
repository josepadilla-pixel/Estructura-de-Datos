

public class Inventario {

    private Producto[] productos;
    private int contador;

    public Inventario(int capacidad) {
        productos = new Producto[capacidad];
        contador = 0;
    } 

    public void agregarProducto(Producto p) {
        if (contador < productos.length) {
            productos[contador++] = p;
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public Producto buscarPorId(int id) {
        for (int i = 0; i < contador; i++) {
            if (productos[i].getId() == id) {
                return productos[i];
            }
        }
        return null;
    }

    public void actualizarStock(int id, int nuevaCantidad) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setCantidadStock(nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public double generarInformeValorTotal() {
        double total = 0;

        for (int i = 0; i < contador; i++) {
            total += productos[i].getPrecio() * productos[i].getCantidadStock();
        }

        return total;
    }

    public Producto[] obtenerProductosAgotados() {

        int cantidadAgotados = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                cantidadAgotados++;
            }
        }

        Producto[] agotados = new Producto[cantidadAgotados];

        int j = 0;

        for (int i = 0; i < contador; i++) {
            if (productos[i].getCantidadStock() < 5) {
                agotados[j++] = productos[i];
            }
        }

        return agotados;
    }
}
