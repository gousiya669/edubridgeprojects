package com.edubridge.arrays;

public class Displayarray {

	public static void main(String[] args) {
		 int arr_num[]={4,2,6,2,1};
		   System.out.println("Length of arr_num:"+arr_num.length);
		   System.out.println("Display arr_num");
		   for(int i=0;i<arr_num.length;i++) {
			   System.out.println(arr_num[i]);
			   
		   }
		   System.out.println("Displaying arr_num in reverse order:");
		   for(int i=arr_num.length-1;i>=0;i--) {
			   System.out.println(arr_num[i]);
			   
			}
		   System.out.println("Displaying arr_num using for-each:");
		   for(int num:arr_num) {
			   System.out.println(num);
		   }

		
	}

}
