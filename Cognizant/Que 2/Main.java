import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {
        int totalprice;
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the no of pizzas bought:");
        int pizza = sc.nextInt ();

        System.out.print ("Enter the no of puffs bought:");
        int puffs = sc.nextInt ();

        System.out.print ("Enter the no of cool drinks bought:");
        int coolDrinks = sc.nextInt ();

        int pizzaa = Math.abs (pizza) * 100;
        int puffss = Math.abs (puffs) * 20;
        int coolDrinkss = Math.abs (coolDrinks) * 10;

        System.out.println ("Bill Details");
        System.out.println ("No of pizzas:" + pizza);
        System.out.println ("No of puffs:" + puffs);
        System.out.println ("No of cooldrinks:" + coolDrinks);
      
        totalprice = pizzaa + puffss + coolDrinkss;
        System.out.println ("Total price=" + totalprice);
        System.out.println ("ENJOY THE SHOW!!!");
    }
}
