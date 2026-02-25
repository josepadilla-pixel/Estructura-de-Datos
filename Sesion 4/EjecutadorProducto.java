public class EjecutadorProducto {
    public static void main(String[] args) {
        Inventario olimpica = new Inventario(6);
        Producto p1 = new Producto(1, "jabon", 2.50, 10);
        Producto p2 = new Producto(2, "Carne", 3.50, 6);
        Producto p3 = new Producto(3, "papa", 1.25, 7);
        Producto p4 = new Producto(4, "cocacola", 1, 6);
        Producto p5 = new Producto(5, "manzana", 1.25, 8);
        Producto p6 = new Producto(6, "chocolate", 1.10, 10); 
        

        olimpica.agregarProducto(p1);
        olimpica.agregarProducto(p2);
        olimpica.agregarProducto(p3);
        olimpica.agregarProducto(p4);
        olimpica.agregarProducto(p5);
        olimpica.agregarProducto(p6);
        
        System.out.println("Valor total del inventario:");
        System.out.println(olimpica.generarInformeValorTotal());

        System.out.println("\nProductos agotados:");
        Producto[] agotados = olimpica.obtenerProductosAgotados();

        for (int i = 0; i < agotados.length; i++) {
            System.out.println(agotados[i]);

        }

    }
}
