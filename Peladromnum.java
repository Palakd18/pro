package Assigment1;

public class Peladromnum {
	{
		int l,a,sum=0,i=121;
		a=i;
		while(i>0)
		{
		System.out.println("enter number" +a);
		l=i%10;
		sum=(sum*10)+l;
		i=i/10;
		}
		if(a==sum)
		System.out.println("number is palindrom number");
		else
		System.out.println("number is not palindrom number");
		}
		}

