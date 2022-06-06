package examen_2_ejer2;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class OperacionesAnimales implements Serializable {

    ArrayList<Animal> animales = new ArrayList<>();

    public boolean addPerro(Perro perro) {
        for (Animal animal : animales) {
            if (perro.equals(animal)) {
                return false;
            }
        }
        animales.add(perro);
        return true;
    }

    public boolean addGato(Gato gato) {
        for (Animal animal : animales) {
            if (gato.equals(animal)) {
                return false;
            }
        }
        animales.add(gato);
        return true;
    }

    public void guardarAnimales(String fichero) {
        try {
            //creamos fichero
            FileOutputStream fos = new FileOutputStream(fichero);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //guardamos objetos
            oos.writeObject(animales);
            
            //cerramos fichero
            oos.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existente: " +ex.getMessage());
        } catch (IOException ex){
            System.out.println("Error: " +ex.getMessage());
        }

    }

    public void leerAnimales(String fichero) {
        
        try {
            //leemos objetos del fichero
            FileInputStream fis = new FileInputStream(fichero);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            //almacenamos los objetos recuperados en un arraylist
            ArrayList <Animal> animales_guardados = (ArrayList<Animal>)ois.readObject();
            
            //recorremos el arraylist para mostrar los animales almacenados
            for (Animal animal_guardado : animales_guardados) {
                System.out.println(animal_guardado);
            }
            
            //cerramos fichero
            ois.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existente: " +ex.getMessage());
        } catch (IOException ex){
            System.out.println("Error: " +ex.getMessage());
        } catch (ClassNotFoundException ex){
            System.out.println("Error: " +ex.getMessage());
        }
        
    }
}
