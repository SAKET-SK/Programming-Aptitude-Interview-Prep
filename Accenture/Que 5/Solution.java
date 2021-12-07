import java.util.*;
class Solution 
{
    public static int differenceOfSum (int m, int n) 
    {
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= m; i++)
        {
            if (i % n == 0)
                sum1 = sum1 + i;
    	    else    
                sum2 = sum2 + i;
        }
        return Math.abs (sum1 - sum2);
    }
  
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int m = sc.nextInt ();
        System.out.println (differenceOfSum (m, n));
    } 
}
