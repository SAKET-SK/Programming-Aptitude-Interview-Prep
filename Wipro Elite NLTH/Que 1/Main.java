import java.util.*;
class Main 
{
    static int size=4;
    public static boolean areSame(int A[][], int B[][])
    {
        int i,j;
        for(i=0;i<size;i++)
        {
            for(j=0;j<size;j++)
                if(A[i][j]!=B[i][j])
                    return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int A[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        int B[][]={{1,1,1,1},{2,2,2,2},{3,3,3,3,},{4,4,4,4}};
        if(areSame(A,B))
        {
            System.out.println("Matrices are identical");
        }
        else 
            System.out.println("Matrices are not identical");
    }
}
