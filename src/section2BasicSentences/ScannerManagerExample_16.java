package section2BasicSentences;



import java.util.Scanner;


public class ScannerManagerExample_16 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final String name = ScannerManager.leerString(keyboard,"enter your name");
        final int age = ScannerManager.leerInt(keyboard,"enter your age");
        final double height = ScannerManager.leerDouble(keyboard,"enter your height");

        keyboard.close();
        printResult(name,age,height);
    }

    static void printResult(String name, int age, double height){
        System.out.printf("mi name is %s i have %d years old and my height is %.2f%n",name,age,height);
    }

}
