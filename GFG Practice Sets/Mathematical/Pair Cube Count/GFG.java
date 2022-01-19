//Initial Template for Java

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
            System.out.println(ob.pairCubeCount(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int pairCubeCount(int N) {
        // code here
        //https://ide.geeksforgeeks.org/nigolVCZuQ
        int count =0;
        for(int i =1;i<=Math.cbrt(N);i++)
        {
           int  cb = i*i*i;
           int diff = N-cb;
           int cbrtDiff = (int) Math.cbrt(diff);

// If yes, then increment count
            if (cbrtDiff*cbrtDiff*cbrtDiff == diff)
             
                  count++;
    }
 return count; 
        }
};
