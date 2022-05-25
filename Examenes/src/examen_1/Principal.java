package examen_1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        Centralita central = null;
        ArrayList<Llamada> arr_llamadas = new ArrayList<Llamada>();
        /*
        Fichero a leer
         */
        File fichero = new File("llamadas.txt");
        Scanner entrada = null;

        /*
        Leo datos del fichero
         */
        try {
            entrada = new Scanner(fichero);
            //leo linea a linea el fichero
            while (entrada.hasNextLine()) {
                String[] datos_llamada = entrada.nextLine().split(",");
                int num_origen = Integer.parseInt(datos_llamada[0]);
                int num_destino = Integer.parseInt(datos_llamada[1]);
                int duracion = Integer.parseInt(datos_llamada[2]);
                int franja = Integer.parseInt(datos_llamada[3]);
                Llamada llamada = new Llamada(num_origen, num_destino, duracion, franja);
                arr_llamadas.add(llamada);
            }
            entrada.close();

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        for (int i = 0; i < arr_llamadas.size(); i++) {
            central = new Centralita(arr_llamadas.get(i));
            System.out.println(arr_llamadas.get(i).toString());
        }
        System.out.println(central.toString());
        System.out.println("Facturación total: " + central.facturacion_total(arr_llamadas) + "€");
    }

}
