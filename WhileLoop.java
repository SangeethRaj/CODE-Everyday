public class WhileLoop 
{
    public static void main (String[] args)
    {
        int i = 1; int a = 10;

        while (i<=5)
        {
            System.out.println("The value is "+i);
            i++;
        }

        while (a>=1)
        {
            System.out.println("The value is "+a);
            a--;
        }

        // while loop to print even numbers

        int b=2;

        while (b<=20)
        {
            System.out.println("The even number is"+b);
            b = b+2;
        }
    }   
}
