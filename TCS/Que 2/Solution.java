import java.util.*;
public class Solution
{
 	public static void main(String[] args)
 	{
        		Scanner sc=new Scanner(System.in);
        		String str=sc.next();
        		int count1=0,count2=0;
        		for(int i=0;i<str.length();i++)
        		{
                 		if(str.charAt(i)=='*')
                        		count1++;
                 		else if(str.charAt(i)=='#')
                         		count2++;
        		}
        		System.out.println(count1-count2);
	}
}
