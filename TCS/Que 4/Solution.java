import java.util.*;
class Solution
{
     public static void main(String[] args)
     {
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int col=sc.nextInt();
                int arr[][]=new int[row][col];
                
                for(int i=0;i<row;i++)
                      for(int j=0;j<col;j++)
                                   arr[i][j]=sc.nextInt();
              
                 int max=0,count=0,index=0;
                 for(int i=0;i<row;i++)
                 {       count=0;
                          for(int j=0;j<col;j++)
                          {
                                  if(arr[i][j]==1)
                                       count++;      
                            }
                           if(count>max)
                           {
                                  max=count;
                                  index=i+1;
                           }
                  }
                  System.out.println(index);
      }
}
