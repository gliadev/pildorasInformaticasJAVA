package Ejercicios.Arrays;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        System.out.println("En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.\n " +
                "Los números se almacenarán en un array y el programa calculará la media de los números introducidos\n " +
                "en las posiciones pares del array. (Debes utilizar el operador módulo “%”).\n");

        Scanner teclado = new Scanner(System.in);

        int media = 0;
        int pares = 0;
        int numeros[] = new int[10];

        System.out.println("Introduce 10 valores ");

        for (int i = 0; i < 10; i++){
            numeros[i] = teclado.nextInt();
        }

        for (int z = 0; z < 10; z++){
            if ( z % 2 == 0 && z != 0 ){
                pares++;
                media = media + numeros[z];
            }
        }
        System.out.println("La mediade las posiciones pares del array son " + media / pares);
    }
}
