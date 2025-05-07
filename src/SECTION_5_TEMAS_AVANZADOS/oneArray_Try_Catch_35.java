package SECTION_5_TEMAS_AVANZADOS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class oneArray_Try_Catch_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        //create random array
        int[] array = RandomUtilities.generateRandomArrayInt(5,10,100,new Random());

        do {
            showArray(array);
            index = ScannerManager.leerInt(scanner,"enter index or insert '-1' to exit");
            showElement(index,array);



        }while (index != -1);
        scanner.close();
    }

    static void showArray(int[] array){
        System.out.printf("the array is %s%n", Arrays.toString(array));
    }

    static void showElement(int i, int[] array){
        try {
            final int element = array[i];
            System.out.printf("for the position %s the value is: %s%n",i,array[i]);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("you can access to this position");
            System.err.printf("IndexOutOfBoundsException %s%n", indexOutOfBoundsException.getMessage());
        }

    }

}
