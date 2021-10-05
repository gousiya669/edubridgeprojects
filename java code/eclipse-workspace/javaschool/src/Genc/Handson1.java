package Genc;

import java.util.Scanner;

public class Handson1 {
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ans=calculateSum(n);
	System.out.println("The sum of first n number is: "+ans);
	}

}
