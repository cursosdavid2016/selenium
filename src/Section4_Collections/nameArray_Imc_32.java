package Section4_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class nameArray_Imc_32 {
    public static void main(String[] args) {
        List<String> alto = new ArrayList<>();
        List<String> medio = new ArrayList<>();
        List<String> bajo = new ArrayList<>();

        rellenarListas(alto,medio,bajo,crearArrayNombres(),crearArrayIMC());
    }

    static String[] crearArrayNombres(){
        return new String[] {"Carlos","Antonio","Jorge","Ana","Mayra","Julieta",
                "Maria","Rodrigo","Anabel","Luz"};
    }

    static double[] crearArrayIMC(){
        Random random = new Random();
        return RandomUtilities.generarRandomArrayDouble(10,50,1,random);
    }

    static void rellenarListas(List<String> lAlto,List<String> lMedio,List<String> lBajo,
                               String[] arrNombres, double[] arrIMC){

        for (var i = 0; i < arrIMC.length ; i++) {
            if (arrIMC[i] >= 40){
                lAlto.add(arrNombres[i]);
            }else if (arrIMC[i] >= 25 && arrIMC[i] < 40) {
                lMedio.add(arrNombres[i]);
            }else if(arrIMC[i] < 25) {
                lBajo.add(arrNombres[i]);
            }
        }

        System.out.printf("alto: %s%n: ",lAlto);
        System.out.printf("medio: %s%n: ",lBajo);
        System.out.printf("bajo: %s%n: ",lMedio);
    }

}
