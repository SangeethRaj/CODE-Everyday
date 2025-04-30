package Topics;
/*
Variables - Named memory locations, they are storage spaces that store data.
These data are used when compiling the code.
Every data stored will use a data type, which determines the type and quantity of the variable.

Data Type - It determines the size and values that can be stored in the variable.

Variable Name - should not start with any Number values and no special characters are allowed other than $ and _

Comment line - used to provide more clarity on code
*/

public class Variables 
{
    public static void main(String[] args) 
    {
        // Integer
        int variable1;  // Variable declaration - declaring variable1 as an integer & memory space is reserved to execute (4 bytes)
        variable1 = 10000000;  // Assigning the value 10000000 to variable1
        variable1 = 20000000;  // Re-assigning the value 20000000 to variable1 - previous value will be replaced

        System.out.println(variable1);  // Output is 20000000

        // Short Int
        short shortVariable;  // Used to store smaller value numbers -32768 to +32767 (2 bytes)
        shortVariable = 10;

        System.out.println(shortVariable);  // Output is 10

        // Char - stores only one character
        char name;
        name = 's';  // Characters must be enclosed in single quotes

        System.out.println(name);  // Output is s

        
        // Escape Sequences

        System.out.println("Sangeethraj\tCode Enthusiast"); //Escape Sequence \t- provides tabbed space

        System.out.println("Sangeethraj\nCode Enthusiast"); //Escape Sequence \n - new line

    }
} 