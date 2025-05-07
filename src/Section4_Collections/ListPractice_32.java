package Section4_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListPractice_32 {
    public static void main(String[] args) {
        //addList();
        //listFor();
        //listForEach();
        //containList();
        //randomList();
    }

    static void addList(){
        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(4);
        integerList.add(6);

        System.out.printf("list: %s%n", integerList);
        integerList.set(1,0);
        System.out.printf("new list: %s%n", integerList);
    }

    static void listFor(){
        final List<String> stringList = Arrays.asList("one","two","three");

        for (var i = 0; i < stringList.size(); i++) {
            System.out.printf("index: %d value %s%n",i,stringList.get(i));
        }
    }

    static void listForEach(){
        final List<Integer> forEchaList = Arrays.asList(1,2,3,4,5);

        for (Integer item: forEchaList){
            System.out.printf("value: %d%n", item);
        }
    }

    static void containList(){
        final List<Character> letter = Arrays.asList('a','b','c');

        if (letter.contains('c')){
            System.out.printf("the letter %s, is present in the list",letter.get(2));
        }else System.out.println("the letter is not present");
    }


    static void randomList(){
        final Random random = new Random();

        final List<Integer> randomIntList = RandomUtilities.generarListaIntAleatoria(
                20,100,50,random);
        final List<Double> randomDoubleList = RandomUtilities.generarListaDoubleAleatoria(
                5,100,50,random);

        System.out.printf("first list: %s%n",randomIntList);
        System.out.printf("second list: %s%n",randomDoubleList);
    }
}

