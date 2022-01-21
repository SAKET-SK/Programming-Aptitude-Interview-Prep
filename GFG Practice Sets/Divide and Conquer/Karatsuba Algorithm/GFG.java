//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            String A = S[0];
            String B = S[1];

            Solution ob = new Solution();
            System.out.println(ob.karatsubaAlgo(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long karatsubaAlgo(String A, String B) {
        // code here
        long decimal1=Long.parseLong(A,2);  
         long decimal2=Long.parseLong(B,2); 
         return (decimal1*decimal2);
        
        
        
        
    }
};
