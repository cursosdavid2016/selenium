package section2BasicSentences;

import java.util.Random;

public class Eje3_CalculoVelocidadFinal_15 {

    public static void main(String[] args) {
        Random random = new Random();
        final double velocidadInicial = RandomUtilities.generarRandomDouble(10, 30 , random);
        final double aceleracion = RandomUtilities.generarRandomDouble(2, 5 , random);
        final int tiempo = RandomUtilities.generarRandomInt(3,5, random);

        final double velocidadFinal = calcularVelocidadFinal(velocidadInicial,aceleracion,tiempo);
        imprimirResultado(velocidadFinal,velocidadInicial,aceleracion,tiempo);
    }

    static double calcularVelocidadFinal(double vi, double a, int t){
        return vi + a * t;
    }


    static void imprimirResultado(double vf, double vi, double a, int t){
        System.out.printf("para una velocidad inicial de, %.2f una aceleración de %.2f, y un tiempo: %d, " +
                "se tiene una velocidad final: %.2f%n",vi,a,t,vf);
    }


}
