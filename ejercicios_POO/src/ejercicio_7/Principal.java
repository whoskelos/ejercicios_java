package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //instancio 4 celdas
        Celda celda[] = new Celda[4];
        celda[0] = new Celda("Celda 1", true, 1234);
        celda[1] = new Celda("Celda 2", true, 1234);
        celda[2] = new Celda("Celda 3", true, 1234);
        celda[3] = new Celda("Celda 4", true, 1234);

        //instancio a un carcelero llamado Jaime
        Carcelero carcelero = new Carcelero("Jaime", celda);

        System.out.println("Ha llegado un prisionero");

        //instancio a un prisionero
        Prisionero prisionero = new Prisionero("Bubba", 170.5, 10);

        //el carcelero le asigna una celda al prisionero
        carcelero.asignaCelda(prisionero);
        //localizamos la celda que tiene asignada el prisionero
        Celda celdaPrisionero = prisionero.getCelda();
        
        //pedimos codigo para cerrar la celda
        System.out.println("Ingrese código de la celda");
        int codigo = entrada.nextInt();

        //cerramos la celda del prisionero
        if (celdaPrisionero.abrirCerrarCelda(codigo) == false) {
            System.out.println("El código de la celda es incorrecto");
        } else {
            System.out.println("Ponte a pensar " + prisionero.getNombre());

            //prisionero se pone a pensar
            System.out.println("Bubba piensa:" + prisionero.pensar());

            //muestro info del prisionero
            System.out.print("Datos del prisionero: ");
            System.out.print(prisionero.toString());

        }

    }
}
