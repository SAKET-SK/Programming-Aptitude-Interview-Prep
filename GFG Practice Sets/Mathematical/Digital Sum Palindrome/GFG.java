// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution 
{
   int isDigitSumPalindrome(int N) 
   {
       // code here

       int result = 0;
       int sum = 0;
        while(N > 0)
        {
            result = N % 10;
            sum = sum + result;
            N = N / 10;
            
        }
        
        int t = sum;
        int result2 = 0;
        int rem = 0;
        while(sum > 0)
        {
            rem = sum%10;
            result2 = result2 * 10 + rem;
            sum = sum / 10;
            
       }
       if(result2 != t)
       {
            return 0;
       }
       else
       {
           return 1;
       }    
   }
}
