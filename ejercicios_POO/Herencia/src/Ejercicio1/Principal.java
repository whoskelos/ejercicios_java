
package Ejercicio1;

/**
 *
 * @author Kelvin
 */
public class Principal {
    public static void main(String[] args) {
        Alumno unAlumno = new Alumno("Kelvin","Guerrero",1999);
        Persona vecino = new Persona("Jose","Rodríguez",1979);
        
        unAlumno.ponGrupo("Primero", 'M');
        unAlumno.imprimeGrupo();
        System.out.println("");
        vecino.imprime();
    }
}
