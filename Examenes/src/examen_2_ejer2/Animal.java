package examen_2_ejer2;

public abstract class Animal{
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void expresarse();
    public abstract String claseDeAnimal();

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", edad= " + edad;
    }
    
    

}
