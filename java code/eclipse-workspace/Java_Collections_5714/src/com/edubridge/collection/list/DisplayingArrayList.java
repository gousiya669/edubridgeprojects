package com.edubridge.collection.list;

import java.util.ArrayList;

public class DisplayingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Azmina");
		list.add("Gayathri");
		list.add("Jay");
		
		System.out.println(list);
		
		System.out.println("Number of elements in List: "+list.size());
		
		//list.add(10); //After making the list string specific, this gives error
		//System.out.println(list);
		//System.out.println("Number of elements in List: "+list.size());
		

	}

}
