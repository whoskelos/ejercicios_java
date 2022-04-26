package ejercicio_6;

/**
 *
 * @author Kelvin
 */
public class Historia {
    public static void main(String[] args) {
        /*aqui tenemos el motoro*/
        Motor miMotor = new Motor("Gasolina",90);
        
        /*aqui tenemos las ruedas*/
        Rueda[] misRuedas = new Rueda[4];
        misRuedas[0] = new Rueda(19,"Michelin");
        misRuedas[1] = new Rueda(19,"Michelin");
        misRuedas[2] = new Rueda(19,"Michelin");
        misRuedas[3] = new Rueda(19,"Michelin");
        
        /*aqui tenemos el coche*/
        Coche miCoche = new Coche ("azul",150,250,misRuedas,miMotor);
        
        /*comenzamos historia*/
        
        miCoche.avanzar();
    }
    
}
