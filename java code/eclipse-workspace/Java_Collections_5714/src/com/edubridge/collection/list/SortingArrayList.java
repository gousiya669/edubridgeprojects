package com.edubridge.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Syed");
		strList.add("Asma");
		strList.add("Sheeba");
		strList.add("Harish");
		strList.add("Arun");
		//strList.add("arun");
		
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(200);
		intList.add(125);
		intList.add(20);
		intList.add(400);
		
		Collections.sort(intList);
		System.out.println(intList);

	}

}
