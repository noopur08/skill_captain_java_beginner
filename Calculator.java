import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = scanner.nextDouble();

        System.out.print("Enter operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);

        double ans = 0.0; //initialising

        switch (operation) {
            //cases 1,2,3,4,5 or default(unspecified input)
            case '+':
                ans = n1 + n2;
                break;

            case '-':
                ans = n1 - n2;
                break;

            case '*':
                ans = n1 * n2;
                break;

            case '/':
                if (n2 == 0) 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; 
                } 
                else 
                {
                    ans = n1 / n2;
                }
                break;

            case '%':
                ans = n1 % n2;
                break;

            default:
                System.out.println("Error: Invalid operation.");
                return;

        }

        System.out.println("Output:\n" + ans);
        scanner.close();
    }
}
