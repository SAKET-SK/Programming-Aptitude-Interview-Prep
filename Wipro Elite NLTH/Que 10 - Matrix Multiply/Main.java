import java.util.*;
public class Main
{
    public static void matrixMultiply(int r1,int c1,int mat1[][],int r2,int c2,int mat2[][])
    {
        
        int i, j, k;
        int mat3[][] = new int[r1][c2];
  

        for (i = 0; i < r1; i++) 
        {
            for (j = 0; j < c2; j++) 
            {
                for (k = 0; k < r2; k++)
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
  
     
        System.out.println("\nResultant Matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
                System.out.print(mat3[i][j]+" ");
            System.out.println();
        }
  
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rows of first matrix ");
	    int row1=sc.nextInt();
	    System.out.println("Enter the number of columns of first matrix ");
	    int col1=sc.nextInt();
	    System.out.println("Enter the elements of first matrix");
	    
	    int matrix1[][]=new int[row1][col1];
	    for(int i=0;i<row1;i++)
	    {
	        for(int j=0;j<col1;j++)
	        {
	            matrix1[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("Enter the number of rows of second matrix ");
	    int row2=sc.nextInt();
	    System.out.println("Enter the number of columns of second matrix ");
	    int col2=sc.nextInt();
	    System.out.println("Enter the elements of second matrix");
	    
	    int matrix2[][]=new int[row2][col2];
	    for(int i=0;i<row2;i++)
	    {
	        for(int j=0;j<col2;j++)
	        {
	            matrix2[i][j]=sc.nextInt();
	        }
	    }
	    
	    matrixMultiply(row1,col1,matrix1,row2,col2,matrix2);
	}
}
