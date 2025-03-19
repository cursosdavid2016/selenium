package section2BasicSentences;

import java.util.Scanner;

public class Ejercicio3_UsoClaseScanner_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter your age");
        final int age = keyboard.nextInt();
        System.out.println("please enter your height");
        final double height = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("please enter your name");
        final String name = keyboard.nextLine();

        keyboard.close();
        printResult(name,age,height);
    }


    static void printResult(String name, int age, double height){
        System.out.printf("Mi name is %s, i have %d years old and i mesure %.2fcm",name,age,height);
    }
}