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
            System.out.println(ob.isPrime(N));
        }
    }
}// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
        int j=1;
        for(int i=2;i<N/2;i++){
            if(N%i==0){
                j=0;
                break;
            }
        }
        if(N==1){
            j=0;
        }
        return j;
    }
}
