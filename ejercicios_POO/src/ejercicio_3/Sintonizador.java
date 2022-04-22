package ejercicio_3;

/**
 *
 * @author Kelvin
 */
public class Sintonizador {

    private int frecuncia = 80;

    public Sintonizador() {
    }

    public int getFrecuncia() {
        return frecuncia;
    }

    public void setFrecuncia(int frecuncia) {
        this.frecuncia = frecuncia;
    }

    public void subirFrecuencia() {
        if (this.frecuncia > 108) {
            this.frecuncia = 80;
        }else {
            this.frecuncia += 5;
        }

    }

    public void bajarFrecuencia() {
        if (this.frecuncia < 80) {
            this.frecuncia = 108;
        }else{
            this.frecuncia -= 5;
        }
    }

}
