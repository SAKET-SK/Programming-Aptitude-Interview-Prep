import java.util.*;
class Main 
{
    public static int sumNumberDivisible(int m,int n)
    {
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int res=sumNumberDivisible(m,n);
        System.out.println(res);
    }
}
