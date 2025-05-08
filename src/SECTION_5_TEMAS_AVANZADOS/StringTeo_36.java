package SECTION_5_TEMAS_AVANZADOS;

import section2BasicSentences.ScannerManagerExample_16;

import java.io.FilterOutputStream;
import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class StringTeo_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 strinToChar(scanner);

        //2 stringMetods(scanner);

        //3 multilinea();
        //4 multilinea1("Jhon",1.75,30);

        final String string1 = ScannerManager.leerString(scanner,"enter the first string");
        final String string2 = ScannerManager.leerString(scanner,"enter the second string");
        //5 equalsString(scanner);

        //6 compareString(scanner);

        //7 toUppLowCase(scanner);

        //8 alphabeticallyCompareStrings(scanner,string1,string2);

        //9 splitString(scanner);

        //10 replaceData(scanner);

        //11 starEndWith(scanner);

        //12 replaceData(scanner);

         starEndWith(scanner,string1,string2);

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

    static void multilinea(){
        final String multiline = """
                name: Tron
                height: 1.77
                age: 39
                """;
        System.out.println(multiline);
    }

    static void multilinea1(String name, double height, int age){
        final String multiline1 = """
                name: %s
                height: %.2f
                age: %s
                """;
        System.out.printf(multiline1,name,height,age);
    }

    static void equalsString(Scanner scanner,String string1, String string2){

        if (string1.equals(string2)){
            System.out.println("both strings are the same");
        }
        if (string1.equalsIgnoreCase(string2)){
            System.out.println("both strings are the same regardless upper and lower case letters");
        }
    }

    static void compareString(Scanner scanner,String string1, String string2){

        if (string1.contains(string2)){
            System.out.printf("the string -> %s%n contains the string -> %s%n",string1,string2);
        }


    }

    static void toUppLowCase(Scanner scanner,String string1, String string2){
        string1 = ScannerManager.leerString(scanner,"enter the string1 in uppercase");
        string2 = ScannerManager.leerString(scanner,"enter the string2 in lowercase");

        System.out.printf("string 1 to lowercase %s%n",string1.toLowerCase());
        System.out.printf("string 2 to Uppercase %s%n",string2.toUpperCase());
    }

    static void alphabeticallyCompareStrings(Scanner scanner,String string1, String string2){

        if (string1.compareToIgnoreCase(string2) == 0){
            System.out.printf("%s are equals %s%n",string1,string2);
        } else if (string1.compareToIgnoreCase(string2) > 0) {
            System.out.printf("String %s are less than %s%n",string2,string1);
        }else if(string1.compareToIgnoreCase(string2) < 0){
            System.out.printf("%s are less than %s%n",string1,string2);
        }
    }

    static void splitString(Scanner scanner){
        String string = ScannerManager.leerString(scanner,"please enter a word to divide");

        final String[] arrayString = string.split(" ");

        System.out.println("word divede is: ");
        for (String element : arrayString){
            System.out.printf("%s%n",element);
        }
    }

    static void replaceData(Scanner scanner){
        final String data1 = "$123.4";
        final String data2 = "234.56-";

        final String newData1 = data1.replace("$","");
        final String newData2 = data1.replace("-","");

        System.out.printf("old data1: %s - new data1: %s%n",data1,newData1);
        System.out.printf("old data2: %s - new data2: %s%n",data2,newData2);
    }

    static void starEndWith(Scanner scanner,String starWith,String endWith){
        if (starWith.startsWith("a")){
            System.out.printf("the string star with the word %s%n",starWith.charAt(0));
        }else {
            System.out.printf("the string not star with the word %s%n",starWith.charAt(0));
        }

        if (endWith.endsWith("z")){
            System.out.printf("the string end with the word-> %s%n",endWith.charAt(endWith.length()-1));
        }else {
            System.out.printf("the string not end with the word-> %s%n",endWith);
        }
    }
}