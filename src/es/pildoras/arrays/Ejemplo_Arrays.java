package es.pildoras.arrays;

public class Ejemplo_Arrays {
    public static void main(String[] args) {

        int []valores = new int[5];


        // almacenar datos implicita
        valores[0] = 15;
        valores[1] = 21;
        valores[2] = 345;
        valores[3] = 345;
        valores[4] = 345656;

        System.out.println(valores[4]);

        // declaracion inicializacion explicita
        int []valores2 = {12,34,56,125,8};

        for (int i = 0; i < valores2.length; i++){
            System.out.println(valores2[i]);
        }

       for(int elemento:valores2){
           System.out.println(elemento);
       }


       // arrays de String

        String [] nombre_personas = {"Nobi", "Xcopira", "Saritza", "Blackhaw"};





    }
}
