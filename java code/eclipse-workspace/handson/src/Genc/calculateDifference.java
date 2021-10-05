package Genc;
import java.util.Scanner;
public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for :");
		n=sc.nextInt();
		
		x=(n* (n+1) * (2*n+1))/6;
		y=(n * ( n+1)) /2;
		y=y * y;
		z=Math.abs(x-y);
		System.out.println("Diffrence is :" + z);
	}

}
