package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static int indiceGanador(Atleta corredores[]) {
        float tiempo;
        int indice = 0;

        tiempo = corredores[0].getTiempoCarrera();

        for (int i = 1; i < corredores.length; i++) {
            if (corredores[i].getTiempoCarrera() < tiempo) {
                tiempo = corredores[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //variables necesarias para rellenar los objetos de tipo atleta
        String nombre;
        int numAtleta,ganador;
        float tiempoCarrera;

        //guardamos el numero de corredores que hay
        int numCorredores;
        System.out.println("Indique el numero de corredores");
        numCorredores = entrada.nextInt();

        //creamos array de corredores
        Atleta corredores[] = new Atleta[numCorredores];

        for (int i = 0; i < corredores.length; i++) {
            entrada.nextLine();
            System.out.println("Rellene datos del corredor " + (i + 1) + ": ");
            System.out.print("Introduzca NºAtleta: ");
            numAtleta = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca nombre del Atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Introduca tiempo realizado en la carrera: ");
            tiempoCarrera = entrada.nextFloat();

            //relleno objeto con los datos introducidos
            corredores[i] = new Atleta(numAtleta, nombre, tiempoCarrera);

            System.out.println("Datos añadidos correctamente");

        }
        ganador = indiceGanador(corredores);
        System.out.println("\nEl corredor más rápido es: ");
        System.out.println(corredores[ganador].mostrarGanador());

    }
}
