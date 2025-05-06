package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class addArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int size = ScannerManager.leerInt(scanner,"enter arrays size");
        final int min = ScannerManager.leerInt(scanner,"enter arrays min");
        final int max = ScannerManager.leerInt(scanner,"enter arrays max");

        scanner.close();
        int[] firstArray = RandomUtilities.generateRandomArrayInt(size,min,max,new Random());
        int[] secondArray = RandomUtilities.generateRandomArrayInt(size,min,max,new Random());

        int[] addArray = calAddArrays(size,firstArray,secondArray);
        printResult(firstArray,secondArray,addArray);
    }

    static int[] calAddArrays(int size, int[] first, int[] second){
        int[] addArray = new int[size];

        for (int i = 0; i < size; i++) {
            addArray[i] = first[i] + second[i];
        }
        return addArray;
    }

    static void printResult(int[] first, int[] second, int[] addArrays){
        System.out.printf("first array %s%n ", Arrays.toString(first));
        System.out.printf("second array %s%n ", Arrays.toString(second));
        System.out.printf("addArrays array %s%n ", Arrays.toString(addArrays));
    }
}
