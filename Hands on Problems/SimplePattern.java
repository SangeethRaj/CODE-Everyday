import java.util.Scanner;

public class SimplePattern {
    public static void main (String [] args)
    {
        System.out.print("Enter the number of rows: ");
        
        Scanner var = new Scanner(System.in);

        int length = var.nextInt();

        for ( int i = 1; i <= length; i++)
        {
            for ( int j = 1; j <= i; j++)
            {
                System.out.println("* ");
            }
            System.out.println();
        }

        var.close();
    }
    
}
