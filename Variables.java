/* Variables - Named memory location, It is a storage space that stores a variable data. 
These data are used when compiling the code.
Every data stored will use the data types, which determintes the type & quantity of the variable

Data Type - It determines the size and values that can be stored in the variable.

 */

public class Variables 
{

    public static void main ( String args[]) 
    {
        // Integer

        int variable1;            // Variable declarration - declaring variable1 as an integer & memory space were reserved to execute (4 bytes)
        variable1 = 10000000;     // assigning the value 10000000 to variable1

        variable1 = 20000000;    // re-assigning the value 20000000 to variable1 - previous value will be replaced

        System.out.println(variable1);      // Output is 20000000

        // Short Int

        short shortVariable;       // used to store less value numbers -32768 to +32786 (2 bytes)
        shortVariable = 10;        // 

        System.out.println(shortVariable);      // Output is 10

        // Char - stores only one character

        char name;
        name = S;

        System.out.println(name);
    }
    
}
