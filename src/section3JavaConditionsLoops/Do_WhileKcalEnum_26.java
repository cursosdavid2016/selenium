package section3JavaConditionsLoops;

import java.util.Scanner;

public class Do_WhileKcalEnum_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day;
        do {
            menuKcal();
            day = ScannerManager.leerString(scanner,"enter week day");
            printResult(day,calcKcal(Weekday.valueOf(day)));
        }while (calcKcal(Weekday.valueOf(day)) != -1);

        scanner.close();
    }


    static void menuKcal() {
        System.out.println(
                "° option: monday \n" +
                        "° option: tuesday \n" +
                        "° option: wednesday \n" +
                        "° option: thursday \n" +
                        "° option: friday \n" +
                        "° option: saturday \n" +
                        "° option: sunday \n" +
                        "° option: exit \n"
        );
    }

    static int calcKcal(Weekday weekday){
        final int  kcal = switch (weekday){
            case monday -> 350;
            case tuesday -> 420;
            case wednesday -> 220;
            case thursday -> 600;
            case friday -> 125;
            case saturday -> 250;
            case sunday -> 100;
            case exit -> -1;
        };
        return kcal;
    }

    static void printResult(String day, int kcal){
        if (kcal != -1){
            System.out.printf("for the day: %s you must burn %dkcal",day,kcal);
        }else System.out.println("enter a correct day");

    }

    enum Weekday {
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday,
        exit
    }
}
