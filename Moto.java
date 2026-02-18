public class Moto {
    // atributos
    private int modelo;
    private String marca;
    private String color;
    private double cilindarje;
    private double precio;

    public Moto(int modelo, String marca, String color, double cilindarje, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.cilindarje = cilindarje;
        this.precio = precio;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindarje() {
        return cilindarje;
    }

    public void setCilindarje(double cilindarje) {
        this.cilindarje = cilindarje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    } 

    public String realizarunmantenimiento(String mtto){
        return "Mantenimiento realizado fue"+mtto;
    }

    @Override
    public String toString() {
        return "Moto [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", cilindarje=" + cilindarje
                + ", precio=" + precio + "]";
    }

}
