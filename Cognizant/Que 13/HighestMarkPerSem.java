import java.util.*;
import java.lang.*;
import java.io.*;

class HighestMarkPerSem
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of semester:");
        int sems = sc.nextInt();
        boolean incorrect = false;
        int arr[] = new int [sems];
        for(int i=0;i<sems;i++)
        {
            System.out.println("Enter no of subjects in "+(i+1)+" semester:");
            arr[i]=sc.nextInt();
        }

        int maxMarks[] = new int[sems];
        for(int i=0;i<sems;i++)
        {
            System.out.println("Marks obtained in semester "+(i+1)+":");
            int max = sc.nextInt();

            if(max<0||max>100)
            {
                System.out.println("You have entered invalid mark.");
                System.exit(0);
            }

            for(int j=1;j<arr[i];j++)
            {
                int marks=sc.nextInt();
                if(marks<0||marks>100)
                {
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
                if(max<marks)
                max=marks;
            }
            maxMarks[i]= max;   
        }
        for(int i=0;i<sems;i++)
        {
            System.out.println("Maximum mark in "+(i+1)+" semester:"+maxMarks[i]);
        }
    }
}
