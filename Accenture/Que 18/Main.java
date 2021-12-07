import java.util.*;
class Main 
{
 
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();
        float firstDiff =(float) Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        float secondDiff =(float) Math.sqrt (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2));
        float thirdDiff =(float) Math.sqrt (Math.pow (x3 - x1, 2) + Math.pow (y3 - y1, 2));

        System.out.println (firstDiff + secondDiff + thirdDiff);
    } 
}
