package SECTION_4_CONDITIONS;

import java.util.Arrays;
import java.util.*;

public class Sets_33 {
    public static void main(String[] args) {
        final HashSet<Integer> setNumeros = new HashSet<>(Arrays.asList(2,3,4));
        final HashSet<String> setNombres =
                new HashSet<>(Arrays.asList("uno","dos","tres"));

        for (String nombre: setNombres){
            System.out.printf("nombre %s%n",nombre);
        }
    }

    static void setNombres(Set<String> setNombres){
        for (String nombre: setNombres){
            System.out.printf("nombre: %s%n",setNombres);
        }
    }

    static Set<Integer> setNumeros(){
        return new HashSet<>(Arrays.asList(1,2,3,4));
    }

    static Set<Integer> unionSets(){
        final HashSet<Integer> setUno = new HashSet<>(Arrays.asList(1,2,3));
        final HashSet<Integer> setDos = new HashSet<>(Arrays.asList(6,2,7));

        setUno.addAll(setDos);
        System.out.printf("union: %s%n",setUno);
        return setUno;
    }


    static Set<Integer> intercepcionSets(){
        final HashSet<Integer> setUno = new HashSet<>(Arrays.asList(1,2,3));
        final HashSet<Integer> setDos = new HashSet<>(Arrays.asList(6,2,7));

        setUno.retainAll(setDos);
        System.out.printf("intercepción: %s%n",setUno);
        return setUno;
    }

    static Set<Integer> removerDosdeUnoSets(){
        final HashSet<Integer> setUno = new HashSet<>(Arrays.asList(1,2,3));
        final HashSet<Integer> setDos = new HashSet<>(Arrays.asList(6,2,7));

        setUno.removeAll(setDos);
        System.out.printf("intercepción: %s%n",setUno);
        return setUno;
    }

}
