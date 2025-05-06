import java.util.Scanner;

public class SimplePatternDoWhile 
{
    public static void main (String[] args)
    {
        Scanner var = new Scanner(System.in);

        int a = var.nextInt();

        System.out.println("Enter Your Number: ");

        int i = 0;

        do { 

            int j = 0;
                do
                {
                    System.out.print("* ");
                    j++;
                } 
                while (j <= i);
                i++;

                System.out.println();
            }
            while ( i <= a);

            var.close();
    }
}
