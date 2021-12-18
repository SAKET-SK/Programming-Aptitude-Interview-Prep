import java.util.*;
public class Main{

	public static boolean balancedParenthesis(String str)
	{
		
		Stack<Character> stack= new Stack<Character>();

		for (int i = 0; i < str.length(); i++)
		{
			char x = str.charAt(i);
			if (x == '(' || x == '[' || x == '{')
			{
				stack.push(x);
				continue;
			}

			if (stack.isEmpty())
				return false;
			char check;
			switch (x)
			{
            	           case ')':
	            		    check = stack.pop();
				            if (check == '{' || check == '[')
					            return false;
				            break;
    			   case '}':
				            check = stack.pop();
				            if (check == '(' || check == '[')
					            return false;
				            break;
    			   case ']':
	            			check = stack.pop();
				            if (check == '(' || check == '{')
					            return false;
				                    break;
			}   
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if (balancedParenthesis(str))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
