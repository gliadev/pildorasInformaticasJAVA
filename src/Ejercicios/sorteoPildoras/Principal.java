package Ejercicios.sorteoPildoras;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        // generar numero aleatorio de 20 digitos
        Random random = new Random();
        BigInteger numeroCuentaAleatorio = new BigInteger(80, random).abs();
        BigInteger diezElevadoA19 = BigInteger.TEN.pow(19);
        numeroCuentaAleatorio = numeroCuentaAleatorio.mod(diezElevadoA19);
        numeroCuentaAleatorio = numeroCuentaAleatorio.nextProbablePrime();
        System.out.println("Número aleatorio de 20 dígitos positivo: " + numeroCuentaAleatorio);

    }
}
