package Ejercicio10;

/**
 *
 * @author Kelvin
 */
public class Futbolista extends Persona {

    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Futbolista: " + super.toString() + " dorsal=" + dorsal + ", posicion=" + posicion + '}';
    }

}
