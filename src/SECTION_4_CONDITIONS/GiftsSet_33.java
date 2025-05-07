package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GiftsSet_33 {
    public static void main(String[] args) {
        final HashSet<String> setFirstGroup =
                new HashSet<>(Arrays.asList("oso","carro","patito","leon","pelota"));
        final Set<String> setSecondGroup = createSetSecondGroup();

        setFirstGroup.addAll(setSecondGroup);
        printSets(setFirstGroup);
    }

    static Set<String> createSetSecondGroup(){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> setSecondGroup = new HashSet<>();
        String word;
        do {
            word = ScannerManager.leerString(scanner,
                    "enter the word 'yes' to add a gift or 'exit' to finish");
            if (word.equals("yes")){
                String name = ScannerManager.leerString(scanner,
                        "enter the name of the person to whom the gift will be given");
                setSecondGroup.add(name);
            }
        }while (!word.equals("exit"));
        System.out.printf("names are: %s%n",setSecondGroup);

        return setSecondGroup;
    }

    static void printSets(Set<String> allSet){
        System.out.printf("%s%n",allSet);
    }

}
