package Section4_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ratingsNameList_32 {
    public static void main(String[] args) {
        List<String> salonNOtasAltas = new ArrayList<>();
        List<String> salonNOtasMedias = new ArrayList<>();
        List<String> salonNOtasBajas = new ArrayList<>();

        rellenarListaNotas(crearArrayNombres(),crearArrayNotas(),
                salonNOtasAltas,salonNOtasMedias,salonNOtasBajas);
    }

    static String[] crearArrayNombres(){
        return new String[] {"Carlos","Antonio","Jorge","Ana","Mayra","Julieta","Maria",
        "Rodrigo","Anabel","Luz"};
    }

    static int[] crearArrayNotas(){
        return RandomUtilities.generarRandomArrayInt(10,20,1,new Random());
    }

    static void rellenarListaNotas(String[] nombre, int[] nota,
                                   List<String> alto, List<String> medio, List<String> bajo){
        int n = nombre.length;
        for (var i = 0; i < n; i++) {
            if (nota[i] >= 16){
                alto.add(nombre[i]);
            } else if (nota[i] >= 10 && nota[i] < 16) {
                medio.add(nombre[i]);
            }else {
                bajo.add(nombre[i]);
            }
        }

        System.out.printf("members with high scores: %s%n",alto);
        System.out.printf("members with average scores: %s%n",medio);
        System.out.printf("members with low scores: %s%n",bajo);
    }
}
