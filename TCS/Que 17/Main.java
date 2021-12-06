/*Java program to check whether a year entered by user is a leap year or not and a leap year is a year
which is completely divisible by 4,but the year should not be a century year except it is divisible by 400*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		//scanner class declaration
                Scanner sc=new Scanner(System.in);
		//input year from user
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		//condition for checking year entered by user is a leap year or not
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                        System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
        }
}
