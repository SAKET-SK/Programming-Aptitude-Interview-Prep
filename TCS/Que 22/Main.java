import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three words : ");
				
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();

		int l1 = s1.length();
		int l2 = s2.length();

		String str1 = "";
		String str2 = "";
		String str3 = "";
		char c;
		for(int i = 0 ; i < l1 ; i++)
		{
			c = s1.charAt(i);
			if(c == 'A' || c == 'a' || c == 'E' || 
                           c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
			str1 = str1 + "%";
			else
			str1 = str1 + c;
		}
		for(int i = 0 ; i < l2 ; i++)
		{
			c = s2.charAt(i);
			if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z'))
			{
				if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || 
                            c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
					str2 = str2 + c;
				else
					str2 = str2 + "#";
			}
			else
				str2 = str2 + c;
		}
		str3 = s3.toUpperCase();
		System.out.println(str1+str2+str3);
	}
}
