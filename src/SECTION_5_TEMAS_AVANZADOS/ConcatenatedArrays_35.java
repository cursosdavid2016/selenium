package SECTION_5_TEMAS_AVANZADOS;

import java.util.Arrays;
import java.util.Random;

public class ConcatenatedArrays_35 {
    public static void main(String[] args) {
        final int[] array1 = RandomUtilities.generateRandomArrayInt(15, 0, 6, new Random());
        final int[] array2 = RandomUtilities.generateRandomArrayInt(15, 0, 6, new Random());

        showArray(array1);
        showArray(array2);

        final int[] divArray = divideArrays(array1, array2);
        showArray(divArray);

    }

    static void showArray(int[] array) {
        System.out.printf("array %s%n", Arrays.toString(array));
    }

    static int[] divideArrays(int[] array1, int[] array2) {
        int n = array1.length;
        final int[] divArray = new int[n];

        int quotient;
        for (var i = 0; i < n; i++) {
            try {
                quotient = array1[i] / array2[i];
            } catch (ArithmeticException arithmeticException) {
                quotient = -1;
                // System.out.println("zero divition not allow");
                //System.err.printf("arithmeticException %s%n",arithmeticException.getMessage());
            }
            divArray[i] = quotient;
        }

        return divArray;
    }

}
