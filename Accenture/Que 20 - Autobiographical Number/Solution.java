import java.util.*;
class Solution 
{
  
    public static int findAutoCount (String n) 
    {
        int sum = 0;
    
        for (int i = 0; i < n.length (); i++)
            sum = sum + Integer.parseInt (n.charAt (i) + "");

        if (sum == n.length ())
        {
            int count = 0;
            int arr[] = new int[10];
            for (int i = 0; i < n.length (); i++)
                arr[Integer.parseInt (n.charAt (i) + "")]++;

            for (int i = 0; i < arr.length; i++)
                if (arr[i] != 0)
                    count++;
            return count;
        }
        else
            return 0;
    }
 
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();

        System.out.println (findAutoCount (str));
    } 
}
