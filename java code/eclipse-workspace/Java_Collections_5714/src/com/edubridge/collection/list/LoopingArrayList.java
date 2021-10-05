package com.edubridge.collection.list;

import java.util.ArrayList;

public class LoopingArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Azmina");
		list.add("Gayathri");
		list.add("Jay");
		
		System.out.println("Displaying list using for loop: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n\nDisplaying list using enchanced for loop: ");
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println("\n\nDisplaying list using while loop: ");
		int i = 0;
		while(i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("\n\nDisplaying list using Stream API forEach loop: ");
		list.forEach(name ->{
			System.out.println(name);
		});

	}

}
