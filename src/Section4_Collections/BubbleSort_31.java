package Section4_Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort_31 {

    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        int[] array1 = bubblesort(array);

    }

    static int[] bubblesort(int[] messyArray){
        final int n = messyArray.length;
        //int[] orderlyArray = new int[n];
        int aux,rigth,left;
        for (var i = 0; i < n-1; i++) {

            for (var j = 0; j < n-1; j++) {
                //left = messyArray[j];
                //rigth = messyArray[j+1];
                if (messyArray[j] > messyArray[j+1]){
                    aux = messyArray[j];
                    messyArray[j] = messyArray[j+1];
                    messyArray[j+1] = aux;
                }
            }
        }
        System.out.printf(Arrays.toString(messyArray));
        return messyArray;
    }
}
