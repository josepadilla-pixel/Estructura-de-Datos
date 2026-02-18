public class Curso {
    private int id;
    private String nombredelcurso;
    private String profesor;
    private int cantidaddeestudiantes;

    public Curso(int id, String nombredelcurso, String profesor, int cantidaddeestudiantes) {
        this.id = id;
        this.nombredelcurso = nombredelcurso;
        this.profesor = profesor;
        this.cantidaddeestudiantes = cantidaddeestudiantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombredelcurso() {
        return nombredelcurso;
    }

    public void setNombredelcurso(String nombredelcurso) {
        this.nombredelcurso = nombredelcurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCantidaddeestudiantes() {
        return cantidaddeestudiantes;
    }

    public void setCantidaddeestudiantes(int cantidaddeestudiantes) {
        this.cantidaddeestudiantes = cantidaddeestudiantes;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", nombredelcurso=" + nombredelcurso + ", profesor=" + profesor
                + ", cantidaddeestudiantes=" + cantidaddeestudiantes + "]";
    }

}
