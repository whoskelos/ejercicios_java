package ejercicio_5;

/**
 *
 * @author Kelvin
 */
public class Persona {

    private boolean vigilia;
    private String nombre;

    public Persona(boolean vigilia, String nombre) {
        this.vigilia = vigilia;
        this.nombre = nombre;
    }

    public boolean isVigilia() {
        return vigilia;
    }

    public void setVigilia(boolean vigilia) {
        this.vigilia = vigilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void oyeMaullido(Gato gato) {
        this.vigilia = true;
        System.out.println(this.nombre +  ": toma zapato");
        gato.recibeZapato();
        this.vigilia = false;
    }

}
