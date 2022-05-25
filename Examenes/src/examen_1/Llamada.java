package examen_1;

import java.io.Serializable;

/*
Desarrollar una aplicación de control de llamadas realizadas en una centralita 
telefónica.
La centralita ira registrando el número de llamadas realizadas así como el 
coste total de todas las llamadas realizadas.
Las llamadas tienen como atributos el número de origen, el número de destino y 
su duración en segundos.
Existen dos tipos de llamadas:
• Llamadas locales que cuestan 15 céntimos el segundo.
• Llamadas provinciales que dependiendo de la franja horaria en la que se 
realicen cuestan: 20 céntimos/sg en franja 1, 25 céntimos/sg en franja 2 y 30 céntimos/sg en franja 3.
Finalmente, desarrollar la clase principal que cree una centralita, y 
registre las llamadas
de distinto tipo que vienen en el fichero de texto “llamadas.txt” y le pida a 
la centralita que muestre por pantalla las llamadas según las vaya registrando, e informe del número
total de llamadas de cada tipo y la facturación total realizada.
 */
/**
 *
 * @author Kelvin
 */
public class Llamada {

    private int num_origen;
    private int num_destino;
    private int duracion;
    private int franja;

    public Llamada(int num_origen, int num_destino, int duracion, int franja) {
        this.num_origen = num_origen;
        this.num_destino = num_destino;
        this.duracion = duracion;
        this.franja = franja;
    }

    public long getNum_origen() {
        return num_origen;
    }

    public long getNum_destino() {
        return num_destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getFranja() {
        return franja;
    }

    @Override
    public String toString() {
        return "Llamada{" + "num_origen=" + num_origen + ", num_destino="
                + num_destino + ", duracion=" + duracion + '}';
    }

}
