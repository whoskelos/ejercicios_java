package examen_4_ejer1;

/**
 *
 * @author Kelvin
 */
public class Alumno {

    private int nMat;
    private int codigoCurso;
    private String nombre;
    private double notaMedia;

    public Alumno(int nMat, int codigoCurso, String nombre, double notaMedia) {
        this.nMat = nMat;
        this.codigoCurso = codigoCurso;
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public int getnMat() {
        return nMat;
    }

    public int getCodigo() {
        return codigoCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    /*
     MostrarUno: Muestra la información de un alumno en concreto.
     */
    public void mostrarUno(Alumno alumno) {
        System.out.println("Alumno: " + "Número matrícula=" + alumno.getnMat()
                + ", Código del curso=" + alumno.getCodigo()
                + ", nombre=" + alumno.getNombre() + ", notaMedia=" + alumno.getNotaMedia());
    }

    /*
    MostrarTodos: Muestra todos los alumnos de un curso en concreto, que llegará
    como parámetro.
     */
    public void mostrarTodos(int codCurso) {
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "Matrícula= " + nMat + ", Código curso= " + codigoCurso
                + ", nombre= " + nombre + ", notaMedia= " + notaMedia + '}';
    }

}
