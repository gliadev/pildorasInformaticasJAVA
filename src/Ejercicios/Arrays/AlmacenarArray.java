package Ejercicios.Arrays;

import java.util.Scanner;

public class AlmacenarArray {
    public static void main(String[] args) {

        System.out.printf("En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. \n" +
                "Los números introducidos se almacenarán en un array. \n " +
                "El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.\n");

        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int conadorCero = 0;

        System.out.println("Introduce 10 valores");

        for ( int i = 0; i < 10; i++){
            numeros[i] = teclado.nextInt();
        }

        for ( int valores:numeros){
            if (valores < 0 ) contadorNegativos++;
            else if ( valores > 0 ) contadorPositivos++;
            else conadorCero++;
        }

        System.out.println("Dentro del Array tienes un total de " + contadorPositivos + " numeros positivos\n" +
                " y " +  contadorPositivos + " valores negativos  y " + conadorCero + " valores 0 ");


    }
}
