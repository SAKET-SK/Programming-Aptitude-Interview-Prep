//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int d = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int y = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.getDayOfWeek(d,m,y));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
   static String getDayOfWeek(int d, int m, int y) 
   {
       
    
     String days[] ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday",}; 
     //k is  the day of the month.
     //m is the month number.
     //D is the last two digits of the year.
     //C is the first two digits of the year.
         if(m<3)
       {
           m+=12;
           y-=1;
       }
     int k = d;

     int D = y%100;
     int C = y/100;
     int x =(C/4-2*C+D+D/4+13*(m+1)/5+k-1)%7;
     int val = x%7;
     if(val<0)
     {
         int num = val/7;
         num = num-1;
         int num2 = num*7;
         int num3 = val-num2;
         return days[num3];
     }
     return days[x%7];
   }
};
