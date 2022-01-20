//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.remove(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    void helper(StringBuffer s, int n){
        int k=0,i=1;
        for(; i<n; i++){
            if(s.charAt(i)!=s.charAt(i-1))
                s.setCharAt(k++,s.charAt(i-1));
            else{
                while(i<n && s.charAt(i)==s.charAt(i-1))
                    i++;
            }
        }
        if(i<=n)
            s.setCharAt(k++,s.charAt(i-1));
        s.delete(k,n);
        if(k!=n)
            helper(s, s.length());
    }
    String remove(String s) {
        StringBuffer sb = new StringBuffer(s);
        helper(sb,s.length());
        return sb.toString();
    }
}
