package test;

import java.util.Scanner;

public class Example {
	public static void main(String[] args)
	{
		int i,sum=0,count=0;
		System.out.println("enter the num");
		Scanner num = new Scanner(System.in);
		int nu= num.nextInt();
		if(isPrime(nu))
		{
		System.out.println("prime");	
		}
		else
		{
		System.out.println("not prime");
		}
	}

private static boolean isPrime(int nu)
{
for (int i=2; i<= nu/2; i++)
{
	if(nu % i==0)
	{
		return false;
	}
}
return true;
}
}