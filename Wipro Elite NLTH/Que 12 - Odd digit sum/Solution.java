import java.util.*;
class Solution
{
      public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           long no=sc.nextLong();
           long sum=0;
           while(no>0)
           {
                 if((no%10)%2!=0)
                      sum=sum+no%10;
                  no=no/10;
           }
           System.out.println(sum);
      }
}
