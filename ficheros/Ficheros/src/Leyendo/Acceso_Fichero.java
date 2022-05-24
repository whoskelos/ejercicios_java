package Leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kelvin
 */
public class Acceso_Fichero {

    public static void main(String[] args) {
        Leer_Fichero accediendo = new Leer_Fichero();

        accediendo.lee();
    }
}

class Leer_Fichero {

    public void lee() {
        try {
            FileReader entrada = new FileReader("texto_nuevo.txt");

            BufferedReader mibuffer = new BufferedReader(entrada);
            String linea = "";

            while (linea != null) {
                linea = mibuffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }

            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("Error: no se ha encontrado el archivo");
        }
    }
}
