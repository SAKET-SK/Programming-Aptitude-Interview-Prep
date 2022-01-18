// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A1 = Integer.parseInt(S[0]);
            int A2 = Integer.parseInt(S[1]);
            int N = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.nthTermOfAP(A1, A2, N));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        return A1+(N-1)*(A2-A1);
    }
}
