package SECTION_5_TEMAS_AVANZADOS;

import section2BasicSentences.ScannerManagerExample_16;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class StringTeo_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first example
        // strinToChar(scanner);

        //second example
        // stringMetods(scanner);

        scanner.close();
    }

    static void strinToChar(Scanner scanner){
       final String cadena = "raccoon";
        final char[] arrayChar = cadena.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.printf("index %s value %c%n",i,arrayChar[i]);
        }
    }


    static void stringMetods(Scanner scanner){
        final String string = "exit";
        //String length
        System.out.printf("the length of the string is: %s%n",string.length());

        //obtain index of character
        System.out.printf("the index of the character 'i' is: %d%n",string.indexOf('i'));

        //index of first character
        System.out.printf("the String \"xi\" the index is: %d%n",string.indexOf("xi"));
    }


}
