
package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Principal {
    public static void main(String[] args) {
        Bicicleta bici1 = new BicicletaMontanya(1,3,2,5);
        Bicicleta bici2 = new BicicletaTandem(3,4,3,4);
        
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
        
        bici1.acelerar();
        bici1.cambiarPinyon(7);
        bici2.cambiarPlato(1);
        bici2.frenar();
        System.out.println("");
        System.out.println(bici1.toString());
        System.out.println(bici2.toString());
    }
}
