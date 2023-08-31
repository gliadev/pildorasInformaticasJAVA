package Ejercicios.InterfaceGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EjercicioVentanas {
    public static void main(String[] args) {

        // Obtener el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();

        // Tamaño de cada ventana
        int ventanaWidth = 300;
        int ventanaHeight = 200;

        // Calcular la posición de la primera ventana en el centro de la pantalla
        int x1 = (screenWidth - ventanaWidth) / 2;
        int y1 = (screenHeight - ventanaHeight) / 2;

        // Creamos la primera ventana con tamaño 300x200 y título "Ventana 1"
        Ventana ventana1 = new Ventana(ventanaWidth, ventanaHeight, "Ventana 1", x1, y1);
        ventana1.setVisible(true);

        // Calcular la posición de la segunda ventana en cascada respecto a la primera
        int x2 = x1 + 20;
        int y2 = y1 + 20;

        // Creamos la segunda ventana con tamaño 300x200 y título "Ventana 2"
        Ventana ventana2 = new Ventana(ventanaWidth, ventanaHeight, "Ventana 2", x2, y2);
        ventana2.setVisible(true);

        // Calcular la posición de la tercera ventana en cascada respecto a la segunda
        int x3 = x2 + 20;
        int y3 = y2 + 20;

        // Creamos la tercera ventana con tamaño 300x200 y título "Ventana 3"
        Ventana ventana3 = new Ventana(ventanaWidth, ventanaHeight, "Ventana 3", x3, y3);
        ventana3.setVisible(true);
    }

    static class Ventana extends JFrame {
        public Ventana(int width, int height, String title, int x, int y) {
            setTitle(title);
            setSize(width, height);
            setLocation(x, y);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }
}