package section3JavaConditionsLoops;

import java.util.Scanner;

public class SwitchCalculator_23 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int n1 = ScannerManager.leerInt(keyboard, "enter number 1");
        System.out.println();
        final int n2 = ScannerManager.leerInt(keyboard, "enter number 2");
        showMenu();
        final var option = ScannerManager.leerChar(keyboard, "select option");
        keyboard.close();
        executeOption(option,n1,n2);

    }

    static void showMenu() {
        System.out.println(
                "° option: A/a: add \n" +
                        "° option: B/b: subtract \n" +
                        "° option: C/c: multiply \n" +
                        "° option: D/d: divide \n" +
                        "° option: E/e: module \n"
        );
    }

    static void executeOption(char option, int n1, int n2) {
        switch (option) {
            case 'A', 'a' -> printResult("the add result of the numbers: ",n1,n2,addCalculation(n1,n2));
            case 'B', 'b' -> printResult("the subtract result of the numbers: ",n1,n2,substractCalculation(n1,n2));
            case 'C', 'c' -> printResult("the multiply result of the numbers: ",n1,n2,multiplyCalculation(n1,n2));
            case 'D', 'd' -> {
                if (n2 == 0 || n2 > n1) {
                            System.out.println("the diveder can't be zero and n2 can't be mayor than n1");
                }else printResult("the divedir result of the numbers: ",n1,n2,divideCalculation(n1,n2));
            }
            case 'E', 'e' -> printResult("the module result of the numbers: ",n1,n2,moduleCalculation(n1,n2));
            default -> System.out.println("incorrect option");
        }
    }

    static int addCalculation(int n1, int n2) {
        return n1 + n2;
    }

    static int substractCalculation(int n1, int n2) {
        return n1 - n2;
    }

    static int multiplyCalculation(int n1, int n2) {
        return n1 * n2;
    }

    static int divideCalculation(int n1, int n2) {
        return n1 / n2;
    }

      static int moduleCalculation(int n1, int n2) {
        return n1 % n2;
    }

    static void printResult(String message,int n1, int n2, int result) {
        System.out.printf("%s: %d, %d. And their result is: %d%n",message,n1,n2,result);
    }
}
