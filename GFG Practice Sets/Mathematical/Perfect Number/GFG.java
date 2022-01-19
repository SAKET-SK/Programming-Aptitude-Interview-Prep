//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(Long N) {
        // code here
        if(N==1)
        return 0;
        
        int sum=1;
        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if(N%i==0)
        {
            sum+=i;
            sum+=N/i;
        }
        }
        return sum==N?1:0;
    }
};
