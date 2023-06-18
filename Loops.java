import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Choose program 1, 2, or 3: ");
       int program = scanner.nextInt();

       switch (program) {

        case 1:
        System.out.println("The numbers from 1 to 10 are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        return;

        case 2:
        System.out.println("The even numbers between 1 and 20 are: ");
        int j = 1;
        while (j < 20) {
            if (j % 2 == 0) 
            {
                System.out.println(j);
                j++;
            }
            else 
            {
                j++;
            }
        }
        return;

        case 3:
        int num;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            num = scanner.nextInt();
        } while (num <= 1 || num >= 10);

        System.out.println("You entered: " + num);
        scanner.close();
    }
    return;

       }
}  

