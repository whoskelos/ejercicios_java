package examen_1_ejer1;

/**
 *
 * @author Kelvin
 */
public class LlamadaLocal extends Llamada {

    //constructor
    public LlamadaLocal(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    //métodos
    @Override
    public double coste_total() {
        double precio_llamada = duracion * 15;
        return precio_llamada;
    }

}
