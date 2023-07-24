import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unique Number Checker");
        System.out.println("---------------------");
        System.out.print("Enter a series of numbers (separated by spaces): ");
        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s+");

        Set<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("\nNumber\t\tStatus");
        System.out.println("------------------------");

        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);

            if (uniqueNumbers.contains(number)) {
                System.out.println(number + "\t\tDuplicate");
            } 
            
            else {
                uniqueNumbers.add(number);
                System.out.println(number + "\t\tUnique");
            }
        }

        scanner.close();
    }
}
