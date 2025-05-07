package Section4_Collections;

import Section4_Collections.RandomUtilities;

import java.util.Random;
import java.util.Scanner;

public class ScalarPerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter arraySize ");
        final int[] array = new int[scanner.nextInt()];
        final int min = ScannerManager.leerInt(scanner,"enter min value");
        final int max = ScannerManager.leerInt(scanner, "enter max value");
        final int scalar = ScannerManager.leerInt(scanner, "enter Scalar number");

        //generate random array
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomUtilities.generarRandomInt(min,max,new Random());
        }
        printInfo(scalarProductCal(array,scalar));
    }

    static int[] scalarProductCal(int[] array, int scalar){
        final int scalarArray[] = new int[array.length];
        for (var i = 0; i < array.length; i++) {
            scalarArray[i] = array[i] * 3;
        }
        return scalarArray;
    }

    static void printInfo(int[] scalarArray){
        for (var i = 0; i < scalarArray.length; i++) {
            System.out.printf("|%d|",scalarArray[i]);
        }
    }
}
