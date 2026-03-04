
public class Inventario {

    private Producto[] productos;
    private int contador = 0;

    public Inventario(Producto[] productos) {
        this.productos = productos;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
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
        System.out.println("No se encontró el producto");
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

    public void ordenarPorPrecioDescendente() {

        for (int i = 0; i < contador - 1; i++) {

            for (int j = 0; j < contador - 1 - i; j++) {

                if (productos[j].getPrecio() < productos[j + 1].getPrecio()) {

                    Producto temp = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j + 1] = temp;
                }
            }
        }
    }

}
