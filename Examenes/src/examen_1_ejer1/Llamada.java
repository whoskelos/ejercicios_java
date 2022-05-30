package examen_1_ejer1;

/**
 *
 * @author Kelvin
 */
public abstract class Llamada {

    //atributos
    protected int numOrigen;
    protected int numDestino;
    protected int duracion; //en segundos

    public Llamada(int numOrigen, int numDestino, int duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
    }

    public int getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(int numOrigen) {
        this.numOrigen = numOrigen;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public abstract double coste_total();

    @Override
    public String toString() {
        return "Llamada{" + "numOrigen=" + numOrigen + ", numDestino="
                + numDestino + ", duracion=" + duracion + '}';
    }

}
