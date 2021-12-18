import java.util.*;
class Solution
{
     public static void main(String[] args)
     {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of rows");
           int row=sc.nextInt();
           System.out.println("Enter the number of columns");
           int col=sc.nextInt();
           int matrix[][]=new int[row][col];
           System.out.println("Enter the elements of matrix");
           for(int i=0;i<row;i++)
              for(int j=0;j<col;j++)
                  matrix[i][j]=sc.nextInt();
           int max=Integer.MIN_VALUE;
           
            System.out.println("Max Value of each row");
           for(int i=0;i<row;i++)
           {
                    max=Integer.MIN_VALUE;
                    for(int j=0;j<col;j++)
                        max=Math.max(max,matrix[i][j]);
                    System.out.print(max+" ");
            }   
     }
}
