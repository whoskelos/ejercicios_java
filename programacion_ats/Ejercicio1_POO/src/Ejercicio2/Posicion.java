package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Posicion {
    //Atributos
    
    private int x; //eje horizontal
    private int y; //eje vertical
    
    //Método constructor

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //Métodos
    
    public void moveUp(){
        this.y++;
        System.out.println("Ha movido hacia arriba");
    }
    
    public void moveDown(){
        this.y--;
        System.out.println("Ha movido hacia abajo");
    }
    
    public void moveLeft(){
        this.x--;
        System.out.println("Ha movido hacia la izquierda");
    }
    
    public void moveRight(){
        this.x++;
        System.out.println("Ha movido hacia la derecha");
    }
    
    public void actualPosition(){
        System.out.println("La posicion actual es: ("+this.x+","+this.y+")");
    }
    
    
    
}
