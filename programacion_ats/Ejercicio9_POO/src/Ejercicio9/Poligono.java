package Ejercicio9;

/**
 *
 * @author Kelvin
 */
public abstract class Poligono {

    protected int numerLados;

    public Poligono(int numerLados) {
        this.numerLados = numerLados;
    }

    public int getNumerLados() {
        return numerLados;
    }

    @Override
    public String toString() {
        return "Numero Lados= " + numerLados;
    }

    public abstract double area();

}
