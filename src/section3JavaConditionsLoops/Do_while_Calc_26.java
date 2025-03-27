package section3JavaConditionsLoops;

import java.util.Scanner;

public class Do_while_Calc_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n1 = ScannerManager.leerInt(scanner, "please enter first number");
        final int n2 = ScannerManager.leerInt(scanner, "please enter second number");
        char opt;
        do {
            printMenu();
            opt = ScannerManager.leerChar(scanner, "choose an option");
            if (opt != 'F' && opt != 'f'){
                executeOption(opt, n1, n2);
            }else System.out.println("press wrong key");

        } while (opt != 'F' && opt != 'f');//continue conditions

        scanner.close();
    }

    static void executeOption(char option, int num1, int num2) {

        final int result = switch (option) {
                case 'A','a' -> addCalc(num1,num2);
                case 'B', 'b'-> subtractCalc(num1,num2);
                case 'C', 'c'-> multiplyCalc(num1,num2);
                case 'D', 'd' -> divCalc(num1,num2);
                case 'E', 'e' -> moduleCalc(num1,num2);
            default -> -1;
        };

        if (result != -1){
            System.out.printf("for the numbers: %d, %d. The resul is: %d%n", num1,num2, result);
        }else {
            System.out.println("incorrect option");
        }

    }

    enum Operation {
        A,a,
        B,b,
        C,c,
        D,d,
        E,e
    }

    static void printMenu() {
        System.out.println("options: \n" +
                            "A/a: add \n" +
                            "B/b: subtract \n" +
                            "C/c: multiply \n" +
                            "D/d: divide \n" +
                            "E/e: module \n" +
                            "F/f: exit \n"
        );
    }

    static int addCalc(int num1, int num2) {
        return num1 + num2;
    }

    static int subtractCalc(int num1, int num2) {
        return num1 - num2;
    }

    static int multiplyCalc(int num1, int num2) {
        return num1 * num2;
    }

    static int divCalc(int num1, int num2) {
        return num1 / num2;
    }

    static int moduleCalc(int num1, int num2) {
        return num1 % num2;
    }

}
