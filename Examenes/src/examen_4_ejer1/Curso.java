package examen_4_ejer1;

import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Curso {

    private int codigo;
    private String nombre;
    private ArrayList<Alumno> listaAlumnos;

    public Curso(int codigo, String nombre, ArrayList<Alumno> listaAlumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaAlumnos = listaAlumnos;
    }

    /*
     Matricular: Agrega un alumno, que llegará como parámetro, al curso.
    En un curso no puede haber alumnos repetidos, es decir, 
    NO SE PUEDE matricular a un alumno que ya esté matriculado en dicho curso, 
    al igual que no se podrá borrar un alumno que no esté matriculado.
     */
    public void matricularAlumno(Alumno alumno) {
        if (!listaAlumnos.contains(alumno)) {
            listaAlumnos.add(alumno);
        }
    }

    /*
     Borrar: Borra un alumno, que llegará como parámetro, al curso.
     */
    public void borrarAlumno(Alumno alumno) {
        if (listaAlumnos.contains(alumno)) {
            listaAlumnos.remove(alumno);
        }
    }

    /*
     Inscrito: Devolverá si un alumno se encuentra o no matriculado en el curso.
     */
    public String isInscrito(Alumno alumno) {
        if (listaAlumnos.contains(alumno)) {
            return "El alumno: " + alumno + " está matriculado";
        }
        return "El alumno: " + alumno + " no está matriculado";
    }

    /*
     Mostrar: Muestra el curso con todos los alumnos matriculados junto con su nota.
     */
    
    public void mostrarDatos() {
        System.out.print("Matricula     Nombre      Media");
        for (Alumno alu : listaAlumnos) {
            System.out.println(alu.getnMat()+"      " + alu.getNombre()+""
                    + "     "+alu.getNotaMedia());
        }
    }

}
