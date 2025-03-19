package section2BasicSentences;



import java.util.Random;

public class Ejer2_CalcularFuerza_15 {
    public static void main(String[] args){
        Random random = new Random();
        final double masa = RandomUtilities.generarRandomDouble(100,300, random);
        final double aceleracion = RandomUtilities.generarRandomDouble(3,5, random);

        final double fuerza = calcularFuerza(masa,aceleracion);
        imprimirResultado(masa,aceleracion,fuerza);
    }

    static double calcularFuerza(double masa, double aceleracion){
        return masa * aceleracion;
    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza){
        System.out.printf("para una masa de: %.2f y aceleración de: %.2f, " +
                "tenemos un fuerza de: %.2f", masa, aceleracion, fuerza);
    }




}
