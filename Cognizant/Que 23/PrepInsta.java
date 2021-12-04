import java.util.*;
public class PrepInsta
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int price[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	price[i] = sc.nextInt ();
      }
    Vector < Integer > diff = new Vector <> ();
    for (int i = n - 2; i >= 0; i--)
      {
	diff.add (price[i + 1] - price[i]);
      }
    int ans = solve (diff);
    if (ans < 0)
      {
	System.out.println (0);
      }
    else
      {
	System.out.println (ans);
      }

  }
  private static int solve (Vector < Integer > v)
  {
    int n = v.size ();
    if (n == 0)
      {
	return 0;
      }
    int mx = v.get (0);
    for (int i = 1; i < n; i++)
      {
	mx = Math.max (mx, v.get (i));
      }
    if (mx <= 0)
      {
	return 0;
      }
    int mxSum = 0, csum = 0;
    for (int i = 0; i < n; i++)
      {
	csum += v.get (i);
	if (csum < 0)
	  csum = 0;
	mxSum = Math.max (csum, mxSum);
      }
    return mxSum;
  }
}
