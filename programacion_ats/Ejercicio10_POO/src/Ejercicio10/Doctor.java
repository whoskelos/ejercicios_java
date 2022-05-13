package Ejercicio10;

/**
 *
 * @author Kelvin
 */
public class Doctor extends Persona {

    private String titulo;
    private int anyoExp;

    public Doctor(String titulo, int anyoExp, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.anyoExp = anyoExp;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnyoExp() {
        return anyoExp;
    }

    @Override
    public String toString() {
        return "Doctor: " + super.toString() + " titulo=" + titulo + ", anyoExp=" + anyoExp + '}';
    }

}
