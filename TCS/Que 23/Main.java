import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1 : ");				
		int num1 = sc.nextInt();
		System.out.print("Number 2 : ");				
		float num2 = sc.nextFloat();
		float sum = num1 + num2;
		System.out.println("Sum = "+sum);
	}
}
