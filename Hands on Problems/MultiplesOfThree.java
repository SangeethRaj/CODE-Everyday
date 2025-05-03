import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int i = 1;
        System.out.println("Multiples of 3 up to " + n + ":");

        do {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);

        input.close();
    }
}
