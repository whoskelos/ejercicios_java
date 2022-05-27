package examen_1_ejer1;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Centralita {

    //atributos
    private ArrayList<Llamada> llamadas;
    private double costeTotal;

    //constructor
    public Centralita(ArrayList<Llamada> llamada) {
        this.llamadas = llamada;
    }

    //métodos
    public void mostrar_informe() {
        double facturacion_total = 0;
        for (Llamada llamada : llamadas) {
//            facturacion_total += llamada.coste_total();
        }
        System.out.println(facturacion_total/100);

    }

}
