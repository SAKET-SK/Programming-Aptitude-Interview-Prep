//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());
            Solution ob = new Solution();
            int ans=ob.fibonacciDigits(N);
            if(ans/10>0)
             System.out.println(ans);
            else
             System.out.println("0"+ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int fibonacciDigits(long N){
        //code here
        
        
     int f[ ] = new int[300];
     f[0]=0;
     f[1]=1;
     for( int i=2;i<300;i++)
     {
         f[i]=(f[i-1]+f[i-2])%100;
         /* Add the previous 2 numbers in
        the series and store last two
        digits of result (divideby100)*/
     }
     int s = (int) Math.abs(N%300);
     // Returns last two digits of n'th
    // Fibonacci Number
     return f[s];
       
    }
}
//https://www.geeksforgeeks.org/program-find-last-two-digits-nth-fibonacci-number/
