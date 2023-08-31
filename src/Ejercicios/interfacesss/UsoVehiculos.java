package Ejercicios.interfacesss;

public class UsoVehiculos  {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[2];

        vehiculos[0] = new Coche(90);
        vehiculos[1] = new Moto(45);

        vehiculos[0].ACELERAR(40);
        vehiculos[0].FRENAR(34);

        vehiculos[1].ACELERAR(34);
        vehiculos[1].FRENAR(23);

        System.out.println(vehiculos[0].PLAZAS());
        System.out.printf(vehiculos[1].PLAZAS());




    }
}
