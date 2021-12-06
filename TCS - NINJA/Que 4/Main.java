/* Write a progam in java and check if a number which is entered is prime number or not. However if the number
happens to be negative then we must ask the user to enter a positive number again*/


import java.util.Scanner;
class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
//First we will ask the user to enter a number
System.out.println("Enter value to be evaluated : ");
int n = sc.nextInt();
//create object of class CheckPrime
Main prime=new Main();
//calling function with value n, as parameter
prime.verify(n);
}
//function for checking number is positive or negative 
void verify(int n)
{
if(n<0)
System.out.println("Negative number detected enter positive number");
else
calc(n);
}
//creating function for checking prime or not
void calc(int n)
{
int x=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
++x;
}
if(x>=1)
System.out.println("The number that you have entered is not prime");
else
System.out.println("The number that you have entered is prime");
}
}
