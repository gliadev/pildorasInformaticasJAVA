package es.pildorasInformaticas.poo.Abstractas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class PruebaTemporizador2 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.ejecutarTemporizador(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

    }
}

class Reloj {
    private int intervalo;
    private boolean sonido;


    public void ejecutarTemporizador(int intervalo, boolean sonido){
        // clase interna al moverla la hago interna local
        // y tengo que quitar el private a public
        /* class DameLaHora implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 segundo" + ahora);

                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        }

        ActionListener oyente = new DameLaHora();

         */

        Timer miTemporizador = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora = new Date();
                System.out.println("Te pongo la hora cada 3 segundo" + ahora);

                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

        miTemporizador.start();
    }



}
