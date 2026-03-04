public class EjecutadorProducto {
    public static void main(String[] args) {

        Producto[] lista = new Producto[6];
        Inventario olimpica = new Inventario(lista);

        Producto p1 = new Producto(1, "jabon", 2500, 10);
        Producto p2 = new Producto(2, "Carne", 3500, 6);
        Producto p3 = new Producto(3, "papa", 1250, 7);
        Producto p4 = new Producto(4, "cocacola", 1000, 6);
        Producto p5 = new Producto(5, "manzana", 1250, 8);
        Producto p6 = new Producto(6, "chocolate", 1100, 10);

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

       olimpica.ordenarPorPrecioDescendente();
       System.out.println("\nProductos ordenados por precio :"); 

       Producto[] listaOrdenada = olimpica.getProductos();

      for (int i = 0; i < 6; i++) {
    System.out.println(listaOrdenada[i]);
}





    } 



  
}



































