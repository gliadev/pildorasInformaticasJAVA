package Ejercicios.GetterySetter;

import java.math.BigInteger;
import java.util.Random;

public class CuentaCorriente {
    // atributos
    private String nombreTitular;
    private double saldoInicial;
    private String numeroCuenta;

    // constructor por defecto
    public CuentaCorriente(){}

    // constructor con parametetros
    public CuentaCorriente(String nombreTitular, double saldoInicial){
        this.nombreTitular = nombreTitular;
        this.saldoInicial = saldoInicial;
        this.numeroCuenta = generarNumeroCuenta();
    }

    // GET y SET

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // metodos

    // generador de numero de cuenta
    private String generarNumeroCuenta() {
        // generar numero aleatorio de 20 digitos
        Random random = new Random();
        BigInteger numeroCuentaAleatorio = new BigInteger(80, random).abs();
        BigInteger diezElevadoA19 = BigInteger.TEN.pow(19);
        numeroCuentaAleatorio = numeroCuentaAleatorio.mod(diezElevadoA19);
        numeroCuentaAleatorio = numeroCuentaAleatorio.nextProbablePrime();
        String numeroCuentaAleatorioStringGeado = numeroCuentaAleatorio.toString();
        String numeroCuentaAleatorioStringGeado1 = numeroCuentaAleatorioStringGeado;
        return numeroCuentaAleatorioStringGeado1;
    }

    // METODO para ingresar dinero, vamos añadirlo
    public void ingresarDinero(double cantidad){
        saldoInicial += cantidad;
    }

    // METODO para retirar dinero que comprueba si puede retirarlo.
    public void retirarDinero(double cantidad) {
        if (cantidad > saldoInicial){
            System.out.println("No puedes retirar dinero de " + cantidad + " solo tienes, " + getSaldoInicial());
        } else {
            saldoInicial -= cantidad;
        }
    }

    // METODO Devolver los datos de una cuenta (titular, saldo y nº de cuenta)
    public String obtenerDatosCuenta(){
        String datosCuenta = "Titular: " + nombreTitular + "\n" +
                "Saldo: " + saldoInicial + "\n" +
                "Número de cuenta: " + numeroCuenta + "\n";
        return datosCuenta;
    }

    // METODO para hacer transferencias de dinero entre dos cuentas
    public void transferir(CuentaCorriente cuentaDestino, double monto) {
        if (saldoInicial < monto) {
            System.out.println("No se puede transferir " + monto + " porque el saldo es insuficiente.");
        } else {
            saldoInicial -= monto;
            cuentaDestino.ingresarDinero(monto);
            System.out.println("Se ha transferido " + monto + " de la cuenta " + numeroCuenta + " a la cuenta " + cuentaDestino.getNumeroCuenta() + ".");
        }
    }
}



