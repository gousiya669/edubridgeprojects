package com.edubridge.arrays;

public class evenoddelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr_num[]= {2,3,6,2,4,3};
	       System.out.println("Elements in even possition in arr-num:");
	       
	       for(int i=0;i<arr_num.length;i+=2) {
	    	   System.out.println(arr_num[i]);
	       }
	       System.out.println("Elements in odd position in arr_num:");
	       for(int i=1;i<arr_num.length;i+=2) {
	    	   System.out.println(arr_num[i]);
	       
		}
		}
	}
