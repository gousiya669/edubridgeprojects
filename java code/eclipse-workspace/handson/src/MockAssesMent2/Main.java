package MockAssesMent2;

import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a multi digit number:");
    int num=sc.nextInt();
    if(UserMainCode.isIncreasing(num))
      System.out.println("Increasing number");
    else
     System.out.println("Not an increasing number");
  }
}