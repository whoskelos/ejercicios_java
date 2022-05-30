package examen_1_ejer3;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Principal {
    
    public static void main(String[] args) {
        Punto ejemplo = new Punto(10,2);
        
//        Punto.almacenarPuntosEnArchivo("puntos_nuevo.bin", "puntos.bin");
        ArrayList lista = Punto.obtenerArrayListDeArchivo("puntos_nuevo.bin");
        
        for (Object punto : lista) {
            System.out.println(punto);
        }
    }
}
