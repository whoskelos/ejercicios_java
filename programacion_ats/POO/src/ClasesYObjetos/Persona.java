package ClasesYObjetos;

/**
 *
 * @author Kelvin
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    
    //Métodos

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    
    public void correr(){
        System.out.println("Soy " + this.nombre + ", tengo " +this.edad + " "
                + "años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido " + km + " kilometros");
    }
    
    
}
