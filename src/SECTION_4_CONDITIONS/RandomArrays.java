package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int size = ScannerManager.leerInt(scanner,"enter array size");
        final int min = ScannerManager.leerInt(scanner,"enter array minimun");
        final int max = ScannerManager.leerInt(scanner,"enter array maximun");
        final int scalar = ScannerManager.leerInt(scanner,"enter array scalar");
        scanner.close();
        int[] originalArray = new int[size];
        originalArray = RandomUtilities.generateRandomArrayInt(size,min,max,random);

        printArrays(originalArray,calScalarProduct(originalArray,scalar));

    }

    static int[] calScalarProduct(int[] oldArray, int scalar){
        int n = oldArray.length;
        final int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = oldArray[i] * scalar;
        }
        return newArray;
    }

    static void printArrays(int[] oldArray, int[] newArray){
        System.out.printf("star array: %s%n", Arrays.toString(oldArray));
        System.out.printf("new array: %s%n", Arrays.toString(newArray));
    }

}
