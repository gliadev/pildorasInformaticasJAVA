package Ejercicios.GetterCastingConstructor;

import javax.swing.*;

public class UsoGeneradorContrasenas {
    public static void main(String[] args) {
        // Solicitar al usuario el tama�o del array y la longitud de las contrase�as
        int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tama�o del Array: "));
        int longitudContrasena = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de las contrase�as: "));

        // Crear un array de objetos GeneradorContrasenas con el tama�o especificado por el usuario
        GeneradorContrasenas[] contrasenas = new GeneradorContrasenas[tamanoArray];

        // Generar contrase�as y almacenarlas en el array
        for (int i = 0; i < tamanoArray; i++) {
            contrasenas[i] = new GeneradorContrasenas(longitudContrasena);
        }

        // Mostrar informaci�n de cada contrase�a generada
        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Contrase�a #" + (i + 1));
            System.out.println("Contrase�a: " + contrasenas[i].getContrasena());
            System.out.println("Longitud: " + contrasenas[i].getLongitud());
            System.out.println("Segura: " + (contrasenas[i].esSegura() ? "S�" : "No"));
            System.out.println();
        }
    }

}
