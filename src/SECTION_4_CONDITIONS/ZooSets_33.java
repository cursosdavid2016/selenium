package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZooSets_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> setOfAnimals1 = createSetOfAnimals1();
        Set<String> setOfAnimals2 = createSetOfAnimals2(scanner);

        setOfAnimals1.retainAll(setOfAnimals2);
        printResultSet(setOfAnimals1);

    }

    static Set<String> createSetOfAnimals1(){
        return new HashSet<>(Arrays.asList("bear","gorilla","zebra","leon","phanter"));
    }

    static Set<String> createSetOfAnimals2(Scanner scanner){
        HashSet<String> animalSet = new HashSet<>();
        String word;
        do {
            word = ScannerManager.leerString(scanner,"enter animal type or introduce the word 'exit'  to finish");
            if (!word.equals("exit")){
                animalSet.add(word);
            }
        }while(!word.equals("exit"));
        return animalSet;
    }

    static void printResultSet(Set<String> resultSet){
        System.out.printf("%s%n",resultSet);
    }

}