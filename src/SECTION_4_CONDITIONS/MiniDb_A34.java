package SECTION_4_CONDITIONS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniDb_A34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id;
        do {
            id = ScannerManager.leerInt(scanner,"enter the id of the user");
            if (id != -1){
                showUser(id,createMap());
            }
        }while(id != -1);
        scanner.close();
    }

    static Map<Integer,String> createMap(){
       return Map.of(
                1,"coco",
               2,"socrates",
               3,"calvario",
               4,"kity",
               5,"JavaJavaDu",
               6, "rexxes"
       );
    }

    static void showUser(int id,Map<Integer,String> userMap){
        if (userMap.containsKey(id)){
            System.out.printf("for id: %d the userName is: %s%n",id,userMap.get(id));
        }else {
            System.out.println("ID is not present in the DB");
        }
    }
}
