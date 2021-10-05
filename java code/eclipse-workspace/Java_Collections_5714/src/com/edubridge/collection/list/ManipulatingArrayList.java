package com.edubridge.collection.list;

import java.util.ArrayList;

public class ManipulatingArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Azmina");
		list.add("Gayathri");
		list.add("Jay");
		System.out.println("Size and List: "+list.size()+" "+list);
		
		list.add(1, "Nithila");
		System.out.println("Size and List: "+list.size()+" "+list);
		
		list.remove(0);
		System.out.println("Size and List: "+list.size()+" "+list);
		
		String name = list.get(2);
		System.out.println("Name at index position 2 is: "+name);
		
		boolean checkIfArunExists = list.contains("Arun");
		System.out.println("Is Arun in the list: "+checkIfArunExists);
		
		list.clear();
		System.out.println("Size and List: "+list.size()+" "+list);
	}

}
