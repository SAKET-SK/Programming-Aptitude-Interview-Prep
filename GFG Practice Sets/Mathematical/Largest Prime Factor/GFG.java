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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int primeno(long x)
    {
        int p=0;
        for(long j=1;j<=x;j++)
        {
            if(x%j==0)
            p++;
        }
        return p;
    }
    static long largestPrimeFactor(int N) {
        // code here
        long i; long ans=0;
        for(i=1;i<=N;i++)
        {
            int p=0;
            if(N%i==0)
            {
               
        for(long j=1;j<=i;j++)
        {
            if(i%j==0)
            p++;
        }
                
            }
            if(p==2)
            ans=i;
            
            
        }
        return ans;
    }
}
