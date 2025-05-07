package SECTION_5_TEMAS_AVANZADOS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerManager {
    static int leerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    static int leerIntTryCatch(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        try {
            return scanner.nextInt();
        }catch (InputMismatchException inputMismatchException){
            System.out.println("only integer data allow");
            return -1;
        }

    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    static String leerString(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }

    static boolean leerBoolean(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }
}
