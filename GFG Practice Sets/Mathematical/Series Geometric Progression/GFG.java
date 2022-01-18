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
            String s1 = br.readLine().trim();
            String[] s2 = s1.split(" ");
            int a = Integer.parseInt(s2[0]);
            int r = Integer.parseInt(s2[1]);
            int n = Integer.parseInt(s2[2]);
            Solution ob = new Solution();
            int ans = ob.Nth_term(a, r, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution
{
    public static final int mod = (int)1e9+7;
    public int Nth_term(int a, int r, int n)
    {
        long pow = power(r,n-1);
        pow = ((a%mod) * (pow%mod))%mod;
        
        return (int)(pow % mod);
    }
    
    public long power(long a, int b){
        if(b == 0) return 1;
        long result = 1;
        while(b > 0){
            if((b & 1) == 1) {
                result = ((result%mod) * (a%mod))%mod;
            }
            a = ((a%mod) * (a%mod))%mod;
            b = b >> 1;
        }
        return result;
    }
}
