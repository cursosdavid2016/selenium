package SECTION_4_CONDITIONS;

import java.util.Map;
import java.util.Scanner;

public class GroseryStore_Map_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toy;
        double totalPrice=0;
        Map<String,Double> toysMap = createMap();

        do {
            System.out.println("            Select a toy:\n" +
                    "           \"robot\",15.21,\n" +
                    "           \"pelota\", 23.12,\n" +
                    "           \"carro\",11.68,\n" +
                    "           \"oso\",5.84,\n" +
                    "           \"baraja\",9.99,\n" +
                    "           \"bateria\",43.12\n"+
                    "           \"exit");
            toy = scanner.nextLine();
            if (!toy.equals("exit")){
                totalPrice += priceCalculation(toysMap,toy);
            }

        }while(!toy.equals("exit"));

        scanner.close();
        System.out.printf("price is: %.2f%n",totalPrice);
    }

    static Map<String, Double> createMap(){
        return Map.of(
                "robot",15.21,
                "pelota", 23.12,
                "carro",11.68,
                "oso",5.84,
                "baraja",9.99,
                "bateria",43.12
        );
    }

    static double priceCalculation(Map<String,Double> toysMap,String toy){
        return toysMap.get(toy);
    }

}
