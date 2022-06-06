package examen_2_ejer2;

import java.io.Serializable;

public class Perro extends Animal implements Serializable {

    private String color;

    public Perro(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void expresarse() {
        System.out.println("GUAU");
    }

    @Override
    public String claseDeAnimal() {
        return Perro.class.getName();
    }

    @Override
    public String toString() {
        return "Perro: " + super.toString()+  "color= " + color;
    }
    
    

}
