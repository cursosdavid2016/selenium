package section3JavaConditionsLoops;

import java.util.Scanner;

public class Circle_Perimeter_21 {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double radio = ScannerManager.leerDouble(keyboard,"enter the radio");
        menuPrint();
        final char option = ScannerManager.leerChar(keyboard,"Select an option\n");
        keyboard.close();

        if(inputValidation(option)){
            if (option == 'A'){
                showArea(areaCalc(radio));
            } else if (option == 'B') {
                showPerimeter(perimeterCalc(radio));
            }else
                showArea(areaCalc(radio));
                showPerimeter(perimeterCalc(radio));
        }else {
            System.out.println("wrong option");
        }
    }

    static void menuPrint(){
        System.out.println( "A: calculate perimeter\n" +
                            "B: calculate area\n" +
                            "C: calculate both\n");
   }

    static boolean inputValidation(char option){
     return option == 'A' || option == 'B' || option == 'C';
    }

    static double areaCalc(double radio){
        return Math.PI*Math.pow(radio,2);
    }

    static double perimeterCalc(double radio){
        return 2 * Math.PI * radio;
    }

    static void showArea(double area){
        System.out.printf("el area es: %.2f", area);
    }

    static void showPerimeter(double perimeter){
        System.out.printf("perimeter: %.2f", perimeter);
    }
}
