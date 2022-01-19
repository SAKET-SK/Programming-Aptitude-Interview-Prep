// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
   static ArrayList<Integer> sieveOfEratosthenes(int N){
       boolean[] criba = new boolean[N+1];
       ArrayList<Integer> primes = new ArrayList<Integer>();
       primes.add(2);
       for(int i=3; i<=N; i+=2){
           if(!criba[i]){
               primes.add(i);
               for(int j=i*i;j<=N;j+=2*i){
                   criba[j]=true;
               }
           }
       }
       return primes;
   }
}
