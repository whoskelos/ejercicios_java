
package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kelvin
 */
public class Ejercicio_fichero_2 {
    public static void main(String[] args) {
        
        String contenido = "";
        int c;
        
        try {
            FileReader fr = new FileReader("holamundo.txt");
            c=fr.read();
            while (c!=-1) {
                contenido += (char)c;
                c=fr.read();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " +ex.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " +e.getMessage());
        }
        
        System.out.println("El contenido del fichero es: " +contenido);
    }
    
}
