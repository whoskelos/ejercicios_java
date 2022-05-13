package Ejercicio10;

/**
 *
 * @author Kelvin
 */
public class Entrenador extends Persona {

    private String dato;

    public Entrenador(String dato, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "Entrenador: " + super.toString() + " dato=" + dato + '}';
    }

}
