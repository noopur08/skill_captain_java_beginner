import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] integers = new int[5];

        System.out.println("Enter 5 integer values: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Value " + (i+1) + ": ");
            integers[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int integer : integers) 
        {
            sum = sum + integer;
        }

        double avg = sum / integers.length;

        int max = integers[0];
        int min = integers[0];

        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }

            if (integers[i] < min) {
                min = integers[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        scanner.close();
    }
}