
package ejercicio_7;

/**
 *
 * @author Kelvin
 */
public class Prisionero {
    private String nombre;
    private double altura;
    private int condena;
    private Celda celda;

    public Prisionero(String nombre, double altura, int condena) {
        this.nombre = nombre;
        this.altura = altura;
        this.condena = condena;
//        this.celda = celda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCondena() {
        return condena;
    }

    public void setCondena(int condena) {
        this.condena = condena;
    }

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }
    
    public String pensar(){
        return "¿Cómo puedo salir de aquí?";
    }
    
    public void heLlegado(Carcelero carcelero){
        
    }
    
}
