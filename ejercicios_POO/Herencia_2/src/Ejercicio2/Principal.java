package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        //creo una estanteria
        Expendedora maquina = new Expendedora();
        
        //creo una bebida
        Bebida bebida1 = new Bebida(1, 1.0, "bezoya");
        maquina.agregarBebida(bebida1);
        Bebida bebida2 = new AguaMineral("Manantial",1, 1.0, "bezoya");
        maquina.agregarBebida(bebida2);
        
        
    }
}
