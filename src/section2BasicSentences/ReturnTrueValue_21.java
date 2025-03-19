package section2BasicSentences;

import use.RandomUtilities;

import java.util.Random;

public class ReturnTrueValue_21 {
    public static void main(String[] args) {
        Random random = new Random();
        final int randomInt = RandomUtilities.generarRandomInt(10,200, random);
        final boolean oneCondition = askConditionOne(randomInt);
        final boolean twoCondition = askConditionTwo(randomInt);
        printMesages(randomInt, oneCondition,twoCondition);
    }

    static boolean askConditionOne(int n){
        return n % 2 == 0 && n > 50;
    }

    static boolean askConditionTwo(int n){
        return n % 3 == 0 || n <= 35;
    }

    static void printMesages(int n, boolean one, boolean two){
        System.out.printf("number %d is even and greater than 50? %b%n",n,one);
        System.out.printf("number %d is multiples of 3 o is less or equal to 50? %b%n",n,two);
    }
}
