package examen_1_ejer1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Llamada> arr_llamadas = new ArrayList<>();
        int nOrigen, nDestino, duracion, franja;

        try {
            //leer fichero
            BufferedReader miBuffer = new BufferedReader(new FileReader("llamadas.txt"));

            String linea = "";

            while ((linea = miBuffer.readLine()) != null) {
                nOrigen = Integer.parseInt(linea.split(",")[0]);
                nDestino = Integer.parseInt(linea.split(",")[1]);
                duracion = Integer.parseInt(linea.split(",")[2]);
                franja = Integer.parseInt(linea.split(",")[3]);

                if (franja == 1 || franja == 2 || franja == 3) {
                    Llamada llamada = new LlamadaProvincial(nOrigen, nDestino, duracion, franja);
                    arr_llamadas.add(llamada);
                } else {
                    Llamada llamada = new LlamadaLocal(nOrigen, nDestino, duracion);
                    arr_llamadas.add(llamada);
                }

            }
            //creo centralita le paso la lista de las llamadas
            Centralita centralita = new Centralita(arr_llamadas);
            centralita.mostrar_informe();
        } catch (Exception ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

}
