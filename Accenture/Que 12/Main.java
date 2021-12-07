import java.util.*;
class Main 
{
    public static int count (int i) 
    {
        int count = 0;
    
        while (i % 2 == 0 && i != 0)
        {
            count += 1; 
            i = i / 2;
        }
        return count;
    }

    public static int maxExponents (int a, int b)
    {
        int max = 0, num = 0, ans;
        for (int i = a; i <= b; i++)
        {
            int temp = count (i);
            if (temp > max)
            {
                max = temp;
                num = i;
            }
        }
        return num;
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();

        System.out.println (maxExponents(a, b));
    }
}
