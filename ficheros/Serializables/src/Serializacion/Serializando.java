package Serializacion;

import java.util.*;
import java.io.*;

/**
 *
 * @author Kelvin
 */
public class Serializando {
    public static void main(String[] args) {
        Administrador jefe = new Administrador("Juan",80000,2005,12,15);
        
        jefe.setIncentivo(5000);
        
        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana",25000,2008,10,1);
        personal[2] = new Empleado("Luis",18000,2012,9,15);
        
        try{
            /*
            ESCRIBIMOS LOS OBJETOS EN UN FICHERO
            */
            ObjectOutputStream escribiendo_fichero = 
                    new ObjectOutputStream(new FileOutputStream("empleado.dat"));
            
            escribiendo_fichero.writeObject(personal);
            
            escribiendo_fichero.close();
            
            /*
            LEEMOS LOS OBJETOS DE UN FICHERO
            */
            
            ObjectInputStream leyendo_fichero = new ObjectInputStream(new FileInputStream("empleado.dat"));
            
            Empleado[] personal_recuperado = (Empleado[]) leyendo_fichero.readObject();
            
            leyendo_fichero.close();
            
            for (Empleado empleado : personal_recuperado) {
                System.out.println(empleado);
            }
            
        }catch(Exception e){
            System.out.println("error: " +e);
        }
    }

}

class Empleado implements Serializable {

    private String nombre;
    private double sueldo;
    private int agno;
    private int mes;
    private int dia;
    private Date fechaContrato;

    public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        this.fechaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public void subirSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;

        this.sueldo += aumento;
    }

    @Override
    public String toString() {
        return "Empleado: " + "nombre= " + nombre + ", sueldo= " + sueldo
                + ", fechaContrato= " + fechaContrato;
    }

}

class Administrador extends Empleado {

    private double incentivo;

    public Administrador(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre, sueldo, agno, mes, dia);

        this.incentivo = 0;
    }

    public double getSueldo() {
        double sueldoBase = super.getSueldo();
        
        return sueldoBase + incentivo;
    }
    
    public void setIncentivo(double b){
        this.incentivo = b;
    }

    @Override
    public String toString() {
        return "Administrador - " +super.toString() + " incentivo= " + incentivo;
    }
    
    
    
    
    

}
