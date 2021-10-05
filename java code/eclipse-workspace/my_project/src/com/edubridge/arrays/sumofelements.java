package com.edubridge.arrays;

public class sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_num[]= {2,3,6,2,4,3};
	    int sum=0;
	    for(int i=0;i<arr_num.length;i++) {
	    	sum+=arr_num[i];
	    
	    }
	    System.out.println("Sum of arr_num:"+sum);
	    sum=0;
	    for(int num:arr_num) {
	    	sum+=num;
	    }
	    System.out.println("Sum of arr_num using for-each:"+sum);

	}

}
