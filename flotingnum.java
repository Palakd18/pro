package Assigment1;

import java.util.Scanner;

// program to write multi of two floating point number
public class flotingnum 
{
	public static void main(String[]args)
	{
		float a,b,r;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number here :- ");
		a=sc.nextFloat();
		
		System.out.println("Enter the second number here :- ");
		b=sc.nextFloat();
		
		r=a*b;
		System.out.println("the answer of the equation is here :- " +r);
		
	}

}
