//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0)
        {
            int A = in.nextInt();
            int B = in.nextInt();
            int K = in.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.kthDigit(A,B,K));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long kthDigit(int A,int B,int K){
        // code here
        long num=(long)(Math.pow(A,B));
        long div=num;
        long sum=0;
        String s="";
        while(div!=0){
                s+=div%10;
            div=div/10;
        }
      String k="";
      k+=(s.charAt(K-1));
        
        return Long.parseLong(k);
        
    }
}
