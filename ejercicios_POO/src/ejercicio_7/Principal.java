package ejercicio_7;

/**
 *
 * @author Kelvin
 */
public class Principal {
    public static void main(String[] args) {
        //instancio 4 celdas
        Celda celda[] = new Celda[4];
        celda[0] = new Celda("Celda 1",true,1234);
        celda[1] = new Celda("Celda 2",true,1234);
        celda[2] = new Celda("Celda 3",true,1234);
        celda[3] = new Celda("Celda 4",true,1234);
        
        //instancio a un carcelero llamado Jaime
        Carcelero carcelero = new Carcelero("Jaime",celda);
        
        System.out.println("Ha llegado un prisionero");
        
        //instancio a un prisionero
        Prisionero prisionero = new Prisionero("Bubba",170.5,10);
        
        //el carcelero le asigna una celda al prisionero
        carcelero.asignaCelda(prisionero);
        System.out.println("El prisionero se le asigna la celda: " + prisionero.getCelda());
        //localizamos la celda que tiene asignada el prisionero
        Celda celdaPrisionero = prisionero.getCelda();
        
        //cerramos la celda del prisionero
        celdaPrisionero.abrirCerrarCelda(1234);
        System.out.println("Ponte a pensar " + prisionero.getNombre());
        
        //prisionero se pone a pensar
        System.out.println(prisionero.pensar());
        
        
    }
}
