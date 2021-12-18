import java.util.*;
class Solution
{
      public static boolean isPrime(int no)
      {
            if(no<=1)
                return false;
            if(no<=3)
                return true;
            if((no%2==0) || (no%3==0))
                return false;
            for(int i=5;i*i<=no;i=i+6)
                 if((no%i==0) || (no%(i+2)==0))
                    return false;
           return true;
      }
      public static void main(String[] args)
      {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a Number ");
           int no=sc.nextInt();
           if(isPrime(no))
              System.out.println(no+" is a Prime Number");
           else 
              System.out.println(no+" is not a Prime Number");
      }
}
