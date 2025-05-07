public class EligibleToVote 
{
    public static void CheckAge (Integer age)	
    {
        System.debug('Enter your age: ');
        
        if (age <= 18)
        {
            System.debug('You are not eligible to vote');
        }
        else
        {
            System.debug('You are eligible to vote');
        }
    }
}