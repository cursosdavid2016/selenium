package section3JavaConditionsLoops;

import java.util.Scanner;

public class SwitchKcalEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuKcal();
        String day = ScannerManager.leerString(scanner,"enter day of the week");
        scanner.close();

        printResult(day,calcKcal(Weekday.valueOf(day)));
    }

    static void menuKcal() {
        System.out.println(
                "° option: monday \n" +
                "° option: tuesday \n" +
                "° option: wednesday \n" +
                "° option: thursday \n" +
                "° option: friday \n" +
                "° option: saturday \n" +
                "° option: sunday \n"
        );


    }

    static int calcKcal(Weekday weekday){
        final int kcal = switch (weekday){
            case monday -> 350;
            case tuesday -> 420;
            case wednesday -> 220;
            case thursday -> 600;
            case friday -> 125;
            case saturday -> 250;
            case sunday -> 100;
        };
        return kcal;
    }

    static void printResult(String day, int kcal){
        if (kcal != -1){
            System.out.printf("for the day: %s you must burn %dkcal",day,kcal);
        }else System.out.println("enter a correct day");

    }

    enum Weekday{
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday
    }
}
