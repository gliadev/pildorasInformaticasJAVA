package Ejercicios.GetterySetter;

import java.util.Scanner;

public class UsoCuentaCorriente {
    public static void main(String[] args) {
        // Crear varias cuentas corrientes
        CuentaCorriente cuenta1 = new CuentaCorriente("Adolfo", 15000);
        CuentaCorriente cuenta2 = new CuentaCorriente("Carlos", 25000);
        CuentaCorriente cuenta3 = new CuentaCorriente("Ana", 5000);

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Mostrar el men� y leer la opci�n del usuario
        int opcion;
        do {
            System.out.println("=== Men� de opciones ===");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Transferir dinero");
            System.out.println("4. Ver datos de la cuenta");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opci�n: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de l�nea despu�s de leer la opci�n

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a ingresar: ");
                    double montoIngreso = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de l�nea despu�s de leer el monto
                    cuenta1.ingresarDinero(montoIngreso);
                    System.out.println("Se ha ingresado " + montoIngreso + " a la cuenta de " + cuenta1.getNombreTitular() + ".");
                    break;

                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de l�nea despu�s de leer el monto
                    cuenta1.retirarDinero(montoRetiro);
                    System.out.println("Se ha retirado " + montoRetiro + " de la cuenta de " + cuenta1.getNombreTitular() + ".");
                    break;

                case 3:
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferencia = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de l�nea despu�s de leer el monto
                    System.out.print("Ingrese el n�mero de cuenta destino: ");
                    String numeroCuentaDestino = sc.nextLine();
                    CuentaCorriente cuentaDestino = null;
                    if (numeroCuentaDestino.equals(cuenta2.getNumeroCuenta())) {
                        cuentaDestino = cuenta2;
                    } else if (numeroCuentaDestino.equals(cuenta3.getNumeroCuenta())) {
                        cuentaDestino = cuenta3;
                    } else {
                        System.out.println("El n�mero de cuenta destino no es v�lido.");
                        break;
                    }
                    cuenta1.transferir(cuentaDestino, montoTransferencia);
                    break;

                case 4:
                    System.out.println("Datos de la cuenta de " + cuenta1.getNombreTitular() + ":");
                    System.out.println(cuenta1.obtenerDatosCuenta());
                    break;

                case 0:
                    System.out.println("Adi�s!");
                    break;

                default:
                    System.out.println("Opci�n no v�lida.");
                    break;
            }
            System.out.println(); // Imprimir una l�nea
        } while (opcion != 0);
    }
}

