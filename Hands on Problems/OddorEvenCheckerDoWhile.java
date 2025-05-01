import java.util.Scanner;

public class OddorEvenCheckerDoWhile {
    public static void main (String[] args)
    {
        Scanner var = new Scanner(System.in); 

        String choice;

        do 
        {
            System.out.println("Enter a Number: ");
            int a = var.nextInt();

            if (a%2==0)
            {
                System.out.println("The Given value is Even Number");
            }
            else
            {
                System.out.println("The Given value is Odd Number");
            }

            System.out.println("Do you want to continue? (yes/no)");
            choice = var.next();

        }
        while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using our program! :)");

        var.close();
    }
}
