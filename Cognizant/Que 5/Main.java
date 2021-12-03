import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
    public static void main (String[]args)
    {
        int noTicket;
        double total = 0, cost;
        String ref, co, circle;
        Scanner s = new Scanner (System.in);

        System.out.println ("Enter the no of ticket:");
        noTicket = s.nextInt ();
    
        if (noTicket < 5 || noTicket > 40)
        {
	        System.out.println ("Minimum of 5 and Maximum of 40 tickets");
	        System.exit (0);
        }
    
        System.out.println ("Do you want refreshment:");
        ref = s.next ();
    
        System.out.println ("Do you have coupon code:");
        co = s.next ();
    
        System.out.println ("Enter the circle:");
        circle = s.next ();
    
        if (circle.charAt (0) == 'k')
            cost = 75 * noTicket;
        else if (circle.charAt (0) == 'q')
            cost = 150 * noTicket;
        else
        {
	        System.out.println ("Invalid Input");
	        return;
        }
        total = cost;

        if (noTicket > 20)
            cost = cost - ((0.1) * cost);
        total = cost;
        
        if (co.charAt (0) == 'y')
            total = cost - ((0.02) * cost);

        if (ref.charAt (0) == 'y')
            total += (noTicket * 50);
    
        System.out.format ("Ticket cost:%.2f", total);
    }
}
