import java.util.*;
class Solution 
{
    public static int hammingDistance (int a, int b) 
    {
        int max = a > b ? a : b;
        int count = 0;
        while (max > 0)
        {
            if ((a & 1) != (b & 1))
                count++;
            a = a >> 1;
            b = b >> 1;
            max = max >> 1;
        }
        return count;
    }
  
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();

        System.out.println (hammingDistance (a, b));
    } 
}
