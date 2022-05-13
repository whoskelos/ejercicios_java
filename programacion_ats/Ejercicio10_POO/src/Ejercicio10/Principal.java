package Ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Principal {

    static ArrayList<Persona> personas = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        for (Persona personas : personas) {
            System.out.println(personas.toString());
            System.out.println("");
        }

    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("Escoga una opcion:");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de futbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("Opción: ");
            opcion = entrada.nextInt();

        } while (opcion < 1 || opcion > 6);

        switch (opcion) {
            case 1:
                viajeEquipo();
                break;
            case 2:
                //entrenamiento();
                break;
            case 3:
                //partidoFutbol();
                break;
            case 4:
                //planificarEntrenamiento();
                break;
            case 5:
                //entrevista();
                break;
            case 6:
                //curarLesion();
                break;
        }
    }

    public static void viajeEquipo() {
        String nombre, apellido, posicion, dato, titulacion;
        int dorsal, edad, anyoExp;
        int numFutbolistas, numEntrenadores, numDoctores;
        System.out.println("Rellene datos de los viajeros: ");

        System.out.println("¿Cúantos futbolistas viajan?");
        numFutbolistas = entrada.nextInt();

        for (int i = 0; i < numFutbolistas; i++) {
            entrada.nextLine();
            System.out.println("Rellene nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Rellen apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Rellene edad");
            edad = entrada.nextInt();
            System.out.println("NºDorsal del jugador: ");
            dorsal = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Rellene posicion del jugador: ");
            posicion = entrada.nextLine();

            Persona futbolista = new Futbolista(dorsal, posicion, nombre, apellido, edad);
            personas.add(futbolista);
        }

        entrada.nextLine();

        System.out.println("¿Cuántos entrenadores viajan?");
        numEntrenadores = entrada.nextInt();

        for (int i = 0; i < numEntrenadores; i++) {
            entrada.nextLine();
            System.out.println("Rellene nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Rellene apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Rellene edad");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Estrategia del entrenador: ");
            dato = entrada.nextLine();

            Persona entrenador = new Entrenador(dato, nombre, apellido, edad);
            personas.add(entrenador);

        }

        entrada.nextLine();

        System.out.println("¿Cuántos doctores viajan?");
        numDoctores = entrada.nextInt();

        for (int i = 0; i < numDoctores; i++) {
            entrada.nextLine();
            System.out.println("Rellene nombre: ");
            nombre = entrada.nextLine();
            System.out.println("Rellene apellido: ");
            apellido = entrada.nextLine();
            System.out.println("Rellene edad");
            edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Rellene titulacion: ");
            titulacion = entrada.nextLine();
            System.out.println("Rellene tiempo de experiencia");
            anyoExp = entrada.nextInt();
            
            Persona doctor = new Doctor(titulacion,anyoExp,nombre,apellido,edad);
            personas.add(doctor);
        }

    }

}
