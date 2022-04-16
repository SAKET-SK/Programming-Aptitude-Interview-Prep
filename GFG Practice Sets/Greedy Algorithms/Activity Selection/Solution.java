// { Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}

// } Driver Code Ends


class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
         List<List<Integer>> activity = new ArrayList<>();
       for(int i = 0 ; i < n; i++){
           List<Integer> act = new ArrayList<>();
           act.add(start[i]);
           act.add(end[i]);
           activity.add(act);
       }
       activity.sort(new Comparator<List<Integer>>() {
       @Override
       public int compare(List<Integer> o1, List<Integer> o2) {
           if (o1.get(1) > o2.get(1)) {
               return 1;
           }
           else if(o1.get(1) < o2.get(1)) {
               return -1;
           }
        else if (o1.get(1).equals(o2.get(1)) && 
           o1.get(0) > o2.get(0)) {
               return 1; 
           }
           else if(o1.get(1).equals(o2.get(1)) && 
           o1.get(0) < o2.get(0)){
               return -1;
               }
           return 0;
       }});
       int i = 0, res = 1;
       for(int j = 1 ; j < n ; j++){
           if(activity.get(j).get(0) > activity.get(i).get(1)){
               i = j;
               res++;
           }
       }
       return res;
    }
}
