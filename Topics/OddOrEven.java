package Topics;
import java.util.Scanner;

public class OddOrEven 
{   
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (true)

        {
            System.out.println("Enter a number to check Even or Odd:");

            int a = input.nextInt();

            if (a % 2 == 0)
                {
                    System.out.println("This is a Even Number");
                    System.out.println("Do you want to continue? (yes/no)");
                }
            else
                {
                    System.out.println("This is an Odd Number");
                    System.out.println("Do you want to continue? (yes/no)");
                }

        String choice = input.next().toLowerCase();

        if (choice.equals("no"))
            {
                System.out.println("Thank you for using this code!");
                break;
            }
        }//while

        input.close();

    }//method
    
}//class
