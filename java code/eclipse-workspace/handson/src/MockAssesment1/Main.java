package MockAssesment1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a valid ip address in the ipV4 format :");
	    String ipAddress=sc.next();
	    if(UsermainCode.validateIP(ipAddress))
	      System.out.println("Valid ip");
	    else
	     System.out.println("Invalid ip");
	  }
	}



