import java.util.*;
public class StringReduction
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String str = sc.next ();
      TreeSet < Character > list = new TreeSet < Character > ();
    for (int i = 0; i + 1 < str.length (); i++)
      {
	String prefix = str.substring (0, i);
	String suffix = str.substring (i + 1, str.length ());
	char ch = str.charAt (i);
	if (prefix.indexOf (ch) != -1 || suffix.indexOf (ch) != -1)
	    list.add (ch);
      }
    if (str.substring (0, str.length () - 1).
	indexOf (str.charAt (str.length () - 1)) != -1)
        list.add (str.charAt (str.length () - 1));
    Iterator itr = list.iterator ();
    while (itr.hasNext ())
      {
	System.out.print ((Character) itr.next ());
      }
  }
}
