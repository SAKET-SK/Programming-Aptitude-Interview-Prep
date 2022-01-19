//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static long jumpingNums(long X) {
        long largest =0l;
        for(int i =1;i<=9 && i<=X;i++)
        {
            long largestfor = bfs (X,i);
            largest = largestfor>largest?largestfor:largest;
        }
        return largest;
        // code here
    }
    static long bfs(long X, int i)
    {
        long largest = 0l;
        Queue<Long> q = new LinkedList<>();
        q.add(Long.valueOf(i));
        while(!q.isEmpty())
        {
            long num = q.poll(); //poll() method in Java is used to retrieve or fetch and remove the first element of the Queue 
            //or the element present at the head of the Queue.
            //The peek() method only retrieved the element at the head but the poll() also removes the element along with the retrieval.
            //It returns NULL if the queue is empty.
            if(num <= X)
            {
                largest = num >largest? num:largest;
                long lastDigit = num%10;
                if(lastDigit == 0){
                    q.add(10l*num+(lastDigit+1));
                }else if (lastDigit == 9)
                {
                    q.add(10l*num+(lastDigit-1));
                }else
                {
                    q.add(10L*num + (lastDigit-1));
                    q.add(10L*num + (lastDigit+1));
                }
            }
        }
        return largest;
        //read here to understand;
        //https://www.geeksforgeeks.org/print-all-jumping-numbers-smaller-than-or-equal-to-a-given-value/
    }
};
