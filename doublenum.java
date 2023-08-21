package Assigment1;
// program for write sum of two decimal number
import java.util.Scanner;

public class doublenum {
	public static void main(String[]args)
	{
		double a,b,sum;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number here :- ");
		a=sc.nextDouble();
		
		System.out.println("Enter the second number here :- ");
		b=sc.nextDouble();
		
		sum=a+b;
		System.out.println("the answer of given equation :- " +sum);
	}

}
