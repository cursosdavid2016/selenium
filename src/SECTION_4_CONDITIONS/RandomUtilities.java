package SECTION_4_CONDITIONS;

import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(int min, int max, Random random){
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(int min, int max, Random random){
        return (max - min) * random.nextDouble() + min;
    }

    static int[] generateRandomArrayInt(int n, int min, int max, Random random){
        final int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            arrayInt[i] = generarRandomInt(min,max,new Random());
        }
        return arrayInt;
    }

    static double[] generateRandomArrayDouble(int n, int min, int max, Random random){
        final double[] arrayDouble = new double[n];

        for (int i = 0; i < n; i++) {
            arrayDouble[i] = generarRandomDouble(min,max,new Random());
        }
        return arrayDouble;
    }
}
