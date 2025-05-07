package Section4_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashUtilesEscolares_33 {

    public static void main(String[] args) {

        Set<String> set1 = setSupplies1();
        System.out.printf("setSupplies1 %s%n", setSupplies1());

        Scanner scanner = new Scanner(System.in);
        Set<String> set2 = setSupplies2(scanner);

        set1.removeAll(set2);
        System.out.printf("setSupplies1 %s%n",set2);
        scanner.close();
        imprimirSet(set1);
    }

    static Set<String> setSupplies1(){
        return new HashSet<>(Arrays.asList("lapicero","borrador","lonchera",
                "mochila","corrector","goma","tijera"));
    }

    static Set<String> setSupplies2(Scanner scanner){
        HashSet<String> setDos = new HashSet<>();
        String util;
        do {
            System.out.println("enter school supplie " +
                    "or 'exit' to finish");
            util = scanner.nextLine();
            if (!util.equals("salida")){
                setDos.add(util);
            }
        }while (!util.equals("salida"));

        return setDos;
    }

    static void imprimirSet(Set<String> finalSet){



        System.out.printf("missin %s%n", finalSet);
    }
}