package examen_1_ejer3;

import java.io.*;
import java.util.ArrayList;

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
public class Punto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int coordX, coordY;
    private double distOrigen;

    public Punto(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
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
        distOrigen = Math.sqrt(Math.pow(coordX, 2) + Math.pow(coordY, 2));
        return distOrigen;
    }

    public void setDistOrigen(double distOrigen) {
        this.distOrigen = distOrigen;
    }

    @Override
    public String toString() {
        return "Punto{" + "coordX=" + coordX + ", coordY=" + coordY
                + ", distOrigen=" + getDistOrigen() + '}';
    }

    public static void almacenarPuntosEnArchivo(String ficheroNuevo,
            String ficheroPuntos) {
        ArrayList<Punto> listaPuntos = new ArrayList<>();
        Punto punto;
        int x;
        int y;

        /*
        LEEMOS EL FICHERO puntos.bin e instanciamos nuevos puntos
        y los guardamos en un arrayList
         */
        try {
            FileInputStream fis = new FileInputStream(ficheroPuntos);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("X       Y");
            try {
                while (true) {
                    x = dis.readInt();
                    y = dis.readInt();
                    punto = new Punto(x, y);
                    listaPuntos.add(punto);
                    System.out.printf("%-6d%4d\n", x, y);
                }
            } catch (EOFException ex) {
                System.out.println("Final del fichero " + ex.getMessage());
            }
            dis.close();
            fis.close();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        /*
            Hay que leer el ArrayList y escribimos en un nuevo fichero
            serializable los nuevos puntos generados
         */
        try {

            FileOutputStream fos = new FileOutputStream(ficheroNuevo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(listaPuntos);

            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no localizado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }

    public static Punto crearPunto(int x, int y) {
        Punto punto = new Punto(x, y);
        return punto;
    }

    public static ArrayList obtenerArrayListDeArchivo(String fichPuntos) {
        ArrayList<Punto> listaNuevaPuntos = new ArrayList<>();
        /*
            Leemos el fichero nuevo que se genera con el metodo
            almacenarPuntosEnArchivo()
            
         */
        try {
            /*
            Leemos los objetos del fichero
            */
            FileInputStream fis = new FileInputStream(fichPuntos);
            ObjectInputStream ois = new ObjectInputStream(fis);
            /*
            Guardamos en el ArrayList los objetos que obtenemos del
            fichero que hemos leído
            */
            listaNuevaPuntos = (ArrayList<Punto>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no localizado: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listaNuevaPuntos;
    }
}
