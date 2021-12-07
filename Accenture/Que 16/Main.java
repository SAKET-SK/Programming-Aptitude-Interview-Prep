import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
	  	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any No:");
		int no = sc.nextInt();
		int sum=0,value=1;
		for(int i=1 ; i<=10 ; i++) {
			value = no*i;
			System.out.print(value+" ");
			sum=sum+value;
		}
		System.out.println("\nSum is : "+sum);
	}
}
