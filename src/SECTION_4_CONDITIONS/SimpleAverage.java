package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SimpleAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int arraySize = ScannerManager.leerInt(scanner,"enter arrays size");
        final int min = ScannerManager.leerInt(scanner,"enter min value");
        final int max = ScannerManager.leerInt(scanner,"enter max value");

        //CREATING ARRAYS
        double[] a = RandomUtilities.generateRandomArrayDouble(arraySize,min,max,random);
        double[] b = RandomUtilities.generateRandomArrayDouble(arraySize,min,max,random);
        printWeightedAverage(simpleAverage(a,b),a,b);
    }

    static double simpleAverage(double[] a,double[] b){
        final int n = a.length;
        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += a[i] * b[i];
        }
        return numerator/n;
    }

    static void printWeightedAverage(double weightedAverage,double[] a,double[] b){
        System.out.printf("array1: %s%n",Arrays.toString(a));
        System.out.printf("array1: %s%n",Arrays.toString(b));
        System.out.printf("weightedAverage is: : %.2f%n",weightedAverage);
    }
}
