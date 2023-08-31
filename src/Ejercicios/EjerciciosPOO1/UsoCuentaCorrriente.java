package Ejercicios.EjerciciosPOO1;

public class UsoCuentaCorrriente {
    public static void main(String[] args) {
        CuentaCorriente Cuenta1 = new CuentaCorriente("Adolfo Gómez", 1500);
        CuentaCorriente Cuenta2 = new CuentaCorriente("Idurre Rojo", 2500);


        CuentaCorriente.Traferenia(Cuenta1, Cuenta2, 200);

        System.out.println(Cuenta1.getDatosCuenta());
        System.out.println(Cuenta2.getDatosCuenta());

    }
}
