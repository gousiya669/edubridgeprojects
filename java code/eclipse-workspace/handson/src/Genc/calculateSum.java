package Genc;
import java.util.Scanner;
public class calculateSum
{
	public static void main(String[] args)
	{	
		int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Number :");
	     n=sc.nextInt();
	    for(int sum=0; sum<n; sum++)
		{
			if(sum % 3 == 0 || sum % 5 == 0)
				System.out.println(sum + " ");
			
		}
	}
	
}