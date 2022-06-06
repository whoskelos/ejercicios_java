package examen_2_ejer2;

import java.io.*;

/**
 *
 * @author Kelvin
 */
public class Principal {

    public static void main(String[] args) {
        
        /*
        Añado los animales que leo del fichero dado
        */

        //leo fichero animales.txt
        try {
            FileReader fichero = new FileReader("animales.txt");
            BufferedReader br = new BufferedReader(fichero);
            String animal;

            while ((animal = br.readLine()) != null) {
                animal = br.readLine();
                String tipo = animal.split(" ")[0];
                String nombre = animal.split(" ")[1];
                int edad = Integer.parseInt(animal.split(" ")[2]);
                String color_raza = animal.split(" ")[3];
                if (tipo.equals("P")) {
                    Animal perro = new Perro(nombre, edad, color_raza);
                } else if (tipo.equals("G")) {
                    Animal gato = new Gato(nombre, edad, color_raza);
                }
            }
            br.close();


        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existente");
        } catch (IOException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
        /*
        Instancio objeto de la clase OperacionAnimales para probar métodos
        */
        
        OperacionesAnimales op = new OperacionesAnimales();
        //creo animales para añadirlos a través de los métodos
        Perro perro1 = new Perro("Tobi",2,"blanco");
        Gato gato1 = new Gato("Michi",1,"Persia");
        
//        op.addGato(gato1);
//        op.addPerro(perro1);
        
        
        op.leerAnimales("nuevos_animales.bin");
        

    }
}
