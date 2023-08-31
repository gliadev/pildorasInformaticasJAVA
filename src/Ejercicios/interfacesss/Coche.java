package Ejercicios.interfacesss;

public class Coche  implements Vehiculo{
    // atributo para establecer la
    private int velocidad;

    // contructor de coche
    public Coche(int VelocidadInicial){
        this.velocidad = VelocidadInicial;
    }

    @Override
    public void ACELERAR(int cantidad) {
        if ( velocidad + cantidad <= VELOCIDAD_MAXIMA) {
            velocidad += cantidad;
            System.out.println("Aceleraste a " + velocidad + " KM/H");
        } else {
            System.out.println("La Velocidad es superior a " + VELOCIDAD_MAXIMA + " KM/H");
        }
    }

    @Override
    public void FRENAR(int cantidad) {
        if ( 0 >= 0) {
            velocidad -= cantidad;
            System.out.println("Frenaste a " + velocidad);
        } else {
            velocidad = 0;
        }
    }

    @Override
    public String PLAZAS() {
        return "El coche tiene 5 plazas";
    }
}
