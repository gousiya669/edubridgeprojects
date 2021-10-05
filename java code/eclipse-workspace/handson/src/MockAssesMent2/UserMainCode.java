package MockAssesMent2;

public class UserMainCode {
	public static boolean isIncreasing(int num)
	   {
	     boolean valid=true;
	     //Insert code here to check if the number is an increasing number
	     String str=String.valueOf(num);
	     char[] ch=str.toCharArray();
	     for(int i=0;i<ch.length-1;i++)
	     {
	    	 if(ch[i]<ch[i+1])
	    	 {
	    		 continue;
	    	 }
	    	 else
	    	 {
	    		 valid=false;
	    	 }
	   }
	     return valid;
	}


}
