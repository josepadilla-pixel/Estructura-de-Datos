public class EjecutadorCurso {
    public static void main(String[] args) {
        Curso[] c = new Curso[6];
        c[0] = new Curso(20916, "Programacion Orientada Objetos", "Juan Camilo", 30);
        c[1] = new Curso(21190, "Calculo Integral", "Sebastaian Jaime", 25);
        c[2] = new Curso(22886, "Fisica Mecanica", "Luis Alberto", 45);
        c[3] = new Curso(25716, "Humanidades I", "Carmen", 35);
        c[4] = new Curso(27515, "Humanidades II", "Julio", 50);
        c[5] = new Curso(28436, "Ingles I", "Sofia", 45);

        // Total de estudiante

        int totalEstudiantes = 0;
        for (int i = 0; i < c.length; i++) {
            totalEstudiantes += c[i].getCantidaddeestudiantes();
        }
        System.out.println("Total de estudiantes de todos los estudiantes es: " + totalEstudiantes);

    }

}
