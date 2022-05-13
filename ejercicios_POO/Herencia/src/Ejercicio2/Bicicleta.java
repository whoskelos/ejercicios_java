package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Bicicleta {

    protected int velocidadActual;
    protected int platoActual;
    protected int pinyonActual;

    public Bicicleta(int velocidadActual, int platoActual, int pinyonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinyonActual = pinyonActual;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public int getPinyonActual() {
        return pinyonActual;
    }
    
    public void acelerar() {
        this.velocidadActual++;
    }

    public void frenar() {
        this.velocidadActual--;
    }

    public void cambiarPlato(int plato) {
        this.platoActual = plato;
    }

    public void cambiarPinyon(int pinyon) {
        this.pinyonActual = pinyon;
    }

    @Override
    public String toString() {
        return "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pinyonActual=" + pinyonActual;
    }
    
    
    
    

}
