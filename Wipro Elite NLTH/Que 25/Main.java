import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        System.out.println(max+min);
    }
}
