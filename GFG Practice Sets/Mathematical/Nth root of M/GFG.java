//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public double multiply(double number, int n){
        double ans = 1;
        for(int i = 0; i < n; i++){
            ans *= number;
        }
        return ans;
    }
    
    public int NthRoot(int n, int m){
        
        double low = 1.0;
        double high = m;
        double eps = 1e-8;
        
        while((high - low) > eps){
            double mid = low + (high - low) / 2;
            double range = multiply(mid, n);
            if(range < (double)m){
                low = mid;
            }else{
                high = mid;
            }
        }
        // System.out.println(low + " " + high);
        return (high - Math.floor(high)) < 1e-8 ? (int)high : -1;
    }
}
