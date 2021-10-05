package com.edubridge.arrays;

public class smalllarge_elemts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr_num[]= {2,3,6,2,4,3};
		  int max=arr_num[0];
		  int min=arr_num[0];
		  
		  for(int i=0;i<arr_num.length;i++) {
			  if(max<arr_num[i]) {
				  max=arr_num[i];
			  }
		  }
		  
		  
		  System.out.println("Largest element in arr_num are:"+max);
		  for(int i=0;i<arr_num.length;i++) {
			  if(min>arr_num[i]) {
				  min=arr_num[i];
			  }
		  
			}
		  System.out.println("Smallest element in arr_num are:"+min);
			}
		}