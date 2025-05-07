package SECTION_5_TEMAS_AVANZADOS;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListInt_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        ArrayList<Integer> list = new ArrayList<>();
        do {
            value = ScannerManager.leerIntTryCatch(scanner, "enter a value or enter '-1' to finish");

            if (value != -1) {
                list.add(value);
            }


        } while (value != -1);
        showList(list);
        scanner.close();
    }

    static void showList(List<Integer> list) {
        System.out.printf("the list is: %s%n", list);
    }
}
