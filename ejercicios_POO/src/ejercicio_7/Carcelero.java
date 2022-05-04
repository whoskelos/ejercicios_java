
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
    
    public void asignaCelda(Prisionero prisionero){
        
    }
    
//    private Celda elegirCelda(){
//        return ;
//    }
    
}
