package interfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class PrimerJFrame {
    public static void main(String[] args) {
        /*
        JFrame miVentana = new JFrame();

        // tamaño de la ventana
        miVentana.setSize(600, 350);

        // la colocacion de la ventana dentro del monitor
        miVentana.setLocation(600, 300);

        // Establezco la operación de cierre de la ventana cuando se hace clic en el botón de cierre
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // hago visible la aplicacion
        miVentana.setVisible(true);

         */

        MiJFrame miVentana = new MiJFrame();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MiJFrame extends JFrame {
    public MiJFrame(){
        setSize(600, 350);

        //setLocation(600, 300);
        //setLocationRelativeTo(null);

        setBounds(600,350,450, 450);
        //setResizable(false);

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Ventana");

        setVisible(true);


    }

}
