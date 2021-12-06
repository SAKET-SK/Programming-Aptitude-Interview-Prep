import java.util.*;
public class Solution
{
    public static void main(String[] args)
    {
             Scanner sc=new Scanner(System.in);
             int v=sc.nextInt();
             int w=sc.nextInt();
             float res=((4*v)-w)/2;
             if(w>=2 && (w%2==0) && v<w ) 
               System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
             else
                System.out.println("INVALID INPUT");
    }
}
