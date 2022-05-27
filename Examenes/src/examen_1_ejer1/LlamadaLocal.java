package examen_1_ejer1;

/**
 *
 * @author Kelvin
 */
public class LlamadaLocal extends Llamada {

    //atributos
    private static int totalLlamadasL = 0;

    //constructor
    public LlamadaLocal(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
        totalLlamadasL++;
    }

    //métodos
    @Override
    public double coste_total() {
        double precio_llamada = duracion * 15;
        return precio_llamada;
    }
}
