package Ejercicios.GetterCastingConstructor;

import java.util.Random;

public class GeneradorContrasenas {
    private String contrasena; // Almacena la contrase�a generada
    private int longitud; // Almacena la longitud de la contrase�a

    public GeneradorContrasenas(int longitud) {
        this.longitud = longitud;
        generarContrasena(); // Llama al m�todo para generar la contrase�a
    }

    public String getContrasena() {
        return contrasena; // Devuelve la contrase�a generada
    }

    public int getLongitud() {
        return longitud; // Devuelve la longitud de la contrase�a
    }

    private void generarContrasena() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int opcion = random.nextInt(3); // 0: letra may�scula, 1: letra min�scula, 2: n�mero

            switch (opcion) {
                case 0:
                    sb.append((char) (random.nextInt(26) + 'A')); // Letra may�scula
                    break;
                case 1:
                    sb.append((char) (random.nextInt(26) + 'a')); // Letra min�scula
                    break;
                case 2:
                    sb.append(random.nextInt(10)); // N�mero
                    break;
            }
        }

        contrasena = sb.toString(); // Almacena la contrase�a generada
    }

    public boolean esSegura() {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        for (int i = 0; i < longitud; i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(c)) {
                contadorMinusculas++;
            } else if (Character.isDigit(c)) {
                contadorNumeros++;
            }
        }

        // Devuelve verdadero si la contrase�a cumple con los criterios de seguridad
        return contadorNumeros > 5 && contadorMinusculas > 1 && contadorMayusculas > 2;
    }
}



