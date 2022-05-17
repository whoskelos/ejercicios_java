package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Bebida {

    //atributos de la clase
    static int id = 0;
    protected int litros;
    protected double precio;
    protected String marca;

    //método constructor
    public Bebida(int litros, double precio, String marca) {
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
        id++; //por cada nueva bebida se autoincrementa
    }

    //setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "id: " +this.getId()+ " litros= " + litros + ", precio= " + precio + ", marca= " + marca;
    }

}
