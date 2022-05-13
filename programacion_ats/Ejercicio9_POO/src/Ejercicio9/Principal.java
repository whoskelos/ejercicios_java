package Ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //llenar un poligono
        llenarPoligono();

        //mostrar los datos y el area de cada poligono
        mostrarResultados();

    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion;

        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion:");
                opcion = entrada.nextInt();

            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo(); //llenar un triangulo
                    break;
                case 2:
                    llenarRectangulo(); //llenar un rectangulo
                    break;
            }

            System.out.print("\nDesea introducir otro poligono(s/n)");
            respuesta = entrada.next().charAt(0);
            System.out.println("");

        } while (respuesta == 's' || respuesta == 'S');

    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.println("Digite el lado1 del triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado2 del triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado3 del triangulo");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        //guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligono.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.println("Digite el lado1 del rectangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado2 del rectangulo");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);

        //guardamos un rectangulo dentro de nuestro arreglo de poligonos
        poligono.add(rectangulo);
    }

    public static void mostrarResultados() {
        //Recorriendo el arreglo de poligonos
        for (Poligono poli : poligono) {
            System.out.println(poli.toString());
            System.out.println("Area= " + poli.area());
            System.out.println("");
        }
    }

}
