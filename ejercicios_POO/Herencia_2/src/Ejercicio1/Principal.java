package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Principal {
    static ArrayList<Producto> productos = new ArrayList<Producto>();
    public static void main(String[] args) {
        Producto producto1 = new Perecedero(1,"Manzana",0.5);
        Producto producto2 = new NoPerecedero("Lata","Garbanzos",1.5);
        Producto producto3 = new Perecedero(3,"Rábanos",0.8);
        Producto producto4 = new NoPerecedero("Embutido","Chorizo",3.5);
        Producto producto5 = new Perecedero(3,"Plátano",1.5);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        
        for (Producto productos : productos) {
            System.out.println(productos.toString());
            System.out.println("");
            System.out.println("Precio total: " + productos.calcular(20));
            System.out.println("");
        }
    }
    


}
