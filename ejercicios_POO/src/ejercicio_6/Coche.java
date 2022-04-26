package ejercicio_6;

/**
 *
 * @author Kelvin
 */
public class Coche {
    private String color;
    private int velocidad;
    private float tamanyo;
    private Rueda ruedas[];
    private Motor motor;

    public Coche(String color, int velocidad, float tamanyo, Rueda[] ruedas, Motor motor) {
        this.color = color;
        this.velocidad = velocidad;
        this.tamanyo = tamanyo;
        this.ruedas = ruedas;
        this.motor = motor;
    }
    
    public void avanzar(){
        System.out.println(">>");
        motor.inyectarCarburante();
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i].girar();
        }
    }
}
