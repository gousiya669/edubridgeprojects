package MockAssesment1;

import java.util.Scanner;
import java.util.StringTokenizer;
public class Ipv4
{
  public static boolean validateIP(String ipAddress)
  {
    boolean valid=true;
    //Insert code here to validate the 'ipAddress'
    StringTokenizer st=new StringTokenizer(ipAddress);
    int count=0,ipv4=0;
    while(st.hasMoreTokens())
    {
	String s=st.nextToken(":");
	int a=Integer.parseInt(s);
       ipv4++;
	if(a>=0 && a<=255)
              count=0;
	else
	{
	     count=1;
	     break;
	}
      }
      if(count==0 && ipv4==4)
	   return valid;
	else
	   valid=false;

 return valid;
}
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a valid ip address in the ipV4 format :");
   String ipAddress=sc.next();
   if(Ipv4.validateIP(ipAddress))
     System.out.println("Valid ip");
   else
    System.out.println("Invalid ip");
 }
}
