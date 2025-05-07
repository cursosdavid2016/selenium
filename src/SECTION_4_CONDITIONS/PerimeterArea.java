package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PerimeterArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int arraySize = ScannerManager.leerInt(scanner,"enter arrays size");
        final int min = ScannerManager.leerInt(scanner,"enter min");
        final int max = ScannerManager.leerInt(scanner,"enter max");

        scanner.close();
        Random random = new Random();
        double[] arraysCircleRadio = RandomUtilities.generateRandomArrayDouble(arraySize,min,max,random);

        double[] P = perimeterArrayCal(arraysCircleRadio);
        double[] A = areaArrayCal(arraysCircleRadio);
        printArrays(arraysCircleRadio,P,A);
    }

    static double[] perimeterArrayCal(double[] radioArrays){
        int n = radioArrays.length;
        double[] P = new double[n];

        for (int i = 0; i < n; i++) {
            P[i] = 2 * Math.PI * radioArrays[i];
        }
        return P;
    }

    static double[] areaArrayCal(double[] radioArray){
        int n = radioArray.length;
        double[] S = new double[n];

        for (int i = 0; i < n; i++) {
            S[i] = Math.PI * Math.pow(radioArray[i],2);
        }
        return S;
    }

    static void printArrays(double[] radioArray,double[] perimeterArray,double[] areaArray){
        System.out.printf("raio arrays: %s%n", Arrays.toString(radioArray));
        System.out.printf("perimeter arrays %s%n", Arrays.toString(perimeterArray));
        System.out.printf("area array %s%n", Arrays.toString(areaArray));
    }
}
