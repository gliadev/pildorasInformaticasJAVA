package es.pildorasInformaticas.poo.vehiculo;

public class Vehiculos {


    public Vehiculos(int ruedas){ // constructor de la clase mismo nombre que la clase
         // estado inicial
        this.ruedas = 4;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "sin color";



    }

    public String setExtra(boolean climatizador){
        if( climatizador ) return "Tu coche tiene climatizador";
        else return "Tu coche no tiene climatizador";
    }
    public void setExtra(boolean gps, boolean climatizador, boolean tapiceriaCuero) {
            this.climatizador = climatizador;
            this.gps = gps;
            this.tapiceriaCuero = tapiceriaCuero;

    }

    public String getExtra(){
        if(climatizador && gps == false && tapiceriaCuero == false) return "Tu coche lleva el pack 1 de Extras";
        else if (climatizador && gps == true && tapiceriaCuero == true ) return "Tu vehiculo lleva el pack 2 de Extras";
        else return "la convianacion de estras no se adminte";
    }

    public void setColor(String color){ // metodo setter que establece valor de la propiedad
        this.color = color;

    }

    public String getColor(){ // metodo getter que devuelve valor de la propiedad
        return color;

    }

    public String getDatosVehiculo(){

        return "Tu Vehiculo tiene " + ruedas + " ruedas. Ademas " +
                "tiene " + largo + " metros de largos";
    }

    // compos de clase propiedades
    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;
    private boolean climatizador;
    private boolean tapiceriaCuero;
    private boolean gps;



}
