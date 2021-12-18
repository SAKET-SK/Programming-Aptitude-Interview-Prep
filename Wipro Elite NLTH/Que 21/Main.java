import java.util.*;
class Main 
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        int list[]=new int[num];
        
        for(int i=0;i<num;i++)
            list[i]=sc.nextInt();
        
        boolean flag=false;
        for(int i=0;i<num;i++)
        {
            if(list[i]>start && list[i]<end)
            {
                flag=true;
                System.out.print(i+" ");
            }
        }
        
        if(flag==false)
            System.out.println("-1");
    }
}
