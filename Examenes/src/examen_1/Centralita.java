package examen_1;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Centralita {

    private static int num_llamadas = 0;
    private static int llamadas_locales = 0;
    private static int llamadas_franja_1 = 0;
    private static int llamadas_franja_2 = 0;
    private static int llamadas_franja_3 = 0;
    private double facturacion_total;
    private Llamada llamada;

    public Centralita(Llamada llamada) {
        this.llamada = llamada;
        num_llamadas++;

        switch (llamada.getFranja()) {
            case 0:
                llamadas_locales++;
                break;
            case 1:
                llamadas_franja_1++;
                break;
            case 2:
                llamadas_franja_2++;
                break;
            case 3:
                llamadas_franja_3++;
                break;
        }
    }

    /*
    Calculamos el coste de cada llamada registrada
     */
    public double facturacion_total(ArrayList<Llamada> lista) {
        double coste_llamada = 0;
        for (Llamada llamada : lista) {
            switch (llamada.getFranja()) {
                case 0:
                    coste_llamada = llamada.getDuracion() * 15;
                    break;
                case 1:
                    coste_llamada = llamada.getDuracion() * 20;
                    break;
                case 2:
                    coste_llamada = llamada.getDuracion() * 25;
                    break;
                case 3:
                    coste_llamada = llamada.getDuracion() * 30;
                    break;
            }
            facturacion_total += coste_llamada;
        }

        return facturacion_total / 100;
    }

    @Override
    public String toString() {
        return "Centralita{" + "\nllamadas_locales=" + llamadas_locales
                + ", \nllamadas_franja_1=" + llamadas_franja_1
                + ", \nllamadas_franja_2=" + llamadas_franja_2
                + ", \nllamadas_franja_3=" + llamadas_franja_3;
    }

}
