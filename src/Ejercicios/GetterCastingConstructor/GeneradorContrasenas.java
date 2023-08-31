package Ejercicios.GetterCastingConstructor;

import java.util.Random;

public class GeneradorContrasenas {
    private String contrasena; // Almacena la contraseña generada
    private int longitud; // Almacena la longitud de la contraseña

    public GeneradorContrasenas(int longitud) {
        this.longitud = longitud;
        generarContrasena(); // Llama al método para generar la contraseña
    }

    public String getContrasena() {
        return contrasena; // Devuelve la contraseña generada
    }

    public int getLongitud() {
        return longitud; // Devuelve la longitud de la contraseña
    }

    private void generarContrasena() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int opcion = random.nextInt(3); // 0: letra mayúscula, 1: letra minúscula, 2: número

            switch (opcion) {
                case 0:
                    sb.append((char) (random.nextInt(26) + 'A')); // Letra mayúscula
                    break;
                case 1:
                    sb.append((char) (random.nextInt(26) + 'a')); // Letra minúscula
                    break;
                case 2:
                    sb.append(random.nextInt(10)); // Número
                    break;
            }
        }

        contrasena = sb.toString(); // Almacena la contraseña generada
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

        // Devuelve verdadero si la contraseña cumple con los criterios de seguridad
        return contadorNumeros > 5 && contadorMinusculas > 1 && contadorMayusculas > 2;
    }
}



