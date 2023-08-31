package Ejercicios.clasesAbstractas;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsoEmpleado {

    public static void main(String[] args) {
        // Crear un array de empleados
        Empleado[] empleados = new Empleado[4];

        // Crear instancias de Empleado y asignar al array
        empleados[0] = new Empleado.EmpleadoAsalariado("6546546Z", "Antonio", "López", new Date(114, 0, 1), 1125, 1);
        empleados[1] = new Empleado.EmpleadoComision("7879879S", "Sandra", "Nieto", new Date(111, 0, 1), 169, 7.10);
        empleados[2] = new Empleado.EmpleadoAsalariado("4654654D", "Manuel", "Ruiz", new Date(110, 0, 1), 950, 13);
        empleados[3] = new Empleado.EmpleadoComision("77879878F", "María", "Ramos", new Date(111, 0, 1), 35, 6.90);

        // Llamar a los métodos
        sueldoMayor(empleados);
        mostrarTodos(empleados);
    }

    public static void sueldoMayor(Empleado[] empleados) {
        Empleado empleadoMayor = empleados[0];
        double salarioMayor = empleadoMayor.getSalario();

        for (int i = 1; i < empleados.length; i++) {
            double salario = empleados[i].getSalario();
            if (salario > salarioMayor) {
                salarioMayor = salario;
                empleadoMayor = empleados[i];
            }
        }

        System.out.println("Empleado con el salario más alto:");
        empleadoMayor.imprimir();
    }

    public static void mostrarTodos(Empleado[] empleados) {
        System.out.println("Datos de todos los empleados:");
        for (Empleado empleado : empleados) {
            empleado.imprimir();
            System.out.println("--------------------------");
        }
    }
}
