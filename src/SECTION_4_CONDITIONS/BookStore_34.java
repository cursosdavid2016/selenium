package SECTION_4_CONDITIONS;

import javax.print.attribute.standard.PrinterInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookStore_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Double> bookHashMap = bookStoryInventory();

       // searchBookPrice(bookHashMap,scanner);
        int option;
        do {
           option = Menu(scanner);

                switch (option){
                    case 1 :
                        updateBooksPrice(bookHashMap,scanner);
                        break;
                    case 2 :
                        deleteBook(bookHashMap,scanner);
                        break;
                    case 3 :
                        printHashMap(bookHashMap);
                        break;
                    case 4 :
                        searchBookPrice(bookHashMap,scanner);
                        break;
                    default:
                        System.out.println("bad chooise");

                }

        }while(option != 5);

        scanner.close();
    }

    static int Menu(Scanner scanner){
        int option = ScannerManager.leerInt(scanner,"   MENU\n" +
                "   1: Update\n" +
                "   2: Delete\n" +
                "   3: show book list\n"+
                "   4: search a book in the list\n"+
                "   5: exit\n");
        scanner.nextLine();
        return option;
    }

    static Map<String,Double> bookStoryInventory(){
        // Correct way to create a mutable HashMap:
        Map<String, Double> bookHashMap = new HashMap<>();

        // Inicializa el HashMap con algunos libros (ejemplo):
        bookHashMap.put("The Lord of the Rings", 25.99);
        bookHashMap.put("Pride and Prejudice", 12.50);
        bookHashMap.put("To Kill a Mockingbird", 15.75);
        bookHashMap.put("Quiet",20.05);
        bookHashMap.put("Atomic Habits",9.55);
        // Llama a tu función para actualizar el precio

        return bookHashMap;
    }

    static void printHashMap(Map<String,Double> map){
        System.out.printf("%s%n", map);
    }

    static void searchBookPrice(Map<String,Double> bookMap, Scanner scanner){
        String book = ScannerManager.leerString(scanner,"enter the name of the book to search");

        if (bookMap.containsKey(book)) {
            System.out.printf("for the book %s the price is: %.2f%n",book,bookMap.get(book));
        }else {
            System.out.println("book it's not present on the book Store");
        }
    }

    static void updateBooksPrice(Map<String,Double> bookHashMap,Scanner scanner){
        String updateBook = ScannerManager.leerString(scanner,"please enter the book's name to update");
                if (bookHashMap.containsKey(updateBook)){
                double newPrice = ScannerManager.leerDouble(scanner,"introduce the new price please");
                    System.out.println(newPrice);
                    bookHashMap.put(updateBook,newPrice);
                }
                else {
                    char decition = ScannerManager.leerChar(scanner,"the book its not on the list, would you like to add 'Y' 'N'");
                    if (decition == 'y'){
                        double price = ScannerManager.leerDouble(scanner,"introduce the price for the new book, please");
                        bookHashMap.put(updateBook,price);
                    }else {
                        System.out.println("i'll see you soon, have a nice day :)");
                    }
                }

        System.out.printf("%s%n",bookHashMap);

    }

    static void deleteBook(Map<String,Double> bookHashMap,Scanner scanner){
        String book = ScannerManager.leerString(scanner,"book to delete");
        if (bookHashMap.containsKey(book)){
            bookHashMap.remove(book);
            System.out.printf("the book $s was delete from the list, the new LIST IS: %n",book);
            System.out.printf("%s",bookHashMap);
        }else {
            System.out.printf("the book %s is not include in the list%n",book);
        }
    }

}
