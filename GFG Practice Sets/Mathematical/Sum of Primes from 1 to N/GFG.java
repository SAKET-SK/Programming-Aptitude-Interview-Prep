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
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends



class Solution

{

static boolean isPrime(int n)

{

if (n <= 1)

return false;

for (int i = 2; i*i <= n; i++)

if (n % i == 0)

return false;

return true;

}

public long prime_Sum(int n)

{

long count = 0;

for(int i = 2; i <= n; i++)

{

if(isPrime(i)){

count += i;

}

}
return count;
}
}
