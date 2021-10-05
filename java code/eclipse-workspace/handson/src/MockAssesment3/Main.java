package MockAssesment3;

import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 strings :");
    String str1=sc.next();
    String str2=sc.next();
    if(UserMainCode.checkAnagram(str1,str2))
      System.out.println("The strings are anagrams");
    else
     System.out.println("The strings are not anagrams");
  }
}