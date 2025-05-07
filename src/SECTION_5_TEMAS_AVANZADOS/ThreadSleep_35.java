package SECTION_5_TEMAS_AVANZADOS;

import java.util.Scanner;

public class ThreadSleep_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readNumber = ScannerManager.leerInt(scanner, "enter a value between");

        showCont(readNumber);
    }

    static void hold(long n){
        try {
            Thread.sleep(n * 1000);
        }catch (InterruptedException interruptedException){
            System.err.printf("InterruptedException %s%n",interruptedException.getMessage());
            System.out.println("wait error");
        }
    }

    static void showCont(int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d%n",i+1);
            hold(1);
        }
    }
}
