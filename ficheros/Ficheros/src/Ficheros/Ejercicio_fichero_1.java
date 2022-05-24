
package Ficheros;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kelvin
 */
public class Ejercicio_fichero_1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("holamundo.txt");
            fw.write("\nHola mundo");
            
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error: " +ex.getMessage());
        }
    }
}
