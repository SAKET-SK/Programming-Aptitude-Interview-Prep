import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long min = Math.min(A, B);
        Long max = Math.max(A, B);
        TreeSet<Long> ts = new TreeSet<>();
        for(int i = 1; i * i <= min; i++){
            if(min % i == 0){
                ts.add((long)i);
                ts.add(min / (long)i);
            }
        }
        Long gcd = (long)1;
        for(Long i : ts){
            if(max % i == 0){
                gcd = i;
            }
        }
        Long lcm = (A * B) / gcd;
        return new Long[]{lcm, gcd};
    }
};
