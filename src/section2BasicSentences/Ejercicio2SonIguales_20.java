package section2BasicSentences;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2SonIguales_20 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        //final int a = Utilities.RandomUtilities.generarRandomInt(3,5, random);
        //final int b = Utilities.RandomUtilities.generarRandomInt(3,5, random);
        final int a = ScannerManager.leerInt(keyboard,"enter first value");
        final int b = ScannerManager.leerInt(keyboard,"enter second value");

        keyboard.close();

        printResult(a,b,areEquals(a,b));
    }



    static boolean areEquals(int a, int b){
        return a == b;
    }

    static void printResult(int a, int b, boolean areEquals){
        System.out.printf("value %d are equals to %d ? %b",a,b,areEquals);
    }




}
