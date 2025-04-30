package Topics;
import java.util.Scanner;

public class ConditionalSwitch {

    public static void main (String[] args)
    {
        System.out.println("Enter a number (1 to 7) to get the day of the week");

        Scanner day = new Scanner(System.in);

        int a = day.nextInt();

        switch (a) 
        {
            case 1:
                System.out.println("It's Sunday");
                break;
            
            case 2:
                System.out.println("It's Monday");
                break;

            case 3:
                System.out.println("It's Tuesday");
                break;

            case 4:
                System.out.println("It's Wednesday");
                break;

            case 5:
                System.out.println("It's Thursday");
                break;

            case 6:
                System.out.println("It's Friday");
                break;

            case 7:
                System.out.println("It's Saturday");
                break;

            default:
                break;
        }

        day.close();
    }
    
}
