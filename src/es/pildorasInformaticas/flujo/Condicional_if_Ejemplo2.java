package es.pildorasInformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_if_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente

		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		if(edad<18){
			System.out.println("Eres muy joven");
		}else if(edad < 40) {
			System.out.println("Eres joven");
		}else if(edad < 65) {
			System.out.println("Eres maduro");
		}else {
			System.out.println("Cuidate");
		}
	}

}
