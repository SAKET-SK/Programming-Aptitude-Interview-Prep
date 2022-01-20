// { Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int count(int N) 
    { 
        // code here
       if(N%2==1) return 0;
      
    else if(N==0)
     return 1;
    int res=0;
    
    for(int i=0;i<N;i+=2)
     res+=count(i)*count(N-2-i);
     
    return res;
    }
};
