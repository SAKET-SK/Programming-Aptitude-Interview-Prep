import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<m;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+arr[i][j];
            }
            System.out.println("Row "+(i+1)+" : "+sum);
            if(sum>max)
            {
                max=sum;
                index=i+1;
            }
        }
        
        System.out.println("Row "+index+" is having the maximum sum : "+max);
    }
}
