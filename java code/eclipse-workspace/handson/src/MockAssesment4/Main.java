package MockAssesment4;


import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a line :");
    String line=sc.nextLine();
    UserMainCode.printSecondLongestWords(line);
  }
}
