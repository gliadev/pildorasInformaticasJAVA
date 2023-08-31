package Ejercicios.Arrays;

public class AleatoriosArray {
    public static void main(String[] args) {
        System.out.println("En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las posiciones\n " +
                "un nº aleatorio entre 1 y 100. El programa debe imprimir en consola todos los valores almacenados en el array.\n " +
                "Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() de la clase Math).\n");

        int numeros[] = new int[100];

        for (int i = 0; i < 100; i++){
            numeros[i] = (int) (Math.random()*100);
        }

        for (int elementos:numeros){
            System.out.println(elementos);

        }
    }
}
