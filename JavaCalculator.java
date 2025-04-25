import java.util.Scanner;

public class JavaCalculator 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        try 
			{
				while (true) 
					{
						System.out.println("Enter your First Number:");
						double num1 = input.nextDouble();

						System.out.println("Enter your Second Number:");
						double num2 = input.nextDouble();

						System.out.println("Type the Calculation you want to perform:\n" +
								"1. Addition\n" +
								"2. Subtraction\n" +
								"3. Multiplication\n" +
								"4. Division\n" +
								"5. Modulus");

						input.nextLine(); // Clear the buffer
						String c = input.nextLine().toLowerCase();

						double result = 0;

						switch (c) 
							{
								case "addition":
									result = num1 + num2;
									System.out.println("The Sum is " + result);
									break;

								case "subtraction":
									result = num1 - num2;
									System.out.println("The Difference is " + result);
									break;

								case "multiplication":
									result = num1 * num2;
									System.out.println("The Product is " + result);
									break;

								case "division":
									if (num2 != 0) {
										result = num1 / num2;
										System.out.println("The Division is " + result);
									} else {
										System.out.println("Cannot divide by 0.");
									}
									break;

								case "modulus":
									result = num1 % num2;
									System.out.println("The Modulus is " + result);
									break;

								default:
									System.out.println("Invalid Operator! Kindly select the appropriate operator.");
							}//switch

						System.out.println("Do you want to continue? (yes/no)");
						String choice = input.next().toLowerCase();

						if (choice.equals("no")) 
							{
								System.out.println("Thank you for using my JAVA Calculator!");
								break;
							}//if

					}//while

			}//try 
		
				catch (Exception e) 
					{
						System.out.println("You have entered an Invalid Input! Please enter valid numbers.");
					}//catch
			
				finally 
					{
						input.close();
					}//finally
					
    }//method
}//class