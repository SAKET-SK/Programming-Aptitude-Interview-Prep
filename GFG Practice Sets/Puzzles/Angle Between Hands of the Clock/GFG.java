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
            
            int H = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getAngle(H,M));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getAngle(int H , int M) {
        // code here
        double totalmin, hr, min,diff;
        totalmin = H*60+M;
        hr= 0.5*totalmin;
        min = 6*M;
        diff= Math.abs(hr-min);
        diff = Math.min( 360 - diff, diff);
        return (int)Math.floor((int)diff);
        
        
    }
};
