package PrimerosPasos;

public class Redondeo_numerico {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		double numero = 16.35;
		System.out.println(numero + "redondeado =" + Math.round(numero));
		
		double x = 9.997;
		int j = (int) x;
		
		System.out.print(j);
		int z = (int) Math.round(j);
		System.out.print(z);
		
	}

}
