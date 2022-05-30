package examen_1_ejer1;

/**
 *
 * @author Kelvin
 */
public class LlamadaProvincial extends Llamada {

    //atributos
    private int franja;

    //constructor
    public LlamadaProvincial(int numOrigen, int numDestino, int duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
    }

    //métodos
    @Override
    public double coste_total() {
        double precio_llamada = 0;
        switch (franja) {
            case 1:
                precio_llamada = duracion * 20;
                break;
            case 2:
                precio_llamada = duracion * 25;
                break;
            case 3:
                precio_llamada = duracion * 30;
                break;
        }
        return precio_llamada;
    }



}
