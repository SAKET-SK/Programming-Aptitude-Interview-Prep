import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
        if(den1==den2){
            System.out.println(""+(num1+num2)+"/"+den1);
        }
        else{
            int hcf = 0;
            if(den1<den2) hcf = gcd(den1,den2);
            else hcf = gcd(den2,den1);
            int lcm = (int)((den1*den2)/hcf);
            num1 = num1*(lcm/den1);
            num2=num2*(lcm/den2);
            num1 = num1+num2;
            int gc = 0;
            if(num1>lcm){
                gc = gcd(lcm,num1);
            }
            else{
                gc = gcd(num1,lcm);
            }
            num1/=gc;
            lcm/=gc;
            System.out.println(""+(num1)+"/"+lcm);
        }
    }
    int gcd(int a, int b){
        if(b%a==0) return a;
        else return gcd(b%a,a);
    }
}
