package section3JavaConditionsLoops;

import java.util.Scanner;

public class conditionals_If_Else_21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double loanAmount = ScannerManager.leerDouble(keyboard, "enter the loanAmount");
        printResult(loanAmount,amountCalc(loanAmount));

    }

    static double amountCalc(double application){
        if (application % 2 == 0){
            application *= 1.10;
        } else if (application % 3 == 0) {
            application += 500;
        }else if (application > 500) {
            application += 300;
        }
        return  application;
    }

    static void printResult(double loanAmount,double totalAmounDue){
        System.out.printf("for the loan application: %.3f. will be charge at the end" +
                "of the loan term %.3f%n",loanAmount,totalAmounDue);
    }
}
