
package ejercicio_7;

/**
 *
 * @author Kelvin
 */
public class Carcelero {
    private String nombre;
    private Celda celdas[];

    public Carcelero(String nombre, Celda[] celdas) {
        this.nombre = nombre;
        this.celdas = celdas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celda[] getCeldas() {
        return celdas;
    }

    public void setCeldas(Celda[] celdas) {
        this.celdas = celdas;
    }
    
    //este metodo asigna una celda al prisionero que pasamos por parametro
    public void asignaCelda(Prisionero prisionero){
        prisionero.setCelda(elegirCelda());
        
    }
    
    //este metodo elige una celda aleatoria entre todas las celdas que se creen
    private Celda elegirCelda(){
        Celda celda;
        int numeroCelda;
        numeroCelda = (int)(Math.random()*celdas.length);
        celda = celdas[numeroCelda];
        return celda;
    }
    
}
