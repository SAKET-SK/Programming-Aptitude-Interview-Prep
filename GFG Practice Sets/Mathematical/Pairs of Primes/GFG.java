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
            int[] ans = ob.prime_pairs(n);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends




class Solution
{
    public int[] prime_pairs(int n)
    {
        // Code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int abc[]={};
        if (n==1)
            return abc;
        for(int i=2;i<=n;i++)
            if(isPrime(i))
                arr.add(i);
        for(int i=0;i<arr.size();i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                if(arr.get(i)*arr.get(j)<=n)
                {
                    ans.add(arr.get(i));
                    ans.add(arr.get(j));
                }
            }
        }
        int[] ret = new int[ans.size()];
        for(int i = 0;i < ans.size();i++)
                ret[i] = ans.get(i);
        return ret;
        // return ans;
    }
    public boolean isPrime(int a)
    {
        if(a==2 || a==3)
            return true;
        int i=2;
        while(i*i<=a)
        {
            if(a%i==0)
                return false;
            else
                i+=1;
        }
        return true;
    }
    
}
