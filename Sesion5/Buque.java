package Sesion5;

public class Buque {
    private int id;
    private String nombre;

    public Buque(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Buque [nombre=" + nombre + ", id=" + id + "]";
    }

}
