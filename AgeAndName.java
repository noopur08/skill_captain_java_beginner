import java.util.Scanner;

public class AgeAndName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Input your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}



