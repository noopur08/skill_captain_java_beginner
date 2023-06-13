import java.util.Scanner; 
public class Conditions {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int integer1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int integer2 = scanner.nextInt();

        if (integer1 == integer2) 
        {
            System.out.println("Both integers have the same value.");
        }

        else if (integer2 != integer1) 
        {
            int max = integer1;

            if (integer2 > integer1)
            max = integer2;

            System.out.println("The larger integer is: " + max);
            
        }
        
        scanner.close();
    }
    
}
