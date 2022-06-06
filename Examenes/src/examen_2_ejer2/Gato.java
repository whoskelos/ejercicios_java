package examen_2_ejer2;

import java.io.Serializable;

public class Gato extends Animal implements Serializable {

    private String raza;

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void expresarse() {
        System.out.println("MIAU");
    }

    @Override
    public String claseDeAnimal() {
        return Gato.class.getName();
    }

    @Override
    public String toString() {
        return "Gato: " +super.toString()+ "raza= " + raza;
    }
    
    
}
