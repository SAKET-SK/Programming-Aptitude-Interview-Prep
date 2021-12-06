import java.util.*;
class Solution
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt ();
        int e[] = new int[t];
        int l[] = new int[t];

        for (int i = 0; i < t; i++)
            e[i] = sc.nextInt ();

        for (int i = 0; i < t; i++)
            l[i] = sc.nextInt ();

        int max = 0, sum = 0;
        for (int i = 0; i < t; i++)
        {
	        sum += e[i] - l[i];
	        max = Math.max (sum, max);
        }
        System.out.println (max);
    }
}
