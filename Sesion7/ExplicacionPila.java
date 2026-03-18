package Sesion7;

import java.util.Stack;

public class ExplicacionPila {
    public static void main(String[] args) {
        // creacion de pila
        Stack<String> objpila = new Stack<>();

        // Ingresar el elementos a la pila
        objpila.push("Camilo");
        objpila.push("Daniela");
        objpila.push("Francisco");
        objpila.push("Anadrea");
        objpila.push("Dario");

        // Mostrar objetos de la pila
        System.out.println(objpila);

        // Mostrar sin remover el tope de la pila
        System.out.println("Tope de la pila:  " + objpila.peek());// Dario

        // validar si la pilla esta llena o vacia
        System.out.println("Pila vacia:  " + objpila.empty()); // false

        // eliminar un elemento de la pila
        System.out.println("Elemento removido:  " + objpila.pop()); // Dario

        // posiciones de los elementos respecto al tope de la pila
        System.out.println("Posicion: " + objpila.search("Camilo"));// 4
        System.out.println("Posicion: " + objpila.search("Daniela"));// 3
        System.out.println("Posicion: " + objpila.search("Francisco"));// 2
        System.out.println("Posicion: " + objpila.search("Andrea"));// 1

    }
}
