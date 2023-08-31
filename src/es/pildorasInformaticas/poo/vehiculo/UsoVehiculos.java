package es.pildorasInformaticas.poo.vehiculo;

public class UsoVehiculos {
    public static void main(String[] args) {

        Vehiculos miCoche = new Vehiculos(4);
        miCoche.setColor("Azul");
        System.out.println(miCoche.getColor());

        Vehiculos miCoche2 = new Vehiculos(3);

        miCoche2.setColor("Amarillo");
        System.out.println(miCoche2.getExtra());

        System.out.println(miCoche2.getColor());

        Vehiculos moto1 = new Vehiculos(2);

        System.out.println(miCoche.getDatosVehiculo());
        System.out.println(moto1.getDatosVehiculo());



        System.out.println(miCoche2.getExtra());

    }
}
