// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     static long merge(long arr[],long temp[],int left,int mid,int right)
    {
        long inv_count=0;
        int i = left;
        int j = mid;
        int k = left;
        while((i <= mid-1) && (j <= right)){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
    
        while(i <= mid - 1)
            temp[k++] = arr[i++];
    
        while(j <= right)
            temp[k++] = arr[j++];
    
        for(i = left ; i <= right ; i++)
            arr[i] = temp[i];
        
        return inv_count;
    }
    
    static long merge_Sort(long arr[],long temp[],int left,int right)
    {
        int mid;
        long inv_count = 0;
        if(right > left)
        {
            mid = (left + right)/2;
    
            inv_count += merge_Sort(arr,temp,left,mid);
            inv_count += merge_Sort(arr,temp,mid+1,right);
    
            inv_count += merge(arr,temp,left,mid+1,right);
        }
        return inv_count;
    }
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long temp[] = new long[(int)N];
        long ans = merge_Sort(arr,temp,0,(int)N-1);
        return ans;
    }
}
