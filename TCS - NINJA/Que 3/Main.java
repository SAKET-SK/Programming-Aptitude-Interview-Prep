import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		String s=sin.nextLine();
		
                long num = 0, num1 = 0;
		num=num + s.charAt(0)-'0';
		
                for(int i=1;i<s.length();i++)
		{
		    if(i%2==0)
		        num = num + s.charAt(i)-'0';
		   else
		     num1 = num1 + s.charAt(i)-'0';
		}
		System.out.println(Math.abs(num-num1));
	}
}
