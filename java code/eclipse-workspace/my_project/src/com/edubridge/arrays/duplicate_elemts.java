package com.edubridge.arrays;

public class duplicate_elemts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr_num[]= {2,3,6,2,4,3};
		  
		  System.out.println(" Duplicate elements in arr_num are:");
		  
		  for(int i=0;i<arr_num.length;i++) {
			  for( int j=i+1;j<arr_num.length;j++) {
				  if(arr_num[i]==arr_num[j]) {
					  System.out.println(arr_num[i]);
				  }
			  }
		  }
			}

		}
