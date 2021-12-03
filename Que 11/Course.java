import java.util.*;

class Course
{
    public static void main(String[] args)
    {
        int n=0,flag=0;
        String courseSearch;
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter no of course:");
        n= sc.nextInt();
        if(n<=0||n>20)
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        System.out.println("Enter course names:");
        String[] course = new String[n];      
        sc.nextLine();   
        for (int i = 0; i < course.length; i++)   
        {  
            course[i] = sc.nextLine();  
        }  
        System.out.println("Enter the course to be searched:");
        courseSearch=sc.nextLine();
        for (int i = 0; i < course.length; i++)   
        {  
            if(course[i].equals(courseSearch))
            {
                flag=1;
            }
        }  
      
        if(flag==1)
        {
                System.out.println(courseSearch+" course is available");
        }
        else
        {
                System.out.println(courseSearch+" course is not available");
        }
    }
}
