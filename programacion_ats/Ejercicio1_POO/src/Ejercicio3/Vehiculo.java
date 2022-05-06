package Ejercicio3;

/**
 *
 * @author Kelvin
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    //Constructor

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return " Marca: " + this.marca+"\n Modelo: " + this.modelo + "\n Precio: $"
                + this.precio +"";
    }
}
