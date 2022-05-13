package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class BicicletaTandem extends Bicicleta {

    private int numAsientos;

    public BicicletaTandem(int numAsientos, int velocidadActual, int platoActual, int pinyonActual) {
        super(velocidadActual, platoActual, pinyonActual);
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "BicicletaTandem: " +super.toString() + " numAsientos= " + numAsientos;
    }
    
    

}
