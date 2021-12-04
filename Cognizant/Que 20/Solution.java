import java.util.*;
class Solution
{
    static String str;
    static ArrayList < String > list = new ArrayList < String > ();

    public static void func (int i, String res)
    {
        if (i == str.length ())
        {
        	list.add (res);
	        return;
        }
        if (i > str.length ())
            return;
        if(str.charAt (i) == '0')
            return;
        char ch = (char) ('a' + (str.charAt (i) - '1'));
        
        func (i + 1, res + ch);
    
        if (i != str.length () - 1)
        if (str.charAt (i) < '3' && str.charAt (i + 1) < '7')
	    {
            int a = (str.charAt (i) - '1' + 1), b = (str.charAt (i + 1) - '0');
	        ch = (char) ('a' + (10 * a + b - 1));
	        func (i +     2, res + ch);
	    }
    }

    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        str = sc.next ();
        String res = "";
        func (0, res);
    
        Collections.sort (list);
        for (int i = 0; i < list.size (); i++)
              System.out.println (list.get (i));
    }
}
