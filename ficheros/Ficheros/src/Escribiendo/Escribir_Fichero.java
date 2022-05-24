
package Escribiendo;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Kelvin
 */
public class Escribir_Fichero {
    public static void main(String[] args) {
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir();
    }
    
}

class Escribiendo{
    public void escribir(){
        String frase = "Esto es una prueba de escritura";
        
        try {
            FileWriter escritura = new FileWriter("texto_nuevo.txt");
            
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException ex) {
            System.out.println("Error con el fichero: " +ex.getMessage());
        }
    }
}
