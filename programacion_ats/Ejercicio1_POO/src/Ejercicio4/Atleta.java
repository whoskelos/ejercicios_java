
package Ejercicio4;

/**
 *
 * @author Kelvin
 */
public class Atleta {
    private int numAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atleta(int numAtleta, String nombre, float tiempoCarrera) {
        this.numAtleta = numAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    public String mostrarGanador(){
        return "NºAtleta: " + this.numAtleta + "\nNombre: " + this.nombre + "\n"
                + "Tiempo: " + this.tiempoCarrera;
    }
    
}
