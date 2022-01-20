//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthEvenFibonacci(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static final long mod = 1000000007;
    static long nthEvenFibonacci(long n){
        long b = 1;
        long c = 2;
        for(long i = 1 ; i < n; i++){
            long nextA = (c + b)%mod;
            long nextB = (nextA + c)%mod;
            c = (nextA + nextB)%mod;
            b = nextB;
        }
        return c;
    }
}
