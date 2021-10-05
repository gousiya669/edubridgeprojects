package com.edubridge.CollectionList;

import java.util.ArrayList;

public class ManupilatingArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("sheeba");
		list.add("azmina");
		list.add("sadaf");
		System.out.println("size and list:" +list.size()+"" +list);
		
		list.add(1,"nithila");
		System.out.println("size and list:" +list.size()+"" +list);
		list.remove(0);
		System.out.println("size and list:" +list.size()+"" +list);
		String name = list.get(2);
		System.out.println("name at index position 2 is:" +name);
		boolean checkIfArunExists = list.contains("Arun");
		System.out.println("is arun in the list:" +checkIfArunExists);
		
	}

}
