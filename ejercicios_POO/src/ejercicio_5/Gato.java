package ejercicio_5;

/**
 *
 * @author Kelvin
 */
public class Gato {

    private boolean vigilia;
    private String nombre;

    public Gato(boolean vigilia, String nombre) {
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

    public void maulla(Persona persona) {
        System.out.println(this.nombre + ": Miau!");
        persona.oyeMaullido(this);
    }

    public void recibeZapato() {
        this.vigilia = false;
        System.out.println("Gato recibe zapatazo");
    }

}
