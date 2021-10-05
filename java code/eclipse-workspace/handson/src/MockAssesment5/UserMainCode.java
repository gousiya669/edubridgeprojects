package MockAssesment5;

import java.util.*;

public class UserMainCode {
	
	public static Map<String,String> getCompanyCode(Map<String,String>map)
	{
	       
			//Insert the code to remove all the entries from the 
                        //map whose numeric part of the keys are completeley divisible by 3
		Map<String,String> res=new HashMap<String,String>();
		for(String s:map.keySet())
		{
			String[] st=s.split("-");
			
			String str=st[st.length-1];
			int num=Integer.valueOf(str);
			
			if(num%3!=0)
			{
				res.put(s,map.get(s));
			}
		}
			return res;
			
	}

} 
