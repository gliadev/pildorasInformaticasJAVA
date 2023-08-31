package Ejercicios.BucleFor;

import javax.swing.*;

public class Email_correcto {
    public static void main(String[] args) {
        System.out.println("En este ejercicio se pide al usuario que introduzca su dirección de email con ayuda de la clase\n" +
                "JOptionPane.\n" +
                "Una vez introducido el email, el programa debe decir si la dirección de email es correcta o no\n" +
                "teniendo en cuenta los siguientes requisitos:\n" +
                "1. Debe tener una @\n" +
                "2. No debe tener más de una @\n" +
                "3. Debe tener un punto\n" +
                "4. La dirección de email debe tener al menos 4 caracteres.\n" +
                "El programa pedirá introducir indefinidamente la dirección de email si no es correcta o si tienes\n" +
                "menos de 4 caracteres.\n");

        boolean emailValido = false;


        do{
           String email = JOptionPane.showInputDialog("Introduce una direccion de Email valida: ");
           int arroba = 0;
           boolean punto = false;
           for ( int i = 0; i < email.length(); i++){
               if (email.charAt(i) == '@') arroba++;
               if (email.charAt(i) == '.') punto = true;
           }
            if ( arroba == 1 && punto == true && email.length()>=4 ) emailValido = true;
            else JOptionPane.showInputDialog(null, "Email no valido");
        } while (emailValido = false);

        System.out.println("Eamill correcto");
    }
}
