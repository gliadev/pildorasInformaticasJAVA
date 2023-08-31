package Ejercicios.clasesAbstractas;

import java.util.Date;

public abstract class Empleado {

    // atributos Empleado
    protected String DNI;
    protected String nombre;
    protected String apellidos;
    protected Date anioAlta;

    // constructor por defecto
    public Empleado() {
    }

    // constructor con parametros
    public Empleado(String DNI, String nombre, String apellidos, Date anioAlta) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioAlta = anioAlta;
    }

    // metodos
    public void imprimir() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("Sus apellidos son: " + apellidos);
        System.out.println("Está dado de alta en la empresa desde: " + (anioAlta.getYear() + 1900));
        System.out.println("Su salario es: " + getSalario() + " Euros");
    }

    // get y set
    public abstract double getSalario();

    // clase EmpleadoAsalariado extendida de Empleado
    static class EmpleadoAsalariado extends Empleado {

        // Atributos
        private double salarioBase;
        private int aniosEmpresa;

        // constructores
        public EmpleadoAsalariado() {
        }

        public EmpleadoAsalariado(String DNI, String nombre, String apellidos,
                                  Date anioAlta, double salarioBase,
                                  int aniosEmpresa) {
            super(DNI, nombre, apellidos, anioAlta);
            this.salarioBase = salarioBase;
            this.aniosEmpresa = aniosEmpresa;
        }

        // metodos

        // get y set
        @Override
        public double getSalario() {
            if (aniosEmpresa < 2) {
                return salarioBase;
            } else if (aniosEmpresa >= 2 && aniosEmpresa <= 3) {
                return salarioBase * 1.07;
            } else if (aniosEmpresa >= 4 && aniosEmpresa <= 8) {
                return salarioBase * 1.11;
            } else if (aniosEmpresa >= 9 && aniosEmpresa <= 15) {
                return salarioBase * 1.17;
            }
            return 0; // por si falla para saber donde
        }
    }

    static class EmpleadoComision extends Empleado {
        // como el salario base sabemos cual es lo pongo como final
        private static final double SALARIOBASE = 950;

        // atributos
        private int clientesCaptados;
        private double comisionPorCliente;

        // constructor por defecto
        public EmpleadoComision() {
        }

        // constructor con parametros
        public EmpleadoComision(String DNI, String nombre, String apellidos, Date anioAlta, int clientesCaptados, double comisionPorCliente) {
            super(DNI, nombre, apellidos, anioAlta);
            this.clientesCaptados = clientesCaptados;
            this.comisionPorCliente = comisionPorCliente;
        }

        // metodos

        // get y set
        @Override
        public double getSalario() {
            double salario = clientesCaptados * comisionPorCliente;
            return salario < SALARIOBASE ? SALARIOBASE : salario;
        }
    }
}
