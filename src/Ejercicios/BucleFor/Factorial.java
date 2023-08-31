package Ejercicios.BucleFor;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("En este ejercicio, se pide el c�lculo del factorial de un n�mero introducido por el usuario desde\n" +
                "una ventana JOptionPane. El factorial de un n�mero es igual a ese n�mero multiplicado por\n" +
                "todos los que le preceden. Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.\n");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));

        long factorial = numero;

        for ( int i = numero - 1; i > 0; i--){
            factorial = factorial * i;
        }
        System.out.println("El factorial del numero " + numero + " es: " + factorial);
    }
}
