package com.edubridge.CollectionList;

import java.util.Iterator;
import java.util.LinkedList;

import com.edubridge.modal.country;

public class CountryLinkedList {

	public static void main(String[] args) {
		 LinkedList<country> counLinkedList = new LinkedList<>();

		 counLinkedList.add(new country(3,"India",91));
		 counLinkedList.add(new country(2,"UAE",971));
		 counLinkedList.add(new country(1,"Brazil",55));


		 
		 counLinkedList.addFirst(new country(5,"Australia",61));
		 
		 System.out.println(counLinkedList +" " +counLinkedList.size());
		 
		 Iterator<country> it = counLinkedList.iterator();
		 while(it.hasNext()) {
			
			 System.out.println(it.next());
		 }
		 
		 
		 
	}
}
