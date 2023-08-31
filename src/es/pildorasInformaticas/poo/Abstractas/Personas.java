package es.pildorasInformaticas.poo.Abstractas;

import java.util.Date;

public abstract class Personas {
    private String nombre;

    public Personas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract String getDescripcion();
}

class Empleados extends Personas implements Comparable, ParaTrabajadores{
    private double sueldo;
    private Date fechaAlta;

    public Empleados(String nombre, Date fechaAlta, double sueldo){
        super(nombre);
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " Tiene un sueldo" +
                " de " + sueldo + " euros" + " y entro a trabajar" +
                " en " + fechaAlta;
    }

    @Override
    public int compareTo(Object o) {
        // casting de objeto a empleados
        Empleados otroEmpleado = (Empleados)o;

        if ( this.sueldo < otroEmpleado.sueldo) return -1;
        if ( this.sueldo > otroEmpleado.sueldo) return 1;
        return 0;
    }

    @Override
    public double setBonus(double gratificacion) {

        return ParaTrabajadores.BONUS + gratificacion;
    }
}

class Jefes extends Empleados implements ParaJefes {
    private double incentivo;
    private String cargo;

    public Jefes(String nombre, Date fechaAlta, double sueldo){
        super(nombre, fechaAlta, sueldo);
    }

    public void setIncentivo(double incentivo){
        this.incentivo = incentivo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String getCargo() {
        return "\nAdem�s tiene el cargo de " + cargo;
    }

    @Override
    public double setBonus(double gratificacion) {
        double prima = 2000;
        return prima + gratificacion + ParaTrabajadores.BONUS;
    }
}

class Alumnos extends Personas {
    // Atributos
    private String a_optativas;
    private String aula;

    // Constructores
    public Alumnos(String nombre, String a_optativas, String aula){
        super(nombre);
        this.aula = aula;
        this.a_optativas = a_optativas;
    }

    // get y set
    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre() +
                " est� en el aula " + aula + " y " +
                "ha escogido la asignatura de " + a_optativas;
    }
}
