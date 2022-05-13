package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class BicicletaMontanya extends Bicicleta {

    private int suspension;

    public BicicletaMontanya(int suspension, int velocidadActual, int platoActual, int pinyonActual) {
        super(velocidadActual, platoActual, pinyonActual);
        this.suspension = suspension;
    }

    public void cambiarSuspension(int suspension) {
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "BicicletaMontanya: " +super.toString() + " suspension= " + suspension + '}';
    }
    
    

}
