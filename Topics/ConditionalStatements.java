package Topics;
import java.util.Scanner;

public class ConditionalStatements {

    public static void main (String[] args)
    {
        Scanner var = new Scanner(System.in);

        System.out.println("Enter Your age");

        //if condition

        int age = var.nextInt();

        if (age >= 18)
        {
            System.out.println("You are eligible to Vote.");
        }
        else
        {
            System.out.println("you are not eligible to Vote");
        }

        // if else

        int marks = var.nextInt();

        System. out.println("Enter your marks out of 100");

        if (marks >= 20 && marks<=30)
        {
            System.out.println("You are not eligible to PASS with grades");
        }

        else if (marks >= 30 && marks <= 60 ) 
        {
            System.out.println("You are passed with grade C");
        }

        else if (marks >= 60 && marks <= 80)
        {
            System.out.println("You are passed with grade B");
        }

        else if ( marks >= 80)
        {
            System.out.println("You are passed with Distinction");
        }

        else 
        {
            System.out.println("Fail in the exams");
        }

        var.close();

    }
    
}
