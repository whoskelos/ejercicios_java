package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class AguaMineral extends Bebida {

    //atributos
    private String origen;
    
    //método constructor
    public AguaMineral(String origen, int litros, double precio, String marca) {
        super(litros, precio, marca);
        this.origen = origen;
    }
    
    //setters y getters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "AguaMineral: " + super.toString() + " origen=" + origen;
    }

}
