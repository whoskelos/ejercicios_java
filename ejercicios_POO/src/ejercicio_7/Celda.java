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
        this.codigoSeguridad = codigoSeguridad; //de 4 digitos
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

    public boolean abrirCerrarCelda(int codigo) {
        //comprobamos si el código introducido por parámetro es igual al que 
        //le corresponde a la celda
        if (this.codigoSeguridad != codigo) {
            this.estaAbierta = false; //si el codigo esta mal puerta cerrada
            return false;
        } else {
            if (estaAbierta) { //si esta abierta la cierra
                this.estaAbierta = false;
                System.out.println("Puerta cerrada");
            } else { //si esta cerrada la abre
                this.estaAbierta = true;
                System.out.println("Puerta abierta");
            }
            return true;
        }
    }

}
