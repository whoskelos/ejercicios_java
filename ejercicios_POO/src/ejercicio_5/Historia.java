package ejercicio_5;

/**
 *
 * @author Kelvin
 */
public class Historia {

    public static void main(String[] args) {
        Gato gato = new Gato(true, "Isidoro"); //gato está despierto y se llama isidoro
        Persona persona = new Persona(false, "Pepe"); //persona está dormida y se llama pepe
        
        gato.maulla(persona);

    }

}
