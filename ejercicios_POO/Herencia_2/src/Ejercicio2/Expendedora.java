package Ejercicio2;

/**
 *
 * @author Kelvin
 */
public class Expendedora {

    private Bebida[][] estanteria;
    private int fila;
    private int columna;

    //metodo constructor
    public Expendedora() {
        this.estanteria = new Bebida[5][5];
    }

    public Expendedora(int fila, int columna) {
        this.estanteria = new Bebida[columna][fila];
    }

    //agrega una bebida que recibe como argumento en la primera posicion
    //libre, si el identificador está repetido en alguno de las bebidas,
    //no se agregará esa bebida
    public void agregarBebida(Bebida bebida) {
        
    }
    
//    public void mostrarBebidas(){
//        for (int i = 0; i < estanteria.length; i++) {
//            for (int j = 0; j < estanteria[i].length; j++) {
//                System.out.println(estanteria[i][j].toString());
//            }
//        }
//    }

}
