import java.util.Scanner;

public class JavaCalculator
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		System.out.println("Enter your First Number");
		double num1 = input.nextDouble();

		System.out.println("Enter your Second Number");
		double num2 = input.nextDouble();

        System.out.println("Type the Calculation you want to perform\n" +
                   "1. Addition\n" +
                   "2. Subtraction\n" +
                   "3. Multiplication\n" +
                   "4. Division\n");

        char c = input.next().toUpperCase().charAt(0);
		
		input.close();
		
		double result = 0;
		
		switch (c) 
		{
		    case 'A':
		        result = num1 + num2;
		        System.out.println("The Sum is "+result);
		        break;
		        
		    case 'S':
		        result = num1 - num2;
		        System.out.println("The Difference is "+result);
		        break;
		        
		    case 'M':
		        result = num1 * num2;
		        System.out.println("The Product is "+result);
		        break;
		        
		    case 'D':
		        if (num2 != 0) 
		        {
		            result = num1 / num2;
		            System.out.println("The Division is "+result);
		        } else
		        {
		            System.out.println("The number cannot be divisible by 0");
		            return;
		        }
		        break;
		        
		    default:
		        System.out.println("Invalid Operator! Kindy select the appropriate operator.");
		} //switch
	} //method
}//class