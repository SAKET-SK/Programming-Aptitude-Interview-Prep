//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

 class Solution{
    static long minTime(int[] arr,int n,int k){
        long lo = Long.MIN_VALUE;
        long hi = 0;
        for(int i=0;i<n;i++){
            lo = Math.max(lo,arr[i]);
            hi += arr[i];
        }
        
        
        long ans = -1;
        while(lo<=hi){
            long mid = (lo+hi)/2;
            
            if(isAllocationPossible(mid,arr,k)){
                ans = mid;
                hi = mid-1;
            }else lo = mid+1;
        }
        
        return ans;
    }
    
    static boolean isAllocationPossible(long cutOff,int[] arr,int k){
       
        
        
        long time = 0;
        int painters = 1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>cutOff)return false;
            if(time+arr[i]>cutOff){
                painters++;
                time = arr[i];
            }else time += arr[i];
        }
        
        return painters<=k;
    }
}
