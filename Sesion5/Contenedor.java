package Sesion5;
public class Contenedor {
    private int id;
    private String origen;
    private double peso;

    public Contenedor(int id, String origen, double peso) {
        this.id = id;
        this.origen = origen;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Contenedor [id=" + id + ", origen=" + origen + ", peso=" + peso + "]";
    }

}
