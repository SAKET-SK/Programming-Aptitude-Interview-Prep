import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int odd=0,even=0;
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
                even=even+rem;
            else 
                odd=odd+rem;
            num=num/10;
        }
        
        System.out.println(Math.abs(even-odd));
    }
}
