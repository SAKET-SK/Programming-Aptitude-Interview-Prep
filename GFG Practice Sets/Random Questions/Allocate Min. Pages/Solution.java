// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static  boolean isPossible(int[]A,int N,int M,int mid)
   {
    
    int count =1; 
    int pagesum=0;
    for(int i=0;i<N;i++)
    {
        if(pagesum+A[i]<=mid)
        {
            pagesum+=A[i];
        }
          else
        {
          count++;
          if(count>M||A[i]>mid)
          {
              return false;
          }
          
          pagesum=A[i];
        }  
    }
      return true;
   }
   
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int s=0;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
        }
        int e=sum;
          int mid= s+(e-s)/2;
        while(s<=e)
        {
            if(isPossible(A,N,M,mid))
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
             mid=s+(e-s)/2;
        }
        return mid;
    }
};
