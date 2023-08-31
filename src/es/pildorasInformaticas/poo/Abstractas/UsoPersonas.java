package es.pildorasInformaticas.poo.Abstractas;

import java.util.Arrays;
import java.util.Date;

public class UsoPersonas {
    public static void main(String[] args) {

        // comento esto para hacer un array de personas
        /*
        Empleados empleado1 = new Empleados("Adolfo", new Date(43323223), 2500 );


        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getDescripcion());


        Jefes jefe1 = new Jefes("Adolfo", new Date(24353), 2500);
        jefe1.setCargo("Solucionador de problemas");
        System.out.println(jefe1.getNombre());
        System.out.println();
        System.out.println(jefe1.getDescripcion() + jefe1.getCargo());

        Alumnos alumnos1 = new Alumnos("Pepito", "Dibujo", "Aula 6");
        System.out.println(alumnos1.getNombre());
        System.out.println(alumnos1.getDescripcion());
        System.out.println();


        Jefes jefe2 = new Jefes("Idurre", new Date(76673), 4600);
        jefe2.setCargo("Jefezo");
        System.out.println(jefe2.getNombre());
        System.out.println();
        System.out.println(jefe2.getDescripcion() + jefe2.getCargo());
         */


        Empleados losEmpleados[] = new Empleados[5];

        losEmpleados[0] = new Empleados("Adolfo", new Date(343245), 2500);
        losEmpleados[1] = new Empleados("Idurre", new Date(343245), 1589);
        losEmpleados[2] = new Empleados("Haizea", new Date(343245), 544);
        losEmpleados[3] = new Empleados("Oiñatz", new Date(343245), 544456);
        losEmpleados[4] = new Empleados("Patata", new Date(343245), 44346);

        Arrays.sort(losEmpleados);

        for (Empleados empleado: losEmpleados) {
            System.out.println(empleado.getDescripcion());
        }


        Jefes Jefes1 = new Jefes("Patatin", new Date(4454), 5000);
        Empleados Empleados1 = new Empleados("Pataton", new Date(3343), 3000);

        System.out.println("El trabajador " + Jefes1.getNombre() + " Tiene un bonus de " + Jefes1.setBonus(500));

        System.out.println("El trabajador " + Empleados1.getNombre() + " Tiene un bonus de " + Empleados1.setBonus(500));







    }
}
