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
            String S[] = read.readLine().split(" ");
            int p[] = new int[2];
            int q[] = new int[2];
            int r[] = new int[2];
            int s[] = new int[2];
            p[0] = Integer.parseInt(S[0]);
            p[1] = Integer.parseInt(S[1]);
            q[0] = Integer.parseInt(S[2]);
            q[1] = Integer.parseInt(S[3]);
            r[0] = Integer.parseInt(S[4]);
            r[1] = Integer.parseInt(S[5]);
            s[0] = Integer.parseInt(S[6]);
            s[1] = Integer.parseInt(S[7]);
            Solution ob = new Solution();
            int ans = ob.doOverlap(p, q, r, s);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
        // code here
        if(L2[0]>R1[0]||L1[0]>R2[0]||L1[1]<R2[1]||L2[1]<R1[1])
                return 0;
       return 1;
    }
};
