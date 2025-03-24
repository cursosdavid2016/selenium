package section3JavaConditionsLoops;

import java.util.Scanner;

public class Bank_If_Else_21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double loanAmount = ScannerManager.leerDouble(keyboard, "enter the loanAmount");
        printResult(loanAmount,amountCalc(loanAmount));

    }

    static double amountCalc(double initialAmount){
        final var increase1 = (initialAmount % 2 == 0)? initialAmount * 0.1 : 0;
        final var increase2 = (initialAmount % 3 == 0)? 500 : 0;
        final var increase3 = (initialAmount % 3 == 0)? 300 : 0;

        return  initialAmount + increase1 + increase2 + increase3;
    }

    static void printResult(double loanAmount,double totalAmounDue){
        System.out.printf("for the loan application: %.3f. will be charge at the end" +
                "of the loan term %.3f%n",loanAmount,totalAmounDue);
    }
}
