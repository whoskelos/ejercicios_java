package ejercicio_4;

/**
 *
 * @author Kelvin
 */
public class Corredor {

    private int energia;

    public Corredor(int energia) {
        this.energia = verificarEnergia(energia);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int verificarEnergia(int energia) {
        if (energia < 0) {
            System.out.println("Energia no válida");
            return 0;
        } else if (energia > 100) {
            return 100;
        } else {
            return energia;
        }
    }

    public void recargarEnergia(int energia) {
        if (this.energia < 100) {
            this.energia += energia;
        } else {
            System.out.println("Ha llegado al máximo de energia");
        }
    }

    public void correr() {
        if (energiaAgotada()) {
            System.out.println("Se ha llegado al mínimo de energía " + this.energia);
        } else {
            this.energia -= 10;
        }
    }

    public boolean energiaAgotada() {
        if (this.energia < 10) {
            this.energia = 0;
            return true;
        } else {
            return false;
        }
    }

    public void entrenar() {
        if (this.energia < 100) {
            this.energia += 15;
            if (this.energia >= 100) {
                this.energia = 100;
            }
        }
    }

    @Override
    public String toString() {
        return "Corredor{" + "energia=" + energia + '}';
    }

}
