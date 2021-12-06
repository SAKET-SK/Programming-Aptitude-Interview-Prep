import java.util.*;
 class Monkeys 
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int atebanana=0 ,atepeanut=0;
        if( n<0 && k<0 || j<0 || m<0 || p<0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            if(k>0)
            {
                 atebanana =m/k;
                 m=m%k;
            }
            if(j>0)
            {
                atepeanut = p/j; 
                p=p%j; 
            }
            n=n-atebanana-atepeanut;
            if((m!=0) || (p!=0))
                n=n-1;
            System.out.println("Number of Monkeys left on the Tree: "+n);
        }
    }
}
