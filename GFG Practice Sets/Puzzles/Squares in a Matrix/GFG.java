// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.squaresInMatrix(m,n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static long squaresInMatrix(int m, int n) {
        // code here
        int minn=0,maxx=0;
        
        if(m>n)
            maxx=m;
        else 
            maxx=n;
            
        if(m>n)
            minn=n;
        else 
            minn=m;
            
        long result=0;
        for(int i=1;i<=minn;i++)
        {
            result+=(minn-i+1)*(maxx-i+1);
        }
        return result;
    }
};
