package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        //declaramos objeto de la clase scanner para recoger la letra
        Scanner teclado = new Scanner(System.in);

        Posicion p1 = new Posicion(0, 0);

        p1.actualPosition();

        //declaramos la variable que va a recoger los movimientos
        char movement;
        System.out.println("Mueva el objeto con: W,S,A,D.\n Para salir presione E");
        movement = teclado.next().toUpperCase().charAt(0); //se obtiene el primer caracter

        while (movement != 'E') {
            switch (movement) {
                case 'W':
                    p1.moveUp();
                    p1.actualPosition();
                    break;
                case 'S':
                    p1.moveDown();
                    p1.actualPosition();
                    break;
                case 'A':
                    p1.moveLeft();
                    p1.actualPosition();
                    break;
                case 'D':
                    p1.moveRight();
                    p1.actualPosition();
                    break;
                default:
                    System.out.println("Movimiento no válido");
            }

            movement = teclado.next().toUpperCase().charAt(0);

        }

    }
}
