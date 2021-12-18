import java.util.*;
class Main 
{
    public static void sortArray(int len,int arr[])
    {
        int i=0,j=0,temp=0;
        for(i=0;i<len;i++)
        {
            int countOfSwap=0;
            for(j=0;j<len-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    countOfSwap++;
                }
            }
            if(countOfSwap==0)
                break;
        }
    }
    public static int findMaxElement(int len1, int arr1[],int len2,int arr2[]) 
    {
        sortArray(len1,arr1);
        sortArray(len2,arr2);
        if(arr1[len1-1]>arr2[len2-1])
            return arr1[len1-1];
        else 
            return arr2[len2-1];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len1=sc.nextInt();
        int arr1[]=new int[len1];
        for(int i=0;i<len1;i++)
            arr1[i]=sc.nextInt();
        
        int len2=sc.nextInt();
        int arr2[]=new int[len2];
        for(int i=0;i<len2;i++)
            arr2[i]=sc.nextInt();
        
        int ans=findMaxElement(len1,arr1,len2,arr2);
        System.out.println(ans);
    }
}
