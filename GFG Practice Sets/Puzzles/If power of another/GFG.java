//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            Long X=Long.parseLong(inp[0]);
            Long Y=Long.parseLong(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.isPowerOfAnother(X,Y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static Long isPowerOfAnother(Long X, Long Y){
        // code here
        for(long i=0;i<=Y;i++)
        {
            if(Math.pow(X,i) == Y)
            {
                return 1l;
            }
        }
        return 0l;
    }
}
