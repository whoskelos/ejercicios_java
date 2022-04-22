package ejercicio_4;

/**
 *
 * @author Kelvin
 */
public class Prueba {

    public static void main(String[] args) {
        Corredor kelvin = new Corredor(80);

        System.out.println(kelvin.toString());

          kelvin.entrenar();
          System.out.println(kelvin.toString());
          kelvin.entrenar();
          System.out.println(kelvin.toString());
          kelvin.entrenar();
          System.out.println(kelvin.toString());
    }
}
