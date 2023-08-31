package Ejercicios.EjerciciosPOO1;

import java.util.Random;

public class CuentaCorriente {

    // constructor para la cuenta corriente
    public CuentaCorriente(String nombreTitular, double saldo){
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        Random aleatorio = new Random();
        numeroCuenta = Math.abs(aleatorio.nextLong());
    }

    // metodo set para los ingresos
    public void setIngreso(double ingreso){
        if (ingreso < 0) System.out.println("No puedes hacer ingresos negativos");
        else saldo += ingreso;
    }

    // metodo set para los reintegros
    public void setReintegro(double reintegro){
        saldo -= reintegro;
    }

    public String getSaldo(){
        return "El saldo de la cuenta es: " + saldo + " Euros.";
    }

    public static void Traferenia(CuentaCorriente Titular1, CuentaCorriente Titular2, double cantidad){
        Titular1.saldo += cantidad;
        Titular2.saldo += cantidad;

    }

    public String getDatosCuenta(){
        return "Titular; " + nombreTitular + " Numero: " + numeroCuenta + " con un saldo de: " + saldo;
    }



    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;

}
