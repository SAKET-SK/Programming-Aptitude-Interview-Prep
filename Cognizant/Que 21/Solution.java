import java.util.*;
class Solution 
{
    static int n, w;
    static int a[];
    static int b[];
    static int c[];
 
    public static int func (int i, int cb, int t, int ww) 
    {
        if (i == n)
        {
            if ((cb & 1) != 0)
                return 0;
        	else
                return t;
        }
        if (ww + b[i] <= w)
            return Math.max (func (i + 1, cb + c[i], t + a[i], ww + b[i]),func (i + 1, cb, t, ww));
        return func (i + 1, cb, t, ww);
    }

    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt ();
        w = sc.nextInt ();
        int t;
        a = new int[n];
        b = new int[n];
        c = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            t = sc.nextInt ();
            a[i] = sc.nextInt ();
            b[i] = sc.nextInt ();
            c[i] = sc.nextInt ();
        } 
        
        System.out.println (func (0, 0, 0, 0));
    } 
}
