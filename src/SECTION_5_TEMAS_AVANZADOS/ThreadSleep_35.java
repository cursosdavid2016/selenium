package SECTION_5_TEMAS_AVANZADOS;

import java.util.Scanner;

public class ThreadSleep_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int number = ScannerManager.leerInt(scanner,"enter a number between 1 - 5");
        showCont(number);
    }

    static void waitingMethod(long n){

        try {
            Thread.sleep(n * 1000);
        }catch (InterruptedException interruptedException){
            System.out.println("error when waiting");
            System.err.printf("InterruptedException %s%n", interruptedException.getMessage());
        }


    }

    static void showCont(int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d%n",i+1);
            waitingMethod(1);
        }
    }
}
