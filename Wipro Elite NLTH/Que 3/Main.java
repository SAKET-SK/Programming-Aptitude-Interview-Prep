import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a,ans=-1;
        
        int sum=0,max=Integer.MAX_VALUE;
        for(int i=0;i<row;i++)
        {
            sum=0;
            for(int j=0;j<col;j++)
            {
                a=sc.nextInt();
                sum=sum+a;
            }
            if(max>sum)
            {
                max=sum;
                ans=i+1;
            }
        }
        System.out.println(ans);
    }
}
