import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows of matrix");
         int row=sc.nextInt();
         System.out.println("Enter the number of columns of a matrix");
         int col=sc.nextInt();
         int matrix[][]=new int[row][col];
         System.out.println("Enter the elements of a matrix");  
         for(int i=0;i<row;i++)
           for(int j=0;j<col;j++)
             matrix[i][j]=sc.nextInt();
  
         int result[][]=new int[col][row];
         for(int i=0;i<col;i++)
             for(int j=0;j<row;j++)
               result[i][j]=matrix[j][i];
         
          System.out.println("Transpose of a matrix ");
          for(int i=0;i<col;i++)
          {
                for(int j=0;j<row;j++)
                   System.out.print(result[i][j]+" ");
                 System.out.println();
           }
    }
}
