import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main
{

    static int palindrome (int no1)
    {
        int rem = 0;
        int div = no1;
        while (div != 0)
        {
	        int r = div % 10;
	        rem = (rem * 10) + r;
	        div = div / 10;
        }
        return rem;
    }
  
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter Upper and Lower Limit");
        int ul = sc.nextInt ();
        int ll = sc.nextInt ();
        
        for (int i = ul; i <= ll; i++)
        {
	        if (i == palindrome (i))
	            System.out.print(i+" ");
        }
    }
}
