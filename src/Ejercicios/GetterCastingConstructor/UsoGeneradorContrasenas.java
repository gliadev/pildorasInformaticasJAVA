package Ejercicios.GetterCastingConstructor;

import javax.swing.*;

public class UsoGeneradorContrasenas {
    public static void main(String[] args) {
        // Solicitar al usuario el tamaño del array y la longitud de las contraseñas
        int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del Array: "));
        int longitudContrasena = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de las contraseñas: "));

        // Crear un array de objetos GeneradorContrasenas con el tamaño especificado por el usuario
        GeneradorContrasenas[] contrasenas = new GeneradorContrasenas[tamanoArray];

        // Generar contraseñas y almacenarlas en el array
        for (int i = 0; i < tamanoArray; i++) {
            contrasenas[i] = new GeneradorContrasenas(longitudContrasena);
        }

        // Mostrar información de cada contraseña generada
        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Contraseña #" + (i + 1));
            System.out.println("Contraseña: " + contrasenas[i].getContrasena());
            System.out.println("Longitud: " + contrasenas[i].getLongitud());
            System.out.println("Segura: " + (contrasenas[i].esSegura() ? "Sí" : "No"));
            System.out.println();
        }
    }

}
