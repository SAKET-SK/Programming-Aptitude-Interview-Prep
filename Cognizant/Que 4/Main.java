import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter the no. of students placed in CSE: ");
        int cse = sc.nextInt();

        System.out.print("Enter the no. of students placed in ECE: ");
        int ece = sc.nextInt();

        System.out.print("Enter the no. of students placed in MECH: ");
        int mech = sc.nextInt();

        sc.close();
       // If any integer is negative, print message and exit
        
        if (cse < 0 || ece < 0 || mech < 0)
        {
            System.out.println("Input is Invalid");          
        }
       // If all values are equal, print message and exit
        else
        {        
            if (cse == ece && ece == mech && mech==cse)
            {
                System.out.println("None of the department has got the highest placement");        
            }
            //System.out.println("Highest Placement:");
             // First, check if any two values are equal and greater than the third
            else if (cse == ece && cse > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
                System.out.println("ECE");
            }
            else if (cse == mech && cse > ece)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
                System.out.println("MECH");
            }
            else if (ece == mech && ece > cse)
            {
                System.out.println("Highest Placement:");
                System.out.println("ECE");
                System.out.println("MECH");
            }
            // Now, if we reached here, all values are distinct
            // Check if one value is greater than both
            else if (cse > ece && cse > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("CSE");
            }
            else if (ece > mech)
            {
                System.out.println("Highest Placement:");
                System.out.println("ECE");
            }
            else
            {
                System.out.println("Highest Placement:");
                System.out.println("MECH");
            }
        }
   }

}
