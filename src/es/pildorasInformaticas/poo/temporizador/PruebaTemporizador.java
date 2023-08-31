package es.pildorasInformaticas.poo.temporizador;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

       //Temporizador oyente = new Temporizador();

        Timer miTemporizador = new Timer(5000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date horaActual = new Date();
                System.out.println(horaActual);

            }
        });
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");

    }
}


/*
class Temporizador implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date horaActual = new Date();
        System.out.println(horaActual);
    }
 */



