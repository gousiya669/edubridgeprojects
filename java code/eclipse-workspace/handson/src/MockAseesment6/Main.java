package MockAseesment6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any date in the format [dd/MM/yyyy] :");
                String strDate=sc.next();
		System.out.println("The required weekday is "+UserMainCode.getNextMonthDay(strDate));

	}

}
