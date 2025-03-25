package section3JavaConditionsLoops;

import java.util.Scanner;

public class SwitchKcalories_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuKcal();
        String day = ScannerManager.leerString(scanner,"enter day of the week");
        scanner.close();

        printResult(day,calcKcal(day));
    }

    static void menuKcal() {
        System.out.println(
                "° option: lunes \n" +
                "° option: martes \n" +
                "° option: miercoles \n" +
                "° option: jueves \n" +
                "° option: viernes \n" +
                "° option: Sabado \n" +
                "° option: domingo \n" +
                "° just write first letter \n"
        );


    }

    static int calcKcal(String day){
        final int kcal = switch (day){
            case "lu" -> 350;
            case "ma" -> 420;
            case "mi" -> 220;
            case "ju" -> 600;
            case "vi" -> 125;
            case "sa" -> 250;
            case "do" -> 100;
            default -> -1;
        };
        return kcal;
    }

    static void printResult(String day, int kcal){
        if (kcal != -1){
            System.out.printf("for the day: %s you must burn %dkcal",day,kcal);
        }else System.out.println("enter a correct day");

    }

}
