package Ejercicio1;

/**
 *
 * @author Kelvin
 */
public class Perecedero extends Producto {

    private int diasACaducar;

    public Perecedero(int diasACaducar, String nombre, double precio) {
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    public int getDiasACaducar() {
        return diasACaducar;
    }

    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    @Override
    public String toString() {
        return "Perecedero: " +super.toString() + " diasACaducar=" + diasACaducar;
    }

    @Override
    public double calcular(int cantidad) {
        double precioFinal = super.calcular(cantidad);
        if (this.diasACaducar == 1) {
            precioFinal = precioFinal - (precioFinal / 4);
            return precioFinal;
        } else if (this.diasACaducar == 2) {
            precioFinal = precioFinal - (precioFinal / 3);
        } else if (this.diasACaducar == 3) {
            return precioFinal /= 2;
        }
        return precioFinal;
    }

}
