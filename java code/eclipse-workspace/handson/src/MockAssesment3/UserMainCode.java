package MockAssesment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserMainCode {
public static boolean checkAnagram(String s1, String s2)
{
   boolean valid=true;
   char[] ch1=s1.toCharArray();
   char[] ch2=s2.toCharArray();
    //Insert code here to check if the 2 strings are anagrams.
    List l1=new ArrayList();
    List l2=new ArrayList();
    
    for(int i=0;i<ch1.length;i++)
    {
    	l1.add(ch1[i]);
    }
    for(int i=0;i<ch2.length;i++)
    {
    	l2.add(ch2[i]);
    }
    Collections.sort(l1);
    Collections.sort(l2);
    
    if(l1.equals(l2))
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
