package examen_1_ejer3;

/*
3o.- Crear la clase Punto, cuyos atributos son:
int coordX, int coordY, double distOrigen
y que tendrá los constructores y métodos necesarios para el buen funcionamiento 
de dicha clase. La fórmula para calcular la distancia al origen es:
distOrigen= √coordX2 + coordY2 Posteriormente, añadir a dicha clase lo 
siguiente:
a) Un método estático de nombre almacenarPuntosEnArchivo que guarde en un 
fichero serializable los diferentes puntos que se crearan a partir de los 
valores almacenados en el fichero binario puntos.bin. La estructura del fichero binario es:
valorX int , valorY int que se corresponden a las coordenadas de los puntos
El método recibirá por parámetro el nombre de ambos ficheros. Se debe tener 
en cuenta que cada vez que se llame al método los puntos se deben añadir al 
fichero, sin perder los que ya se tengan previamente.
b) Añadir otro método estático, de nombre obtenerArrayListDeArchivo, 
que reciba por parámetro el nombre del archivo que contiene los objetos de 
la clase Punto y devuelva un ArrayList con los datos de dicho archivo..
Finalmente, hacer la clase principal que compruebe funcionamiento de los 
métodos de los dos apartados anteriores.
 */
/**
 *
 * @author Kelvin
 */
public class Punto {

    private int coordX, coordY;
    private double distOrigen;

    public Punto(int coordX, int coordY, double distOrigen) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.distOrigen = distOrigen;
    }

    public Punto() {
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public double getDistOrigen() {
        return distOrigen;
    }

    public void setDistOrigen(double distOrigen) {
        this.distOrigen = distOrigen;
    }

    @Override
    public String toString() {
        return "Punto{" + "coordX=" + coordX + ", coordY=" + coordY 
                + ", distOrigen=" + distOrigen + '}';
    }
    
    

    public static void almacenarPuntosEnArchivo(String ficheroNuevo, 
            String ficheroPuntos) {
        
    }
}
