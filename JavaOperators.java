public class JavaOperators
{
	public static void main (String[] args)
	{
		int a = 10;
		int b= 3;

		System.out.println("The Sum is "+(a+b));
		System.out.println("The Difference is "+(a-b));
		System.out.println("The Product is "+(a*b));
		System.out.println("The Division is "+(a/b));
		System.out.println("The Modulus is "+(a%b));
		System.out.println("a == b? " + (a == b));
        System.out.println("a > b? " + (a > b));
        
        boolean result = (a > 5 && b < 5);

        System.out.println("Result of (a > 5 && b < 5): " + result);

	}
}