package ejercicio_7;

/**
 *
 * @author Kelvin
 */
public class Celda {
    private String nombre;
    private boolean estaAbierta;
    private int codigoSeguridad;

    public Celda(String nombre, boolean estaAbierta, int codigoSeguridad) {
        this.nombre = nombre;
        this.estaAbierta = estaAbierta;
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    public void abrirCerrarCelda(int codigo){
        
    }
    
}
