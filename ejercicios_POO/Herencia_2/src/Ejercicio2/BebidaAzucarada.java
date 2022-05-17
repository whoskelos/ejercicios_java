package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class BebidaAzucarada extends Bebida {

    //atributos
    private int porcentajeAzucar;
    private boolean promo;

    //método constructor
    public BebidaAzucarada(int porcentajeAzucar, boolean promo, int litros, double precio, String marca) {
        super(litros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promo = promo;
    }

    //getter y setters
    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    @Override
    public double getPrecio() {
        if (promo) {
            this.precio = (this.precio - (this.precio * 10) / 100);
            return precio;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "BebidaAzucarada: " +super.toString()+ "porcentajeAzucar= " 
                + porcentajeAzucar + ", promo= " + promo;
    }
    
    

}
