package Ejercicios.interfacesss;

public class Moto implements Vehiculo {
    private int velocidad;

    public Moto(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }

    @Override
    public void ACELERAR(int cantidad) {
        if (velocidad + cantidad <= VELOCIDAD_MAXIMA) {
            velocidad += cantidad;
            System.out.println("Aceleraste a " + velocidad + "KM/H");
        } else {
            System.out.println("Velocidad máxima superada.");
        }
    }

    @Override
    public void FRENAR(int cantidad) {
        if (velocidad - cantidad >= 0) {
            velocidad -= cantidad;
            System.out.printf("Frenaste a " + velocidad + " KM/H");
        } else {
            velocidad = 0;
        }
    }

    @Override
    public String PLAZAS() {
        return "La moto tiene 2 Plazas";
    }
    
}
