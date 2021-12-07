import java.util.Scanner;

public class Main
{
    int Calculate (int m, int n)
    {
        int sum = 0;
        for (int i = m; i <= n; i++)
            if ((i % 3 == 0) && (i % 5 == 0))
	            sum = sum + i;
        return sum;
    }
  
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the value of m and n");
        int m = sc.nextInt ();
        int n = sc.nextInt ();
        Main q = new Main ();
        int result = q.Calculate (m, n);
        System.out.println (result);
    }
}
