import java.util.*;
class Main
{
    public static void maxInArray (int arr[], int length) 
    {
        int max = arr[0], index = 0;
        
        for (int i = 1; i < length; i++)
            if (arr[i] > max)
        	{
                max = arr[i];
                index = i;
            }
    
        System.out.println (max);

        System.out.println (index);
    }
    public static void main (String[]args) 
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
    
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
    
        maxInArray (arr, arr.length);
    } 
} 
