package Leyendo_Escribiendo_bytes;

import java.io.*;

/**
 *
 * @author Kelvin
 */
public class Lectura_Escritura {

    public static void main(String[] args) {
        int cont = 0;
        int datos_entrada[] = new int[95585];

        try {

            FileInputStream archivo_lectura = new FileInputStream("foto.jpg");

            boolean final_ar = false;

            while (!final_ar) {

                int byte_entrada = archivo_lectura.read(); //lee byte a byte la imagen

                if (byte_entrada != -1) {
                    datos_entrada[cont] = byte_entrada;
                } else {
                    final_ar = true;  //cambiamos la variable a true para salir del bucle
                }

//                System.out.println(datos_entrada[cont]);
                
                cont++;
            }

            archivo_lectura.close();

        } catch (IOException e) {
            System.out.println("error: " + e);
        }
        System.out.println("NºBytes = " + cont);
        crea_fichero(datos_entrada);
    }
    
    static void crea_fichero(int datos_nuevo_fichero[]){
        
        try{
            
            FileOutputStream fichero_nuevo = new FileOutputStream("copia_foto.jpg");
            
            for (int i = 0; i < datos_nuevo_fichero.length; i++) {
                fichero_nuevo.write(datos_nuevo_fichero[i]);
            }
            
            fichero_nuevo.close();
            
        }catch(IOException e){
            System.out.println("error: " +e);
        }
        
        System.out.println("Imagen creada con éxito");
        
    }

}
