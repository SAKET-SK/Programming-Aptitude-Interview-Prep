import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter the digits: ");
    
        int a = in.nextInt ();
        int b = in.nextInt ();
        int c = in.nextInt ();
        int d = in.nextInt ();

        char q = (char) a;
        char w = (char) b;
        char e = (char) c;
        char r = (char) d;

        System.out.println ();
        System.out.print (a);
        System.out.println ("-" + q);

        System.out.print (b);
        System.out.println ("-" + w);

        System.out.print (c);
        System.out.println ("-" + e);

        System.out.print (d);
        System.out.println ("-" + r);
    }
}
