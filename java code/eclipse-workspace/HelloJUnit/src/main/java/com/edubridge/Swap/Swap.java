package com.edubridge.Swap;

public class Swap {
	  public String swap(String str) {
		  //str = ABCD ->result = ABDC
		  //LENGTH = 4, 1ST char 0th position -> 0 to 3
		  
		  String str1 = str.substring(0, str.length()-2); //AB
		  char secondLastChar = str.charAt(str.length()-2); //c
		  char lastChar =str.charAt(str.length()-1);//d
		  
		return str1+lastChar+secondLastChar;
		  
		  
		
	  }
	}