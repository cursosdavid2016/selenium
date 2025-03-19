package section2BasicSentences;

import java.util.Scanner;

public class Example4_isEven_20 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int n = ScannerManager.leerInt(keyboard,"enter a number");
        keyboard.close();

        printResult(n,isEven(n),isMultipleOf5(n));
    }

    static boolean isEven(int n){
        return n % 2 == 0;
    }

    static boolean isMultipleOf5(int n){
        return n % 5 == 0;
    }

    static void printResult(int n, boolean isEven, boolean isMultipleOf5){
        System.out.printf("the number %d is even? %b%n",n,isEven);
        System.out.printf("the number %d is multiple of 5? %b%n",n,isMultipleOf5);
    }
}
