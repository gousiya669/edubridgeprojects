package MockAssesment1;

import java.util.StringTokenizer;

public class UsermainCode {
	  public static boolean validateIP(String ipAddress)
	  {
		  boolean valid=true;
		  //Insert code here to validate the 'ipAddress'
		  StringTokenizer st=new StringTokenizer(ipAddress);
		  int cnt=0,IPV4=0;
		  while(st.hasMoreTokens())
		  {
			 String s=st.nextToken(":");
			 int a=Integer.parseInt(s);
			 IPV4++;
			 
			   if(a>=0 && a<=255)
			   {
				   cnt=0;
			   }
			   else
			   {
				   cnt=1;
				   break;
			   }
		  }
		  if(cnt==0 && IPV4==4)
		  {
			  return valid;
		  }
		  else
		  {
			  valid=false;
		  }
		  return valid;
	  }

}
